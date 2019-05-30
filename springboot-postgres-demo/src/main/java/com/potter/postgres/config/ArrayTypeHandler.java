package com.potter.postgres.config;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeException;

/**
 * @author 梅长苏
 * @Description ----- 2019/5/17 2:16 PM
 */
@MappedJdbcTypes(JdbcType.ARRAY)
@MappedTypes(String[].class)
public class ArrayTypeHandler extends BaseTypeHandler<Object[]> {

  private static final String TYPE_NAME_VARCHAR = "varchar";
  private static final String TYPE_NAME_INTEGER = "integer";
  private static final String TYPE_NAME_BOOLEAN = "boolean";
  private static final String TYPE_NAME_NUMERIC = "numeric";

  @Override
  public void setNonNullParameter(PreparedStatement preparedStatement, int i, Object[] objects,
      JdbcType jdbcType) throws SQLException {

    String typeName = null;
    if (objects instanceof Integer[]) {
      typeName = TYPE_NAME_INTEGER;
    } else if (objects instanceof String[]) {
      typeName = TYPE_NAME_VARCHAR;
    } else if (objects instanceof Boolean[]) {
      typeName = TYPE_NAME_BOOLEAN;
    } else if (objects instanceof Double[]) {
      typeName = TYPE_NAME_NUMERIC;
    }

    if (typeName == null) {
      throw new TypeException("ArrayTypeHandler parameter typeName error, your type is " + objects.getClass().getName());
    }

    // 这3行是关键的代码，创建Array，然后ps.setArray(i, array)就可以了
    Connection conn = preparedStatement.getConnection();
    Array array = conn.createArrayOf(typeName, objects);
    preparedStatement.setArray(i, array);

  }

  @Override
  public Object[] getNullableResult(ResultSet resultSet, String s) throws SQLException {
    return getArray(resultSet.getArray(s));
  }

  @Override
  public Object[] getNullableResult(ResultSet resultSet, int i) throws SQLException {
    return getArray(resultSet.getArray(i));
  }

  @Override
  public Object[] getNullableResult(CallableStatement callableStatement, int i)
      throws SQLException {
    return getArray(callableStatement.getArray(i));
  }


  private Object[] getArray(Array array) {
    if (array == null) {
      return null;
    }
    try {
      return (Object[]) array.getArray();
    } catch (Exception e) {
    }
    return null;
  }
}

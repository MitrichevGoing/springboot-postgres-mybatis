package com.potter.postgres.config;

import com.alibaba.fastjson.JSON;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.postgresql.util.PGobject;

/**
 * @author 梅长苏
 * @Description ----- 2019/5/16 7:16 PM
 */

@MappedJdbcTypes(JdbcType.OTHER)
@MappedTypes(Object.class)
public class JSONTypeHandler extends BaseTypeHandler<Object> {

  private static final PGobject jsonObject = new PGobject();

  @Override
  public void setNonNullParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
    jsonObject.setType("jsonb");
    jsonObject.setValue(JSON.toJSONString(parameter));
    ps.setObject(i, jsonObject);
  }

  @Override
  public Object getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
    return rs.getString(columnIndex);
  }

  @Override
  public Object getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
    return cs.getString(columnIndex);
  }

  @Override
  public Object getNullableResult(ResultSet rs, String columnName) throws SQLException {
    return rs.getString(columnName);
  }

}

package com.potter.postgres.config;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.postgis.Geometry;
import org.postgis.PGgeometry;

/**
 * @author 梅长苏
 * @Description ----- 2019/5/16 7:16 PM
 */
public abstract class AbstractGeometryTypeHandler<T extends Geometry> extends BaseTypeHandler<T> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        PGgeometry geometry = new PGgeometry();
        geometry.setGeometry(parameter);
        ps.setObject(i, geometry);
    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        PGgeometry pGgeometry = (PGgeometry) rs.getObject(columnName);
        if (pGgeometry == null) {
            return null;
        }
        return (T) pGgeometry.getGeometry();
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        PGgeometry pGgeometry = (PGgeometry) rs.getObject(columnIndex);
        if (pGgeometry == null) {
            return null;
        }
        return (T) pGgeometry.getGeometry();
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        PGgeometry pGgeometry = (PGgeometry) cs.getObject(columnIndex);
        if (pGgeometry == null) {
            return null;
        }
        return (T) pGgeometry.getGeometry();
    }
}

package com.potter.postgres.config;

import org.apache.ibatis.type.MappedTypes;
import org.postgis.LineString;

/**
 * @author 梅长苏
 * @Description ----- 2019/5/16 7:16 PM
 */
@MappedTypes(LineString.class)
public class LineStringTypeHandler extends AbstractGeometryTypeHandler<LineString>{
}

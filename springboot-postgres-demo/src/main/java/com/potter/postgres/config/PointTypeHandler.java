package com.potter.postgres.config;

import org.apache.ibatis.type.MappedTypes;
import org.postgis.Point;

/**
 * @author 梅长苏
 * @Description ----- 2019/5/16 7:16 PM
 */
@MappedTypes(Point.class)
public class PointTypeHandler extends AbstractGeometryTypeHandler<Point> {
}

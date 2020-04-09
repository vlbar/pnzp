package com.coordsystem.comparators;

import com.coordsystem.primitives.Point;
import java.util.Comparator;

public class PointComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Point p1 = (Point) o1;
        Point p2 = (Point) o2;

        return (p1.getX() < p2.getX()) ? -1 : ((p1.getX() == p2.getX()) ? 0 : 1);
    }
}

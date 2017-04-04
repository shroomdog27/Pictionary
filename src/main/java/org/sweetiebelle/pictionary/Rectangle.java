package org.sweetiebelle.pictionary;

import java.awt.Point;

public class Rectangle {

    private int yMax;
    private int yMin;
    private int xMax;
    private int xMin;

    public Rectangle(int x1, int y1, int x2, int y2) {
        xMin = Math.min(x1, x2);
        xMax = Math.max(x1, x2);
        yMin = Math.min(y1, y2);
        yMax = Math.max(y1, y2);
    }

    public Rectangle(Point upperPoint, Point lowerPoint) {
        this(upperPoint.x, upperPoint.y, lowerPoint.x, lowerPoint.y);
    }

    public Rectangle(double x1, double y1, double x2, double y2) {
        this((int) x1, (int) y2, (int) x2, (int) y2);
    }

    public Point getUpper() {
        return new Point(xMax, yMax);
    }

    public Point getLower() {
        return new Point(xMin, yMin);
    }

    public boolean isOnRect(int x, int y) {
        if (x < xMin || x > xMax || y < yMin || y > yMax)
            return false;
        return true;
    }

    public boolean isOnRect(Point p) {
        return isOnRect(p.x, p.y);
    }

}

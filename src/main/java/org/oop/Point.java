package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double DistanceToTargetPoint(Point targetPoint){
            return Math.sqrt(Math.pow(targetPoint.x - x,2) + Math.pow(targetPoint.y -y,2));
    }

    public double DirectionToTargetPoint(Point targetPoint){
        return Math.atan2(targetPoint.y - y, targetPoint.x -x);
    }

  }

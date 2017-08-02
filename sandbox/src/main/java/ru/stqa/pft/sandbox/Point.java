package ru.stqa.pft.sandbox;

public class Point {
  public double x;
  public double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double distance(double x, double y) {
    return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
  }
  public double twoDistance(Point p) {
    return distance(p.x, p.y);
  }
}

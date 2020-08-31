package core.java.se9.ch04.ex01to03;

import java.util.Objects;

public class Point {
  protected double x;
  protected double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }
    Point otherPoint = (Point) obj;
    return this.x == otherPoint.x && this.y == otherPoint.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.x, this.y);
  }

  @Override
  public String toString() {
    return this.getClass().getName() + String.format("[x=%f,y=%f]", this.x, this.y);
  }
}
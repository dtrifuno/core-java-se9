package core.java.se9.ch02.ex05to08;

/**
 * A <code>Point</code> object represents an immutable 2D point with double valued coordinates.
 *
 * @author Darko Trifunovski
 * @version 1.0
 */
public class Point {
  private double x = 0.0;
  private double y = 0.0;

  Point() {}

  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Get the first coordinate.
   *
   * @return the x-coordinate of the point
   */
  public double getX() {
    return x;
  }

  /**
   * Get the second coordinate.
   *
   * @return the y-coordinate of the point
   */
  public double getY() {
    return y;
  }

  /**
   * Translate the point by (x, y).
   *
   * @param x how much to translate the x-coordinate by
   * @param y how much to translate the y-coordinate by
   * @return the translated point
   */
  public Point translate(double x, double y) {
    return new Point(this.x + x, this.y + y);
  }

  /**
   * Scale the point by scaleFactor.
   *
   * @param scaleFactor by how much to scale both coordinates
   * @return the scaled point
   */
  public Point scale(double scaleFactor) {
    return new Point(this.x * scaleFactor, this.y * scaleFactor);
  }
}

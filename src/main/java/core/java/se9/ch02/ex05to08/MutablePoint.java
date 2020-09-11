package core.java.se9.ch02.ex05to08;

/**
 * A <code>MutablePoint</code> object represents an mutable 2D point with
 * double valued coordinates.
 * @author Darko Trifunovski
 * @version 1.0
 */
public class MutablePoint {
  private double x = 0.0;
  private double y = 0.0;

  MutablePoint() {
  }

  MutablePoint(double x, double y) {
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
   */
  public void translate(double x, double y) {
    this.x += x;
    this.y += y;
  }

  /**
   * Scale the point by scaleFactor.
   * 
   * @param scaleFactor by how much to scale both coordinates
   * @return the scaled point
   */
  public void scale(double scaleFactor) {
    this.x *= scaleFactor;
    this.y *= scaleFactor;
  }
}

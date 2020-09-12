package core.java.se9.ch04.ex01to03;

import java.util.Objects;

public class LabeledPoint extends Point {
  String label;

  public LabeledPoint(String label, double x, double y) {
    super(x, y);
    this.label = label;
  }

  public String getLabel() {
    return this.label;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    if (!super.equals(obj)) {
      return false;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }
    LabeledPoint labeledPointObject = (LabeledPoint) obj;
    return Objects.equals(this.label, labeledPointObject.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), label);
  }

  @Override
  public String toString() {
    return super.toString() + String.format("[label=\"%s\"]", this.label);
  }
}

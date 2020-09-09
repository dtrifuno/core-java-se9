package core.java.se9.ch03.Ex0405;

import java.util.function.IntSupplier;

public interface IntSequence {
  boolean hasNext();
  int next();

  static IntSequence of(int ... args) {
    return new IntSequence() {
      private int idx = 0;
      private int[] entries = args;

      @Override
      public boolean hasNext() {
        return this.idx < this.entries.length;
      }

      @Override
      public int next() {
        return this.entries[this.idx++];
      }
    };
  }

  static IntSequence constant(int i) {
    return new IntSequence() {
      @Override
      public int next() {
        return ((IntSupplier) () -> i).getAsInt();
      }

      @Override
        public boolean hasNext() {
          return true;
        }
    };
  }
}

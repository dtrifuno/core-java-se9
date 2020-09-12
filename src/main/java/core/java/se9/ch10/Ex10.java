package core.java.se9.ch10;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;

public class Ex10 {
  private static final int NUMBER_OF_TASKS = 10000;

  public static void main(String[] args) {
    CountDownLatch latch = new CountDownLatch(NUMBER_OF_TASKS);
    ExecutorService exec = Executors.newCachedThreadPool();
    LongAccumulator la = new LongAccumulator(Long::max, Long.MIN_VALUE);
    for (int i = 0; i < NUMBER_OF_TASKS; i++) {
      exec.execute(
          () -> {
            long randomLong = new Random().nextLong();
            la.accumulate(randomLong);
            latch.countDown();
          });
    }

    try {
      latch.await();
      System.out.println(
          "The largest random long generated in "
              + NUMBER_OF_TASKS
              + " tasks was "
              + la.get()
              + ".");
    } catch (InterruptedException e) {
      System.err.println(e.getMessage());
    }
  }
}

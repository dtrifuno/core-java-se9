package core.java.se9.ch10;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class Ex09 {
  private static final int NUMBER_OF_TASKS = 1000;

  public static void main(String[] args) {

    ExecutorService exec = Executors.newFixedThreadPool(4);
    CountDownLatch longAdderLatch = new CountDownLatch(NUMBER_OF_TASKS);
    LongAdder la = new LongAdder();
    Runnable incrementLongAdder =
        () -> {
          for (int i = 0; i < 100000; i++) {
            la.increment();
            longAdderLatch.countDown();
          }
        };

    long longAdderStartTime = System.nanoTime();
    for (int i = 0; i < NUMBER_OF_TASKS; i++) {
      exec.execute(incrementLongAdder);
    }
    try {
      longAdderLatch.await();
    } catch (InterruptedException e) {
      System.err.println(e.getMessage());
      return;
    }
    long longAdderEndTime = System.nanoTime();

    CountDownLatch atomicLongLatch = new CountDownLatch(NUMBER_OF_TASKS);
    AtomicLong al = new AtomicLong();
    Runnable incrementAtomicLong =
        () -> {
          for (int i = 0; i < 100000; i++) {
            al.incrementAndGet();
            atomicLongLatch.countDown();
          }
        };

    long atomicLongStartTime = System.nanoTime();
    for (int i = 0; i < NUMBER_OF_TASKS; i++) {
      exec.execute(incrementAtomicLong);
    }
    try {
      atomicLongLatch.await();
    } catch (InterruptedException e) {
      System.err.println(e.getMessage());
      return;
    }
    long atomicLongEndTime = System.nanoTime();

    long longAdderTime = (longAdderEndTime - longAdderStartTime) / 1000000;
    System.out.print("Using LongAdder took " + longAdderTime + " ms, ");
    long atomicLongTime = (atomicLongEndTime - atomicLongStartTime) / 1000000;
    System.out.println("while using AtomicLong took " + atomicLongTime + " ms.");
  }
}

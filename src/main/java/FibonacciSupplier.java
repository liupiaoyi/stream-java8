package main.java;

import java.util.function.Supplier;

public class FibonacciSupplier implements Supplier<Long> {
	//f(n) = f(n-1)+f(n-2)+f(n-3)
  private long longBef = 1;
  private long before = 2;
  private long now = 4;

  @Override
  public Long get() {
    long n = now;
    long next = now + before + longBef;
    longBef = before;
    before = now;
    now = next;
    return n;
  }
  
}

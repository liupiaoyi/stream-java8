package main.java;

import java.util.stream.Stream;


public class Fib {
	
  public static void main(String[] args) {
    Stream<Long> longStream = Stream.generate(new FibonacciSupplier());
    longStream.limit(10).forEach(System.out::println);
  }
}

package edu.cnm.deepdive.fizzbuzz;

public class FizzBuzz {
  
  //default upper limit
  public static final int DEF_LIM = 100;

  private static void fizzBuzzCounter(int lim) {
    for (int i = 1; i <= lim; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) {
    if (args.length > 0) {
      Integer limit = new Integer(args[0]);
      fizzBuzzCounter(limit);
    } else {
      fizzBuzzCounter(DEF_LIM);
    }
  }

}

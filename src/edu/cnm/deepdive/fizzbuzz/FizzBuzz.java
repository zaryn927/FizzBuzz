package edu.cnm.deepdive.fizzbuzz;

public class FizzBuzz {

  // default upper limit
  public static final int DEF_LIM = 100;
  public static final String USAGE = "Usage:%n"
      + "\tjava [options] edu.cnm.deepdive.fizzbuzz.FizzBuzz [limit]%n" + "%n" + "where%n"
      + "\toptions = VM options%n" + "\tlimit = positive upper counting limit (default = 100)%n";

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

  private static void emitUsage() {
    System.out.printf(USAGE);
  }

  public static void main(String[] args) {
    if (args.length > 0) {
      try {
        Integer limit = new Integer(args[0]);
        if (limit < 0) {
          throw new IllegalArgumentException("Upper limit must be positive");
        }
        fizzBuzzCounter(limit);
      } catch (IllegalArgumentException ex) {
        ex.printStackTrace();
        emitUsage();
      }
    } else {
      fizzBuzzCounter(DEF_LIM);
    }
  }

}

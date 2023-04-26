class Factorial {
  public static long fact(int n) {
    long fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + n + " is: " + fact);
    return fact;
  }
}
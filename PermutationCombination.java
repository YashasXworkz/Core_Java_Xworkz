class PermutationCombination {
  public static long getfact(int n) {
    long fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }
}
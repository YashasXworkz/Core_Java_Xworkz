class PermutationCombination1 {
  public static void nprAndNcr(int n, int r) {
    long factN = 1;
    long factNR = 1;
    long factR = 1;
    for (int i = 1; i <= n; i++) {
      factN = factN * i;
      if (i <= (n - r)) {
        factNR = factNR * i;
      }
      if (i <= r) {
        factR = factR * i;
      }
    }
    System.out.println("Permutation of " + n + " and " + r + ": " + factN / factNR);
    System.out.println("Combination of " + n + " and " + r + ": " + factN / (factNR * factR));
  }

  public static void main(String[] ex) {
    nprAndNcr(6, 4);
  }
}
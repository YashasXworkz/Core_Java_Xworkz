class PermutationCombinationTester {
  public static void main(String[] ex) {
    long ncr = PermutationCombination.getfact(6)
        / (PermutationCombination.getfact(4) * PermutationCombination.getfact(6 - 4));
    long npr = PermutationCombination.getfact(6) / PermutationCombination.getfact(6 - 4);
    System.out.println("Combination: " + ncr);
    System.out.println("Permutation: " + npr);
  }
}
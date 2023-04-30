class AdditionTester {
  public static void main(String[] addi) {
    System.out.println("Main method started");
    int ad = Addition.add(10, 30);
    System.out.println(ad);
    int ad2 = Addition.add(20, 40, 70);
    System.out.println(ad2);
    System.out.println("Main method ended");
  }
}
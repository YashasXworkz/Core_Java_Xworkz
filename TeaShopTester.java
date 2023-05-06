class TeaShopTester {
  static String[] teas = { "Green Tea", "White Tea", "Herbal Tea", "Black Tea", "Yellow Tea", "Masala Tea" };

  public static void main(String[] shop) {
    System.out.println("Main method started");
    TeaShop.addTeaName("Green Tea");
    TeaShop.addTeaName("White Tea");
    TeaShop.addTeaName("Herbal Tea");
    TeaShop.addTeaName("Black Tea");
    TeaShop.addTeaName("Yellow Tea");
    TeaShop.addTeaName("Masala Tea");
    TeaShop.addTeaName("Tea"); // Extra argument to check whether the array is full
    TeaShop.getTeaName();
    boolean verify = TeaShop.updateTeaName("Masala Tea", "Ginger Masala Tea");
    System.out.println("Tea name is updated: " + verify);
    TeaShop.getTeaName();
    String isPresent = TeaShop.getTeaName("White Tea");
    System.out.println("Searched tea name is: " + isPresent);
    System.out.println("Main method ended");
  }
}
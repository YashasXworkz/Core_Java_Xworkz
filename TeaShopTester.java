class TeaShopTester {
  public static void main(String[] shop) {
    System.out.println("Main method started");
    TeaShop.addTeaName("Green Tea");
    TeaShop.addTeaName("White Tea");
    TeaShop.addTeaName("Herbal Tea");
    TeaShop.addTeaName("Black Tea");
    TeaShop.addTeaName("Yellow Tea");
    TeaShop.addTeaName("Masala Tea");
    TeaShop.getTeaName();
    boolean verify = TeaShop.updateTeaName("Masala Tea", "Ginger Masala Tea");
    System.out.println("Tea name is updated: " + verify);
    TeaShop.getTeaName();
    System.out.println("Main method ended");
  }
}
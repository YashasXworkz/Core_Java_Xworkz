class UberEatsMenuTester {
  public static void main(String[] tester) {
    System.out.println("Main started");
    String itemName = "Pizza";
    int price = UberEatsMenu.searchItem(itemName);
    if (price == 0) {
      System.out.println("Item not found!");
    } else {
      System.out.println("The price of " + itemName + " is: " + "Rs " + price);
    }
    System.out.println("Main ended");
  }
}
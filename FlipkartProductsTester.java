class FlipkartProductsTester {
  public static void main(String[] tester) {
    System.out.println("Main started");
    String itemName = "Smartphone";
    int price = FlipkartProducts.searchItem(itemName);
    System.out.println("The price of the " + itemName + " is: " + "Rs " + price);
    System.out.println("Main ended");
  }
}
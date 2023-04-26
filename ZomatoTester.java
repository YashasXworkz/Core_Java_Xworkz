class ZomatoTester {
  public static void main(String[] zomato) {
    System.out.println("Main method started");
    String itemName = "pizza";
    int quantity = 3;
    double priceForSingle = Zomato.searchItem(itemName);
    double priceWithQuantity = Zomato.searchItem(itemName, quantity);
    System.out.println("Price for " + "-" + itemName + "-" + " is: Rs" + priceForSingle);
    System.out.println("Price for " + "-" + itemName + "-" + " (" + quantity + " Qty" + ")" + " is: Rs" + priceWithQuantity);
    System.out.println("Main method ended");
  }
}
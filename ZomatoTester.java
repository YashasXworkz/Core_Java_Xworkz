class ZomatoTester {
  // Java Method
  public static void main(String[] zomato) {
    System.out.println("Main method started");
    // invoking the method
    // External Reference
    String itemName = "Gobi";
    // Internal Reference
    double price = Zomato.searchItem(itemName);
    System.out.println("The Price of " + itemName + " is: " + price);
    System.out.println("Main method ended");
  }
}

// String itemName = "Pizza"
// Zomato.searchItem(itemName) //External Reference
// Zomato.searchItem("Pizza") //Internal Reference
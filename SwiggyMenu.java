class SwiggyMenu {
  public static double searchItem(String itemName) {
    System.out.println("searchItem method is started");
    double price = 0.0;
    if (itemName == "Veg Pizza") {
      System.out.println("Item name: " + itemName);
      price = 250.0;
    } else if (itemName == "Non-Veg Pizza") {
      System.out.println("Item name: " + itemName);
      price = 350.0;
    } else if (itemName == "Pasta") {
      System.out.println("Item name: " + itemName);
      price = 200.0;
    } else if (itemName == "Burger") {
      System.out.println("Item name: " + itemName);
      price = 150.0;
    } else if (itemName == "Sandwich") {
      System.out.println("Item name: " + itemName);
      price = 100.0;
    } else if (itemName == "Fries") {
      System.out.println("Item name: " + itemName);
      price = 75.0;
    } else if (itemName == "Coke") {
      System.out.println("Item name: " + itemName);
      price = 50.0;
    } else if (itemName == "Juice") {
      System.out.println("Item name: " + itemName);
      price = 80.0;
    } else if (itemName == "Salad") {
      System.out.println("Item name: " + itemName);
      price = 120.0;
    } else if (itemName == "Ice Cream") {
      System.out.println("Item name: " + itemName);
      price = 100.0;
    }
    System.out.println("searchItem method is ended");
    return price;
  }
}
class UberEatsMenu {
  public static int searchItem(String itemName) {
    System.out.println("searchItem method is started");
    int price = 0;
    if (itemName == "Burger") {
      System.out.println("Item name: " + itemName);
      price = 100;
    }
    if (itemName == "Pizza") {
      System.out.println("Item name: " + itemName);
      price = 200;
    }
    if (itemName == "Taco") {
      System.out.println("Item name: " + itemName);
      price = 150;
    }
    if (itemName == "Sushi") {
      System.out.println("Item name: " + itemName);
      price = 250;
    }
    if (itemName == "Salad") {
      System.out.println("Item name: " + itemName);
      price = 120;
    }
    if (itemName == "Sandwich") {
      System.out.println("Item name: " + itemName);
      price = 80;
    }
    if (itemName == "Fried Chicken") {
      System.out.println("Item name: " + itemName);
      price = 180;
    }
    if (itemName == "Burrito") {
      System.out.println("Item name: " + itemName);
      price = 170;
    }
    if (itemName == "Pasta") {
      System.out.println("Item name: " + itemName);
      price = 150;
    }
    if (itemName == "Ramen") {
      System.out.println("Item name: " + itemName);
      price = 200;
    } else {
      System.out.println("Item not found: " + itemName);
    }
    System.out.println("searchItem method is ended");
    return price;
  }
}
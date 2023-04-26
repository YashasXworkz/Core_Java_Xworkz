class Zomato {
  public static double searchItem(String itemName) {
    System.out.println("searchItem method is started");
    double price = 0.0;
    if ("veg briyani" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 150.00;
    }
    if ("noodles" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 200.00;
    }
    if ("burger" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 250.00;
    }
    if ("mutton briyani" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 300.00;
    }
    if ("pizza" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 350.00;
    }
    if ("chicken burger" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 150.00;
    }
    if ("masala dosa" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 100.00;
    }
    if ("roti" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 200.00;
    }
    if ("gobi" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 180.00;
    }
    System.out.println("searchItem method is ended");
    return price;
  }

  public static double searchItem(String itemName, int quantity) {
    System.out.println("searchItem method is started");
    double price = 0.0;
    if ("veg briyani" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 150.00 * quantity;
    }
    if ("noodles" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 200.00 * quantity;
    }
    if ("burger" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 250.00 * quantity;
    }
    if ("mutton briyani" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 300.00 * quantity;
    }
    if ("pizza" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 350.00 * quantity;
    }
    if ("chicken burger" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 150.00 * quantity;
    }
    if ("masala dosa" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 100.00 * quantity;
    }
    if ("roti" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 200.00 * quantity;
    }
    if ("gobi" == itemName) {
      System.out.println("Thanks for choosing: " + itemName);
      price = 180.00 * quantity;
    }
    System.out.println("searchItem method is ended");
    return price;
  }
}
class Zomato {
  public static double searchItem(String itemName) {
    System.out.println("searchItem method is started");
    double price = 0.0; // if initialization and declaration use price as a variable
    if ("Veg Briyani" == itemName) {
      System.out.println("Thanks for selecting " + itemName);
      price = 230.89;
      // return 230.89; // if not initialization and declaration in local variable of price
    }
    if ("Masala Dose" == itemName) {
      System.out.println("Thanks for selecting " + itemName);
      price = 50.00;
    }
    if ("Gobi" == itemName) {
      System.out.println("Thanks for selecting " + itemName);
      price = 60.00;
    }
    if ("French Fries" == itemName) {
      System.out.println("Thanks for selecting " + itemName);
      price = 170.45;
    }
    if ("Dragon Chicken" == itemName) {
      System.out.println("Thanks for selecting " + itemName);
      price = 210.10;
    }
    if ("Chicken Briyani" == itemName) {
      System.out.println("Thanks for selecting " + itemName);
      price = 150.89;
    }
    if ("Chicken Shawarma" == itemName) {
      System.out.println("Thanks for selecting " + itemName);
      price = 110.99;
    }
    if ("Roti Sabzi" == itemName) {
      System.out.println("Thanks for selecting " + itemName);
      price = 80.70;
    }
    if ("Pizza" == itemName) {
      System.out.println("Thanks for selecting " + itemName);
      price = 220.99;
    }
    if ("Mutton Briyani" == itemName) {
      System.out.println("Thanks for selecting " + itemName);
      price = 260.78;
    }
    System.out.println("searchItem method is ended");
    return price;
    // return 0.0; //if not initialization and declaration in local variable of price
  }
}
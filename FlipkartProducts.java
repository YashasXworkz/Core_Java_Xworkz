class FlipkartProducts {
  public static int searchItem(String itemName) {
    System.out.println("searchItem method is started");
    int price = 0;
    if (itemName == "Smartphone") {
      System.out.println("Item name: " + itemName);
      price = 10000;
    } else if (itemName == "Laptop") {
      System.out.println("Item name: " + itemName);
      price = 40000;
    } else if (itemName == "Smart TV") {
      System.out.println("Item name: " + itemName);
      price = 30000;
    } else if (itemName == "Wireless Earphones") {
      System.out.println("Item name: " + itemName);
      price = 2000;
    } else if (itemName == "Bluetooth Speaker") {
      System.out.println("Item name: " + itemName);
      price = 3000;
    } else if (itemName == "Tablet") {
      System.out.println("Item name: " + itemName);
      price = 15000;
    } else if (itemName == "Smartwatch") {
      System.out.println("Item name: " + itemName);
      price = 5000;
    } else if (itemName == "Air Purifier") {
      System.out.println("Item name: " + itemName);
      price = 10000;
    } else if (itemName == "Gaming Console") {
      System.out.println("Item name: " + itemName);
      price = 25000;
    } else if (itemName == "Printer") {
      System.out.println("Item name: " + itemName);
      price = 5000;
    }
    System.out.println("searchItem method is ended");
    return price;
  }
}
class SMChocolates {
  static String[] chocolateBrands = { "KitKat", "Snickers", "Cadbury Dairy Milk", "Galaxy", "Mars", "Bounty", "Twix",
      "Reese's", "Milky Way", "Lindt", "Ferrero Rocher", "Toblerone", "Nestle Crunch", "Hershey's", "M&M's" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getChocolateBrands();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getChocolateBrands() {
    System.out.println("-------------------------------------------");
    System.out.println("List of Chocolates in Supermarket:" + chocolateBrands.length);
    for (int ch = 0; ch < chocolateBrands.length; ch++) {
      System.out.println(chocolateBrands[ch]);
    }
    return;
  }
}

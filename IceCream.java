class IceCream {
  static String[] iceCreamFlavors = { "Chocolate", "Vanilla", "Strawberry", "Mint Chocolate Chip",
      "Rocky Road", "Butter Pecan", "Cookies and Cream", "Coffee",
      "Mango Sorbet", "Raspberry Sorbet", "Lemon Sorbet", "Mint Chocolate",
      "Pistachio", "Caramel Swirl", "Chocolate Chip Cookie Dough", "Birthday Cake",
      "Mint Chip", "Cherry Garcia", "Chunky Monkey", "Phish Food" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getIceCreamFlavors();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getIceCreamFlavors() {
    System.out.println("---------------------------------------");
    System.out.println("List of Ice Cream Flavors:" + iceCreamFlavors.length);
    for (int ic = 0; ic < iceCreamFlavors.length; ic++) {
      System.out.println(iceCreamFlavors[ic]);
    }
    return;
  }
}

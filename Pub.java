class Pub {
  static String[] pubNames = { "The Red Lion", "The Crown Inn", "The Royal Oak", "The White Horse",
      "The Black Bull", "The Blue Boar", "The Rose and Crown", "The Plough", "The Bell", "The Swan",
      "The King's Head", "The Coach and Horses", "The George and Dragon", "The Golden Lion",
      "The Bear and Staff", "The Wheatsheaf", "The Cross Keys", "The Anchor", "The Ship",
      "The Horse and Groom" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getPubNames();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getPubNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Pubs:" + pubNames.length);
    for (int pu = 0; pu < pubNames.length; pu++) {
      System.out.println(pubNames[pu]);
    }
    return;
  }
}

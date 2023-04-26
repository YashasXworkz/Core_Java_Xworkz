class SMPerfumes {
  static String[] perfumeBrands = { "Ajmal", "Amouage", "Bvlgari", "Calvin Klein", "Chanel", "Dior", "Gucci",
      "Hugo Boss", "Jaguar", "Lacoste", "Mont Blanc", "Nautica", "Paco Rabanne", "Tom Ford", "Versace" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getPerfumeBrands();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getPerfumeBrands() {
    System.out.println("-------------------------------------------");
    System.out.println("List of Perfumes in Supermarket:" + perfumeBrands.length);
    for (int pe = 0; pe < perfumeBrands.length; pe++) {
      System.out.println(perfumeBrands[pe]);
    }
    return;
  }
}

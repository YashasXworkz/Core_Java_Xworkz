class SMShampoos {
  static String[] shampooBrands = { "Head & Shoulders", "Pantene", "Herbal Essences", "Garnier", "L'Oreal", "Tresemme",
      "Dove", "Aussie", "OGX", "Nexxus", "Suave", "Paul Mitchell", "Redken", "Biolage", "Matrix" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getShampooBrands();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getShampooBrands() {
    System.out.println("-------------------------------------------");
    System.out.println("List of Shampoos in Supermarket:" + shampooBrands.length);
    for (int sh = 0; sh < shampooBrands.length; sh++) {
      System.out.println(shampooBrands[sh]);
    }
    return;
  }
}

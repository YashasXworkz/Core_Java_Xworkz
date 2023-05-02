class OrionMallTester {
  public static void main(String[] shops) {
    System.out.println("Main method started");
    OrionMall.addShopName("Adidas");
    OrionMall.addShopName("Bata");
    OrionMall.addShopName("Casio");
    OrionMall.addShopName("Diesel");
    OrionMall.addShopName("Ethos");
    OrionMall.addShopName("Fastrack");
    OrionMall.addShopName("Giordano");
    OrionMall.addShopName("H&M");
    OrionMall.addShopName("Indian Terrain");
    OrionMall.addShopName("Jack & Jones");
    OrionMall.addShopName("KFC");
    OrionMall.addShopName("Levis");
    OrionMall.addShopName("Mango");
    OrionMall.addShopName("Nike");
    OrionMall.addShopName("Oxford");
    OrionMall.getShopName();
    boolean verify = OrionMall.updateShopName("Oxford", "Puma");
    System.out.println("Shop name is updated: " + verify);
    OrionMall.getShopName();
    System.out.println("Main method ended");
  }
}
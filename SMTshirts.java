class SMTshirts {
  static String[] tshirtBrands = { "Wrogn", "Roadster", "HRX", "Flying Machine", "Pepe Jeans",
      "United Colors of Benetton", "Tommy Hilfiger", "Puma", "Nike", "Adidas", "Reebok", "Fila", "Levis", "Mufti",
      "Jack & Jones" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getTshirtBrands();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getTshirtBrands() {
    System.out.println("-------------------------------------------");
    System.out.println("List of Tshirts in Supermarket:" + tshirtBrands.length);
    for (int ts = 0; ts < tshirtBrands.length; ts++) {
      System.out.println(tshirtBrands[ts]);
    }
    return;
  }
}

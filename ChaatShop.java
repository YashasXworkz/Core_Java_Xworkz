class ChaatShop {
  static String[] chaatNames = { "Pani Puri", "Sev Puri", "Bhel Puri", "Dahi Puri", "Aloo Tikki Chaat",
      "Papdi Chaat", "Ragda Patties", "Samosa Chaat", "Chana Chaat", "Dahi Bhalla", "Aloo Chaat",
      "Kachori Chaat", "Corn Chaat", "Fruit Chaat", "Chole Tikki Chaat" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getChaatNames();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getChaatNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Chaats:" + chaatNames.length);
    for (int ca = 0; ca < chaatNames.length; ca++) {
      System.out.println(chaatNames[ca]);
    }
    return;
  }
}
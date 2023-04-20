class NetflixHindi {
  static String[] seriesHindiNames = { "Ludo", "Gunjan Saxena: The Kargil Girl", "The White Tiger", "Raat Akeli Hai",
      "Bulbbul", "Choked", "Guilty", "Class of '83", "Love per Square Foot", "Dolly Kitty Aur Woh Chamakte Sitare",
      "Mrs. Serial Killer", "Ghost Stories", "Drive", "Kaali Khuhi", "Pagglait" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getSeriesHindiNames();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getSeriesHindiNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Netflix Hindi Series:" + seriesHindiNames.length);
    for (int hi = 0; hi < seriesHindiNames.length; hi++) {
      System.out.println(seriesHindiNames[hi]);
    }
    return;
  }
}

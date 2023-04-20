class Netflix {
  static String[] seriesEngNames = { "Stranger Things", "The Crown", "Narcos", "Black Mirror", "The Witcher",
      "Money Heist", "Ozark", "The Queen's Gambit", "Breaking Bad", "Orange is the New Black",
      "The Umbrella Academy", "Peaky Blinders", "The Haunting of Hill House", "Dark", "The Irishman" };

  static String[] seriesHindiNames = { "Ludo", "Gunjan Saxena: The Kargil Girl", "The White Tiger", "Raat Akeli Hai",
      "Bulbbul", "Choked", "Guilty", "Class of '83", "Love per Square Foot", "Dolly Kitty Aur Woh Chamakte Sitare",
      "Mrs. Serial Killer", "Ghost Stories", "Drive", "Kaali Khuhi", "Pagglait" };

  static String[] koreanDramas = { "Crash Landing on You", "Itaewon Class", "Descendants of the Sun",
      "Goblin", "Reply 1988", "Mr. Sunshine", "Vincenzo", "Kingdom",
      "Signal", "Hospital Playlist", "My Love from the Star", "Start-Up",
      "Stranger", "Sky Castle", "Love Alarm" };

  // Method
  public static void main(String[] Netflix) {
    System.out.println("Main started");
    getSeriesEngNames();
    getSeriesHindiNames();
    getKoreanDramas();
    System.out.println("Main ended");
  }

  // Method
  // Decalaration of a Method
  public static void getSeriesEngNames() {
    System.out.println("Method getSeriesEngNames started");
    System.out.println("List of Netflix English Series:");
    for (int x = 0; x < seriesEngNames.length; x++) {
      System.out.println(seriesEngNames[x]);
    }
    System.out.println("Method getSeriesEngNames ended");
    return;
  }

  public static void getSeriesHindiNames() {
    System.out.println("---------------------------------------");
    System.out.println("Method getSeriesHindiNames started");
    System.out.println("List of Netflix Hindi Series:");
    for (int z = 0; z < seriesHindiNames.length; z++) {
      System.out.println(seriesHindiNames[z]);
    }
    System.out.println("Method getSeriesHindiNames ended");
    return;
  }

  public static void getKoreanDramas() {
    System.out.println("---------------------------------------");
    System.out.println("Method getKoreanDramas started");
    System.out.println("List of Netflix Korean Dramas:");
    for (int y = 0; y < koreanDramas.length; y++) {
      System.out.println(koreanDramas[y]);
    }
    System.out.println("Method getKorenaDramas ended");
    return;
  }
}
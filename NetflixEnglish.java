class NetflixEnglish {
  static String[] seriesEngNames = { "Stranger Things", "The Crown", "Narcos", "Black Mirror", "The Witcher",
      "Money Heist", "Ozark", "The Queen's Gambit", "Breaking Bad", "Orange is the New Black",
      "The Umbrella Academy", "Peaky Blinders", "The Haunting of Hill House", "Dark", "The Irishman" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getSeriesEngNames();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getSeriesEngNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Netflix English Series:" + seriesEngNames.length);
    for (int en = 0; en < seriesEngNames.length; en++) {
      System.out.println(seriesEngNames[en]);
    }
    return;
  }
}

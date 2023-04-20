class NetflixEnglish {
  public static void main(String[] series) {
    String[] seriesNames = { "Stranger Things", "The Crown", "Narcos", "Black Mirror", "The Witcher",
        "Money Heist", "Ozark", "The Queen's Gambit", "Breaking Bad", "Orange is the New Black",
        "The Umbrella Academy", "Peaky Blinders", "The Haunting of Hill House", "Dark", "The Irishman" };
    System.out.println("List of Netflix's English Series:");
    for (int i = 0; i < seriesNames.length; i++) {
      System.out.println(seriesNames[i]);
    }
  }
}
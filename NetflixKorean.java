public class NetflixKorean {
  static String[] koreanDramas = { "Crash Landing on You", "Itaewon Class", "Descendants of the Sun",
      "Goblin", "Reply 1988", "Mr. Sunshine", "Vincenzo", "Kingdom",
      "Signal", "Hospital Playlist", "My Love from the Star", "Start-Up",
      "Stranger", "Sky Castle", "Love Alarm" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getKoreanDramas();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getKoreanDramas() {
    System.out.println("---------------------------------------");
    System.out.println("List of Netflix Korean Dramas:" + koreanDramas.length);
    for (int ko = 0; ko < koreanDramas.length; ko++) {
      System.out.println(koreanDramas[ko]);
    }
    return;
  }
}

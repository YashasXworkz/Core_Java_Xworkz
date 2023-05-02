class TheatreTester {
  public static void main(String[] movies) {
    System.out.println("Main method started");
    Theatre.addMovieName("KGF Chapter 2");
    Theatre.addMovieName("Yuvarathnaa");
    Theatre.addMovieName("Roberrt");
    Theatre.addMovieName("Pogaru");
    Theatre.addMovieName("Salaga");
    Theatre.addMovieName("Bhajarangi 2");
    Theatre.addMovieName("Kotigobba 3");
    Theatre.addMovieName("Ramarjuna");
    Theatre.addMovieName("Pushpa");
    Theatre.addMovieName("Shivaji Surathkal");
    Theatre.getMovieNames();
    boolean verify = Theatre.updateMovieName("Pushpa", "Pushpa Part 2");
    System.out.println("Movie name is updated: " + verify);
    Theatre.getMovieNames();
    System.out.println("Main method ended");
  }
}
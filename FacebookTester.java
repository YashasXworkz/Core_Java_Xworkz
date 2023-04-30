class FacebookTester {
  public static void main(String[] facebook) {
    System.out.println("Main method started");
    Facebook.login(9999999999l, "facebook@123");
    Facebook.login("facebook11@gmail.com", "facebook@123");
    System.out.println("Main method ended");
  }
}
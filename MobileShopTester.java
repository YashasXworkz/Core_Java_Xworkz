class MobileShopTester {
  public static void main(String[] phno) {
    System.out.println("Main method started");
    MobileShop.addMobileNumber(9876543210L);
    MobileShop.addMobileNumber(5555555555L);
    MobileShop.addMobileNumber(9999999999L);
    MobileShop.addMobileNumber(1111111111L);
    MobileShop.addMobileNumber(8888888888L);
    MobileShop.addMobileNumber(4444444444L);
    MobileShop.addMobileNumber(2222222222L);
    MobileShop.addMobileNumber(1234567890L);
    MobileShop.addMobileNumber(7777777777L);
    MobileShop.addMobileNumber(6666666666L);
    MobileShop.getMobileNumber();
    boolean verify = MobileShop.updateMobileNumber(1234567890L, 9876543210L);
    System.out.println("Mobile number is updated: " + verify);
    MobileShop.getMobileNumber();
    System.out.println("Main method ended");
  }
}
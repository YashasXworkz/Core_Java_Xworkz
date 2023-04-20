class SMSoaps {
  static String[] soapBrands = { "Dettol", "Lifebuoy", "Santoor", "Pears", "Lux", "Cinthol", "Mysore Sandal", "Medimix",
      "Hamam", "Chandrika", "Ayush", "Park Avenue", "Fiama Di Wills", "Godrej No. 1", "Biotique" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getSoapBrands();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getSoapBrands() {
    System.out.println("-------------------------------------------");
    System.out.println("List of Soaps in Supermarket:" + soapBrands.length);
    for (int so = 0; so < soapBrands.length; so++) {
      System.out.println(soapBrands[so]);
    }
    return;
  }
}

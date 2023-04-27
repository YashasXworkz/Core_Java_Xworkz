class ChaatShop {
  static String[] chaatNames = { "Pani Puri", "Sev Puri", "Bhel Puri", "Dahi Puri" };
  static int index;

  public static boolean addChaatName(String chaatName) {
    System.out.println("addChaatName method started");
    System.out.println("No of parameters " + 1);
    System.out.println("Type of parameter is string " + chaatName);
    boolean isAdded = false;
    if (chaatNames != null) {
      if (index < chaatNames.length)
        chaatNames[index] = chaatName;
      index++;
    }
    System.out.println("addChaatName method ended");
    return isAdded;
  }

  public static void getChaatName() {
    System.out.println("getChaatName method started");
    for (int i = 0; i < chaatNames.length; i++) {
      System.out.println(chaatNames[i]);
    }
    System.out.println("getChaatName method ended");
  }
}
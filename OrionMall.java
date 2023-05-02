class OrionMall {
  static String[] shopNames = { null, null, null, null, null, null, null, null, null, null, null, null, null, null,
      null };
  static int index;

  // add - create - save (operations)
  public static boolean addShopName(String shopName) {
    System.out.println("addShopName method started");
    System.out.println("No of parameters: " + 1);
    System.out.println("Type of parameter is string: " + shopName);
    boolean isAdded = false;
    if (shopName != null) {
      shopNames[index++] = shopName;
      isAdded = true;
    } else {
      System.out.println("------Invalid argument------");
    }
    System.out.println("addShopName method ended");
    return isAdded;
  }

  // get - read - fetch (operations)
  public static void getShopName() {
    System.out.println("getShopName method started");
    for (int i = 0; i < shopNames.length; i++) {
      System.out.println(shopNames[i]);
    }
    System.out.println("getShopName method ended");
  }

  public static boolean updateShopName(String oldShopName, String updatedShopName) {
    System.out.println("updateShopName method started");
    boolean isUpdated = false;
    for (int i = 0; i < shopNames.length; i++) {
      if (shopNames[i].equals(oldShopName)) {
        shopNames[i] = updatedShopName;
        isUpdated = true;
        System.out.println("Updated shop name " + oldShopName + " to " + updatedShopName);
      }
    }
    System.out.println("updateShopName method ended");
    return isUpdated;
  }
}
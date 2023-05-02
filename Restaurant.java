class Restaurant {
  static String[] menuItems = { null, null, null, null, null, null, null, null, null, null, null, null, null, null,
      null };
  static int index;

  public static boolean addMenuItem(String menuItem) {
    System.out.println("addMenuItem method started");
    System.out.println("No of parameters: " + 1);
    System.out.println("Type of parameter is string: " + menuItem);
    boolean isAdded = false;
    if (menuItem != null) {
      menuItems[index++] = menuItem;
      isAdded = true;
    } else {
      System.out.println("------Invalid argument------");
    }
    System.out.println("addMenuItem method ended");
    return isAdded;
  }

  public static void getMenu() {
    System.out.println("getMenu method started");
    for (int i = 0; i < menuItems.length; i++) {
      System.out.println(menuItems[i]);
    }
    System.out.println("getMenu method ended");
  }

  public static boolean updateMenuItem(String oldMenuItem, String updatedMenuItem) {
    System.out.println("updateMenuItem method started");
    boolean isUpdated = false;
    for (int i = 0; i < menuItems.length; i++) {
      if (menuItems[i].equals(oldMenuItem)) {
        menuItems[i] = updatedMenuItem;
        isUpdated = true;
        System.out.println("Updated menu item " + oldMenuItem + " to " + updatedMenuItem);
      }
    }
    System.out.println("updateMenuItem method ended");
    return isUpdated;
  }
}
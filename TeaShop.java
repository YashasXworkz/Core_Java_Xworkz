class TeaShop {
  static String[] teaNames = { null, null, null, null, null, null };
  static int index;

  // add - create - save (operations)
  public static boolean addTeaName(String teaName) {
    System.out.println("addTeaName method started");
    System.out.println("No of parameters: " + 1);
    System.out.println("Type of parameter is string: " + teaName);
    boolean isAdded = false;
    if (teaName != null) {
      teaNames[index++] = teaName;
      isAdded = true;
    } else {
      System.out.println("------Invalid argument------");
    }
    System.out.println("addTeaName method ended");
    return isAdded;
  }

  // get - read - fetch (operations)
  public static void getTeaName() {
    System.out.println("getTeaName method started");
    for (int i = 0; i < teaNames.length; i++) {
      System.out.println(teaNames[i]);
    }
    System.out.println("getTeaName method ended");
  }

  public static boolean updateTeaName(String oldTeaName, String updatedTeaName) {
    System.out.println("updateTeaName method started");
    boolean isUpdated = false;
    for (int i = 0; i < teaNames.length; i++) {
      if (teaNames[i].equals(oldTeaName)) {
        teaNames[i] = updatedTeaName;
        isUpdated = true;
        System.out.println("Updated tea name " + oldTeaName + " to " + updatedTeaName);
      }
    }
    System.out.println("updateTeaName method ended");
    return isUpdated;
  }
}
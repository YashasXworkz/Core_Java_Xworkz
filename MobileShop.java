class MobileShop {
  static long[] mobileNumbers = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  static int index;

  // add - create - save (operations)
  public static boolean addMobileNumber(long mobileNumber) {
    System.out.println("addMobileNumber method started");
    System.out.println("No of parameters: " + 1);
    System.out.println("Type of parameter is long: " + mobileNumber);
    boolean isAdded = false;
    if (mobileNumber != 0) {
      if (index < mobileNumbers.length) {
        mobileNumbers[index++] = mobileNumber;
        isAdded = true;
      } else {
        System.out.println("---------Array is full---------");
      }
    } else {
      System.out.println("--------Invalid Argument: Null--------");
    }
    System.out.println("addMobileNumber method ended");
    return isAdded;
  }

  // get - read - fetch (operations)
  public static void getMobileNumber() {
    System.out.println("getMobileNumber method started");
    for (int i = 0; i < mobileNumbers.length; i++) {
      System.out.println(mobileNumbers[i]);
    }
    System.out.println("getMobileNumber method ended");
  }

  public static boolean updateMobileNumber(long oldMobileNumber, long updatedMobileNumber) {
    System.out.println("updateMobileNumber method started");
    boolean isUpdated = false;
    for (int i = 0; i < mobileNumbers.length; i++) {
      if (mobileNumbers[i] == oldMobileNumber) {
        mobileNumbers[i] = updatedMobileNumber;
        isUpdated = true;
        System.out.println("Updated mobile number " + oldMobileNumber + " to " + updatedMobileNumber);
      }
    }
    System.out.println("updateMobileNumber method ended");
    return isUpdated;
  }

  // searching
  public static String getMobileNumber(long mobileNumber) {
    System.out.println("getMobileNumber method started");
    for (int i = 0; i < mobileNumbers.length; i++) {
      if (mobileNumbers[i] == mobileNumber) {
        return Long.toString(mobileNumbers[i]);
      }
    }
    System.out.println("getMobileNumber method ended");
    return "Mobile number not found";
  }
}
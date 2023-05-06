class LibraryBook {
  static String[] bookNames = { null, null, null, null, null, null, null, null, null, null, null, null, null, null,
      null };
  static int index;

  // add - create - save (operations)
  public static boolean addBookName(String bookName) {
    System.out.println("addBookName method started");
    System.out.println("No of parameters: " + 1);
    System.out.println("Type of parameter is string: " + bookName);
    boolean isAdded = false;
    if (bookName != null && index < bookNames.length) {
      bookNames[index++] = bookName;
      isAdded = true;
    } else {
      System.out.println("---------Array is full---------");
    }
    System.out.println("addBookName method ended");
    return isAdded;
  }

  // get - read - fetch (operations)
  public static void getBookName() {
    System.out.println("getBookName method started");
    for (int i = 0; i < bookNames.length; i++) {
      System.out.println(bookNames[i]);
    }
    System.out.println("getBookName method ended");
  }

  public static boolean updateBookName(String oldBookName, String updatedBookName) {
    System.out.println("updateBookName method started");
    boolean isUpdated = false;
    for (int i = 0; i < bookNames.length; i++) {
      if (bookNames[i].equals(oldBookName)) {
        bookNames[i] = updatedBookName;
        isUpdated = true;
        System.out.println("Updated book name " + oldBookName + " to " + updatedBookName);
      }
    }
    System.out.println("updateBookName method ended");
    return isUpdated;
  }

  // searching
  public static String getBookName(String bookName) {
    System.out.println("getBookName method started");
    for (int i = 0; i < bookNames.length; i++) {
      if (bookNames[i].equals(bookName)) {
        return bookNames[i];
      }
    }
    System.out.println("getBookName method ended");
    return "Book name not found";
  }
}
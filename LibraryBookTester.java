class LibraryBookTester {
  public static void main(String[] books) {
    System.out.println("Main method started");
    LibraryBook.addBookName("The God of Small Things");
    LibraryBook.addBookName("A Suitable Boy");
    LibraryBook.addBookName("The White Tiger");
    LibraryBook.addBookName("Midnight's Children");
    LibraryBook.addBookName("The Guide");
    LibraryBook.addBookName("The Shadow Lines");
    LibraryBook.addBookName("Train to Pakistan");
    LibraryBook.addBookName("The Namesake");
    LibraryBook.addBookName("The Glass Palace");
    LibraryBook.addBookName("The Hungry Tide");
    LibraryBook.addBookName("The Inheritance of Loss");
    LibraryBook.addBookName("The Palace of Illusions");
    LibraryBook.addBookName("In Custody");
    LibraryBook.addBookName("The Guide");
    LibraryBook.addBookName("Untouchable");
    LibraryBook.getBookName();
    boolean verify = LibraryBook.updateBookName("The White Tiger", "Serious Men");
    System.out.println("Book name is updated: " + verify);
    LibraryBook.getBookName();
    System.out.println("Main method ended");
  }
}
class SMGroceries {
  static String[] grocerieNames = { "bread", "milk", "eggs", "cheese", "yogurt", "apples", "bananas",
      "carrots", "broccoli", "chicken", "beef", "pork", "rice", "pasta", "sauce" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getGrocerieNames(); // calls getgrocerieNames
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getGrocerieNames() {
    System.out.println("List of Groceries in Supermarket:" + grocerieNames.length);
    for (int gr = 0; gr < grocerieNames.length; gr++) {
      System.out.println(grocerieNames[gr]); // Prints the Output
    }
    return;
  }
}
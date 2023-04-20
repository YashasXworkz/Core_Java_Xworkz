class SMGroceries {
  public static void main(String[] groceries) {
    String[] grocerieNames = { "bread", "milk", "eggs", "cheese", "yogurt", "apples", "bananas",
        "carrots", "broccoli", "chicken", "beef", "pork", "rice", "pasta", "sauce" };
    System.out.println("List of Super Market Groceries:");
    for (int i = 0; i < grocerieNames.length; i++) {
      System.out.println(grocerieNames[i]);
    }
  }
}
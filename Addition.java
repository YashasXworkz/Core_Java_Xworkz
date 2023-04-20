class Addition {
  public static void main(String[] addition) {
    System.out.println("Main Started");
    // passing the data is called arguments
    // invoking a method
    add(10, 20);
    add(30, 50);
    System.out.println("Main Ended");
  }

  // declaration of a method
  // always associated with parenthesis
  // inside parenthesis will have parameters
  public static void add(int a, int b) {
    System.out.println(a + b);
    return;
  }
}
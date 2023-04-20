class Operators {
  public static void main(String[] task) {
    System.out.println("Main Started");
    task(10, 2, 5);
    task("Hello", "Joe", "Good Morning");
    task(10.5, 5, 3.45);
    System.out.println("Main Ended");
  }

  public static void task(int x, int y, int z) {
    System.out.println("Addition:");
    System.out.println(x + y + z);
    System.out.println("Subraction:");
    System.out.println(x - y - z);
    System.out.println("Multiplication:");
    System.out.println(x * y * z);
    System.out.println("Division:");
    System.out.println(x / y);
  }

  public static void task(String x, String y, String z) {
    System.out.println("String Concatenation:");
    System.out.println(x + " " + y + " " + z);
  }

  public static void task(double x, int y, double z) {
    System.out.println("Datatypes:");
    System.out.println(x + y + z);
  }
}
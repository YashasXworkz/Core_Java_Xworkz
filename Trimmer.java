class Trimmer {
  static String brandName = "Zeus Volt Professional";
  static int price = 435;
  static String trimmingRange = "45mm";
  static String handleGripMaterial = "plastic";

  public static void main(String[] tri) {
    System.out.println(brandName);
    System.out.println(price);
    System.out.println(trimmingRange);
    System.out.println(handleGripMaterial);
    System.out.println("----------------");
    brandName = "Nova Volt Professional";
    price = 567;
    trimmingRange = "40mm";
    handleGripMaterial = "plastic";
    System.out.println(brandName);
    System.out.println(price);
    System.out.println(trimmingRange);
    System.out.println(handleGripMaterial);
  }
}
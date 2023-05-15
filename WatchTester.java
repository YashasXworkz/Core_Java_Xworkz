class WatchTester {
  public static void main(String[] watches) {
    System.out.println("Main method started");
    Watch watch1 = new Watch("Casio", 5000.0, "Black", "Analog");
    System.out.println("Brand: " + watch1.brandName + "\nColour: " + watch1.color + "\nPrice: Rs."
        + watch1.price + "\nType: " + watch1.type);
    System.out.println("---------------------");

    Watch watch2 = new Watch("Apple", 3000.0, "Silver", "Digital");
    System.out.println("Brand: " + watch2.brandName + "\nColour: " + watch2.color + "\nPrice: Rs."
        + watch2.price + "\nType: " + watch2.type);
    System.out.println("---------------------");

    Watch watch3 = new Watch("Timex", 4000.0, "Brown", "Analog");
    System.out.println("Brand: " + watch3.brandName + "\nColour: " + watch3.color + "\nPrice: Rs."
        + watch3.price + "\nType: " + watch3.type);
    System.out.println("---------------------");

    Watch watch4 = new Watch("Rolex", 10000.0, "Gold", "Analog");
    System.out.println("Brand: " + watch4.brandName + "\nColour: " + watch4.color + "\nPrice: Rs."
        + watch4.price + "\nType: " + watch4.type);
    System.out.println("---------------------");

    Watch watch5 = new Watch("Seiko", 1200.0, "Black", "Analog");
    System.out.println("Brand: " + watch5.brandName + "\nColour: " + watch5.color + "\nPrice: Rs."
        + watch5.price + "\nType: " + watch5.type);
    System.out.println("---------------------");

    Watch watch6 = new Watch("G-Shock", 8000.0, "Black", "Digital");
    System.out.println("Brand: " + watch6.brandName + "\nColour: " + watch6.color + "\nPrice: Rs."
        + watch6.price + "\nType: " + watch6.type);
    System.out.println("---------------------");

    Watch watch7 = new Watch("Tag Heuer", 5000.0, "Silver", "Analog");
    System.out.println("Brand: " + watch7.brandName + "\nColour: " + watch7.color + "\nPrice: Rs."
        + watch7.price + "\nType: " + watch7.type);
    System.out.println("---------------------");

    Watch watch8 = new Watch("Fossil", 1500.0, "Blue", "Analog");
    System.out.println("Brand: " + watch8.brandName + "\nColour: " + watch8.color + "\nPrice: Rs."
        + watch8.price + "\nType: " + watch8.type);
    System.out.println("---------------------");

    Watch watch9 = new Watch("Omega", 8000.0, "Silver", "Analog");
    System.out.println("Brand: " + watch9.brandName + "\nColour: " + watch9.color + "\nPrice: Rs."
        + watch9.price + "\nType: " + watch9.type);
    System.out.println("---------------------");

    Watch watch10 = new Watch("Timex", 3500.0, "Silver", "Analog");
    System.out.println("Brand: " + watch10.brandName + "\nColour: " + watch10.color + "\nPrice: Rs."
        + watch10.price + "\nType: " + watch10.type);
    System.out.println("---------------------");
    System.out.println("Main method ended");
  }
}
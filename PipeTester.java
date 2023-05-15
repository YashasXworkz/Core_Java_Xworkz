class PipeTester {
  public static void main(String[] waterPipe) {
    System.out.println("Main method started");
    Pipe pipe1 = new Pipe("PVC", 10.5, 2.0, "Blue", "Drainage");
    System.out.println("Material: " + pipe1.material + "\nLength: " + pipe1.length + " m" + "\nDiameter: "
        + pipe1.diameter + " cm" + "\nColour: " + pipe1.color + "\nType: " + pipe1.type);
    System.out.println("---------------------");

    Pipe pipe2 = new Pipe("PVC", 5.6, 0.8, "White", "Drainage");
    System.out.println("Material: " + pipe2.material + "\nLength: " + pipe2.length + " m" + "\nDiameter: "
        + pipe2.diameter + " cm" + "\nColour: " + pipe2.color + "\nType: " + pipe2.type);
    System.out.println("---------------------");

    Pipe pipe3 = new Pipe("Cast iron", 8.2, 1.1, "Gray", "Gas");
    System.out.println("Material: " + pipe3.material + "\nLength: " + pipe3.length + " m" + "\nDiameter: "
        + pipe3.diameter + " cm" + "\nColour: " + pipe3.color + "\nType: " + pipe3.type);
    System.out.println("---------------------");

    Pipe pipe4 = new Pipe("Concrete", 3.7, 1.4, "Gray", "Wastewater");
    System.out.println("Material: " + pipe4.material + "\nLength: " + pipe4.length + " m" + "\nDiameter: "
        + pipe4.diameter + " cm" + "\nColour: " + pipe4.color + "\nType: " + pipe4.type);
    System.out.println("---------------------");

    Pipe pipe5 = new Pipe("Stainless steel", 7.1, 1.0, "Silver", "Chemicals");
    System.out.println("Material: " + pipe5.material + "\nLength: " + pipe5.length + " m" + "\nDiameter: "
        + pipe5.diameter + " cm" + "\nColour: " + pipe5.color + "\nType: " + pipe5.type);
    System.out.println("---------------------");

    Pipe pipe6 = new Pipe("PVC", 10.4, 0.9, "White", "Drainage");
    System.out.println("Material: " + pipe6.material + "\nLength: " + pipe6.length + " m" + "\nDiameter: "
        + pipe6.diameter + " cm" + "\nColour: " + pipe6.color + "\nType: " + pipe6.type);
    System.out.println("---------------------");

    Pipe pipe7 = new Pipe("Polyethylene", 6.5, 1.2, "Black", "Irrigation");
    System.out.println("Material: " + pipe7.material + "\nLength: " + pipe7.length + " m" + "\nDiameter: "
        + pipe7.diameter + " cm" + "\nColour: " + pipe7.color + "\nType: " + pipe7.type);
    System.out.println("---------------------");

    Pipe pipe8 = new Pipe("Plastic", 7.5, 2.5, "Blue", "Drainage");
    System.out.println("Material: " + pipe8.material + "\nLength: " + pipe8.length + " m" + "\nDiameter: "
        + pipe8.diameter + " cm" + "\nColour: " + pipe8.color + "\nType: " + pipe8.type);
    System.out.println("---------------------");

    Pipe pipe9 = new Pipe("PVC", 5.7, 1.8, "White", "Irrigation");
    System.out.println("Material: " + pipe9.material + "\nLength: " + pipe9.length + " m" + "\nDiameter: "
        + pipe9.diameter + " cm" + "\nColour: " + pipe9.color + "\nType: " + pipe9.type);
    System.out.println("---------------------");

    Pipe pipe10 = new Pipe("Copper", 12.0, 1.3, "Bronze", "Drinking water");
    System.out.println("Material: " + pipe10.material + "\nLength: " + pipe10.length + " m" + "\nDiameter: "
        + pipe10.diameter + " cm" + "\nColour: " + pipe10.color + "\nType: " + pipe10.type);
    System.out.println("---------------------");
    System.out.println("Main method ended");
  }
}
class RiverTester {
  public static void main(String[] river) {
    System.out.println("Main method started");
    River river1 = new River("Nile", 6650, 8, "Egypt", "Lake Victoria");
    System.out.println("Name: " + river1.name + "\nLength: " + river1.length + " km" + "\nDepth: " + river1.depth + " m"
        + "\nCountry: " + river1.country + "\nSource: " + river1.source);
    System.out.println("---------------------");

    River river2 = new River("Amazon", 6575, 100, "South America", "Andes Mountains");
    System.out.println("Name: " + river2.name + "\nLength: " + river2.length + " km" + "\nDepth: " + river2.depth + " m"
        + "\nCountry: " + river2.country + "\nSource: " + river2.source);
    System.out.println("---------------------");

    River river3 = new River("Yangtze", 6300, 98, "China", "Tibetan Plateau");
    System.out.println("Name: " + river3.name + "\nLength: " + river3.length + " km" + "\nDepth: " + river3.depth + " m"
        + "\nCountry: " + river3.country + "\nSource: " + river3.source);
    System.out.println("---------------------");

    River river4 = new River("Mississippi", 6275, 61, "United States", "Lake Itasca");
    System.out.println("Name: " + river4.name + "\nLength: " + river4.length + " km" + "\nDepth: " + river4.depth + " m"
        + "\nCountry: " + river4.country + "\nSource: " + river4.source);
    System.out.println("---------------------");

    River river5 = new River("Yenisei", 5549, 30, "Russia", "Mongolian Plateau");
    System.out.println("Name: " + river5.name + "\nLength: " + river5.length + " km" + "\nDepth: " + river5.depth + " m"
        + "\nCountry: " + river5.country + "\nSource: " + river5.source);
    System.out.println("---------------------");

    River river6 = new River("Amazon", 6575, 20, "Brazil", "Andes");
    System.out.println("Name: " + river6.name + "\nLength: " + river6.length + " km" + "\nDepth: " + river6.depth + " m"
        + "\nCountry: " + river6.country + "\nSource: " + river6.source);
    System.out.println("---------------------");

    River river7 = new River("Nile", 6650, 26, "Egypt", "Lake Victoria");
    System.out.println("Name: " + river7.name + "\nLength: " + river7.length + " km" + "\nDepth: " + river7.depth + " m"
        + "\nCountry: " + river7.country + "\nSource: " + river7.source);
    System.out.println("---------------------");

    River river8 = new River("Ganges", 2704, 16, "India", "Gangotri Glacier");
    System.out.println("Name: " + river8.name + "\nLength: " + river8.length + " km" + "\nDepth: " + river8.depth + " m"
        + "\nCountry: " + river8.country + "\nSource: " + river8.source);
    System.out.println("---------------------");

    River river9 = new River("Danube", 2850, 10, "Europe", "Black Forest");
    System.out.println("Name: " + river9.name + "\nLength: " + river9.length + " km" + "\nDepth: " + river9.depth + " m"
        + "\nCountry: " + river9.country + "\nSource: " + river9.source);
    System.out.println("---------------------");

    River river10 = new River("Volga", 3530, 27, "Russia", "Valdai Hills");
    System.out.println("Name: " + river10.name + "\nLength: " + river10.length + " km" + "\nDepth: " + river10.depth
        + " m" + "\nCountry: " + river10.country + "\nSource: " + river10.source);
    System.out.println("---------------------");
    System.out.println("Main method ended");
  }
}
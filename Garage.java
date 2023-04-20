class Garage {
  static String[] workerNames = { "Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace",
      "Hannah", "Isaac", "Jasmine", "Katie", "Liam", "Mia", "Nathan", "Olivia" };

  public static void main(String[] methEx) {
    getWorkerNames();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getWorkerNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Garage Workers:" + workerNames.length);
    for (int wo = 0; wo < workerNames.length; wo++) {
      System.out.println(workerNames[wo]);
    }
    return;
  }
}

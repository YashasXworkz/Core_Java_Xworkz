class Temples {
  static String[] godNames = { "Tirumala Venkateswara Temple", "Kashi Vishwanath Temple", "Somnath Temple",
      "Jagannath Temple", "Meenakshi Temple", "Brihadeeswarar Temple", "Siddhivinayak Temple",
      "Akshardham Temple", "Golden Temple", "Sabarimala Temple", "Lotus Temple",
      "Vaishno Devi Temple", "Padmanabhaswamy Temple", "Amarnath Temple", "Kedarnath Temple",
      "Kamakhya Temple", "Ramanathaswamy Temple", "Lingaraj Temple", "Sri Ranganathaswamy Temple",
      "Shirdi Sai Baba Temple" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getGodNames();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getGodNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Indian Temples:" + godNames.length);
    for (int go = 0; go < godNames.length; go++) {
      System.out.println(godNames[go]); // Prints the output
    }
    return;
  }
}

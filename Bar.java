class Bar {
  static String[] alcohol = { "McDowells", "Kingfisher", "Richard", "Chivas Regal", "Crown Royal",
      "Smirnoff", "Jack Daniel's", "Havana Club", "Grant's", "Jim Beam", "Jagermeister", "Jameson",
      "Baileys", "Fernet Branca", "Fireball" };

  public static void main(String[] bar) {
    // System.out.println("List of alcohol brands avaliable without for loop:");
    // System.out.println("1) " + alcohol[0] + "\n" + "2) " + alcohol[1] + "\n" +
    // "3) " +
    // alcohol[2] + "\n" + "4) " + alcohol[3] + "\n" + "5) " + alcohol[4] + "\n" +
    // "6) " + alcohol[5] + "\n" + "7) " + alcohol[6] + "\n" + "8) " + alcohol[7] +
    // "\n" +
    // "9) " + alcohol[8] + "\n" + "10) " + alcohol[9] + "\n" + "11) " + alcohol[10]
    // + "\n" +
    // "12) " + alcohol[11] + "\n" + "13) " + alcohol[12] + "\n" + "14) " +
    // alcohol[13] + "\n" +
    // "15) " + alcohol[14] + "\n");
    System.out.println("List of alcohol brands avaliable with for loop:");
    for (int x = 0; x <= alcohol.length - 1; x++) {
      System.out.println(alcohol[x]); // block of code
    }
  }
}

// <,>,!-.--.<=,>= - Relational Operators which only returns True or False
// first statement will check once
// for(statement1(declaration-init);statement2(condition using relational
// operator);statement3(increment)) {}
// if the condition is false it will come out of the loop or stop the iteration
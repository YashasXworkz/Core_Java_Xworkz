public class CreditCards {
  static String[] cardNames = { "SBI Card", "ICICI Bank Credit Card", "HDFC Bank Credit Card", "Axis Bank Credit Card",
      "Kotak Mahindra Bank Credit Card", "IndusInd Bank Credit Card", "Standard Chartered Credit Card",
      "American Express Credit Card", "Citi Bank Credit Card", "PNB Credit Card", "Bank of Baroda Credit Card",
      "Canara Bank Credit Card", "Union Bank Credit Card", "IDBI Bank Credit Card", "Central Bank Credit Card",
      "Andhra Bank Credit Card", "Syndicate Bank Credit Card", "Indian Bank Credit Card",
      "Corporation Bank Credit Card", "Punjab & Sind Bank Credit Card" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getCardNames();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getCardNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Credit Cards:" + cardNames.length);
    for (int bc = 0; bc < cardNames.length; bc++) {
      System.out.println(cardNames[bc]);
    }
    return;
  }
}

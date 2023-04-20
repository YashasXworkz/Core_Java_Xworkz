class MncCompany {
  static String[] mncCompanies = { "Tata Consultancy Services", "Infosys", "Wipro", "HCL Technologies",
      "Tech Mahindra", "Larsen & Toubro Infotech", "Mindtree", "Persistent Systems",
      "Hexaware Technologies", "Mphasis" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getMncCompanies();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getMncCompanies() {
    System.out.println("---------------------------------------");
    System.out.println("List of MNC Companies:" + mncCompanies.length);
    for (int mn = 0; mn < mncCompanies.length; mn++) {
      System.out.println(mncCompanies[mn]);
    }
    return;
  }
}

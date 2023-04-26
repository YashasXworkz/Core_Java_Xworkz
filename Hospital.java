class Hospital {
  static String[] doctorNames = { "Dr. Alok", "Dr. Anjali", "Dr. Rajesh", "Dr. Shalini", "Dr. Ravi",
      "Dr. Sanjay", "Dr. Geeta", "Dr. Shikha", "Dr. Anil", "Dr. Nisha", "Dr. Neha", "Dr. Vivek",
      "Dr. Neelam", "Dr. Mohan", "Dr. Preeti" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getDoctorNames();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getDoctorNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Hospital Doctors:" + doctorNames.length);
    for (int dr = 0; dr < doctorNames.length; dr++) {
      System.out.println(doctorNames[dr]);
    }
    return;
  }
}

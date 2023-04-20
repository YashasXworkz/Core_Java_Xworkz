public class CollegeDept {
  static String[] departmentNames = { "Computer Science", "Electrical Engineering", "Mechanical Engineering",
      "Chemical Engineering", "Civil Engineering", "Biology", "Physics",
      "Chemistry", "Mathematics", "Psychology", "Sociology", "History",
      "English", "Philosophy", "Music" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getDepartmentNames();
    System.out.println("-----------------Main Ended-----------------");
  }

  public static void getDepartmentNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of College Departments:" + departmentNames.length);
    for (int cd = 0; cd < departmentNames.length; cd++) {
      System.out.println(departmentNames[cd]);
    }
    return;
  }
}

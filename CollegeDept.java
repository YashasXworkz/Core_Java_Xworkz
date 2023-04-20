class CollegeDept {
  public static void main(String[] deptNames) {
    String[] departmentNames = { "Computer Science", "Electrical Engineering", "Mechanical Engineering",
        "Chemical Engineering", "Civil Engineering", "Biology", "Physics",
        "Chemistry", "Mathematics", "Psychology", "Sociology", "History",
        "English", "Philosophy", "Music" };
    System.out.println("List of College Departments:");
    for (int i = 0; i < departmentNames.length; i++) {
      System.out.println(departmentNames[i]);
    }
  }
}
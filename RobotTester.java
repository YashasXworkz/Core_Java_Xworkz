class RobotTester {
  public static void main(String[] robo) {
    System.out.println("Main method started");
    Robot robot1 = new Robot("Atlas", "Humanoid", 2013, "USA", "Boston Dynamics");
    System.out.println("Robot name: " + robot1.name + "\nType: " + robot1.type + "\nYear: " + robot1.year
        + "\nCountry: " + robot1.country + "\nCreator: " + robot1.creator);
    System.out.println("---------------------");

    Robot robot2 = new Robot("Sophia", "Humanoid", 2016, "Hong Kong", "Hanson Robotics");
    System.out.println("Robot name: " + robot2.name + "\nType: " + robot2.type + "\nYear: " + robot2.year
        + "\nCountry: " + robot2.country + "\nCreator: " + robot2.creator);
    System.out.println("---------------------");

    Robot robot3 = new Robot("NAO", "Humanoid", 2006, "France", "Aldebaran Robotics");
    System.out.println("Robot name: " + robot3.name + "\nType: " + robot3.type + "\nYear: " + robot3.year
        + "\nCountry: " + robot3.country + "\nCreator: " + robot3.creator);
    System.out.println("---------------------");

    Robot robot4 = new Robot("Pepper", "Humanoid", 2014, "France", "SoftBank Robotics");
    System.out.println("Robot name: " + robot4.name + "\nType: " + robot4.type + "\nYear: " + robot4.year
        + "\nCountry: " + robot4.country + "\nCreator: " + robot4.creator);
    System.out.println("---------------------");

    Robot robot5 = new Robot("Spot", "Quadruped", 2016, "USA", "Boston Dynamics");
    System.out.println("Robot name: " + robot5.name + "\nType: " + robot5.type + "\nYear: " + robot5.year
        + "\nCountry: " + robot5.country + "\nCreator: " + robot5.creator);
    System.out.println("---------------------");

    Robot robot6 = new Robot("RoboCup Soccer Robots", "Robot soccer", 1997, "International", "RoboCup Federation");
    System.out.println("Robot name: " + robot6.name + "\nType: " + robot6.type + "\nYear: " + robot6.year
        + "\nCountry: " + robot6.country + "\nCreator: " + robot6.creator);
    System.out.println("---------------------");

    Robot robot7 = new Robot("Kirobo", "Space", 2013, "Japan", "Toyota Motor Corporation");
    System.out.println("Robot name: " + robot7.name + "\nType: " + robot7.type + "\nYear: " + robot7.year
        + "\nCountry: " + robot7.country + "\nCreator: " + robot7.creator);
    System.out.println("---------------------");

    Robot robot8 = new Robot("Aibo", "Companion", 1999, "Japan", "Sony");
    System.out.println("Robot name: " + robot8.name + "\nType: " + robot8.type + "\nYear: " + robot8.year
        + "\nCountry: " + robot8.country + "\nCreator: " + robot8.creator);
    System.out.println("---------------------");

    Robot robot9 = new Robot("Roomba", "Vacuum cleaner", 2002, "USA", "iRobot");
    System.out.println("Robot name: " + robot9.name + "\nType: " + robot9.type + "\nYear: " + robot9.year
        + "\nCountry: " + robot9.country + "\nCreator: " + robot9.creator);
    System.out.println("---------------------");

    Robot robot10 = new Robot("Asimo", "Humanoid", 2000, "Japan", "Honda");
    System.out.println("Robot name: " + robot10.name + "\nType: " + robot10.type + "\nYear: " + robot10.year
        + "\nCountry: " + robot10.country + "\nCreator: " + robot10.creator);
    System.out.println("---------------------");
    System.out.println("Main method ended");
  }
}
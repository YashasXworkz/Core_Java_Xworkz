class Car {
  static boolean isEngineOn; // false
  static String brand = "Toyota";
  static double price = 25000.00;
  static int maxSpeed = 120;
  static int minSpeed;
  static int currentSpeed;

  public static void main(String[] specs) {
    System.out.println("Main Started");
    turnOnOrOffEngine();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    System.out.println("Engine is on: " + isEngineOn);
    turnOnOrOffEngine();
    accelerate();
    decelerate();
    System.out.println("Main Ended");
  }

  public static boolean turnOnOrOffEngine() {
    System.out.println("----------------------------------------------");
    System.out.println("turnOnOrOffEngine Method started");
    // Conditional Statements
    // false == false
    if (isEngineOn == false) {
      isEngineOn = true;
      System.out.println("Engine is turned on......");
    } else if (isEngineOn == true) {
      isEngineOn = false;
      System.out.println("Engine is turned off......");
    }
    System.out.println("turnOnOrOffEngine Method ended");
    System.out.println("----------------------------------------------");
    return isEngineOn;
  }

  public static int accelerate() {
    System.out.println("accelerate Method started");
    // false == true
    if (isEngineOn == true) {
      if (currentSpeed < maxSpeed) {
        System.out.println("Current Speed is less than Max Speed. Proceeding to accelerate.");
        currentSpeed = currentSpeed + 10;
        System.out.println("The current speed is " + currentSpeed + " mph");
      } else {
        System.out.println("Max Speed is reached");
      }
    } else {
      System.out.println("Turn on the Engine");
    }
    System.out.println("accelerate Method ended");
    System.out.println("----------------------------------------------");
    return currentSpeed;
  }

  public static int decelerate() {
    System.out.println("decelerate Method started");
    if (isEngineOn == true) {
      if (minSpeed > currentSpeed) {
        System.out.println("Current Speed is greater than Min Speed. Proceeding to decelerate.");
        maxSpeed = maxSpeed - 10;
        System.out.println("The current speed is " + maxSpeed + " mph");
      } else {
        System.out.println("Min Speed is reached");
      }
    } else {
      System.out.println("Turn Off the Engine");
    }
    System.out.println("decelerate Method ended");
    System.out.println("----------------------------------------------");
    return minSpeed;
  }
}
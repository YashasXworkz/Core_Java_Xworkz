class Car {
  static boolean isEngineOn;
  static String brand = "BMW";
  static double price = 600000;
  static int maxSpeed = 120;
  static int minSpeed = 40;
  static int currentSpeed;

  public static boolean turnOnOrOffEngine() {
    System.out.println("turnOnOrOffEngine method started");
    if (isEngineOn) {
      System.out.println("Engine is turned off......");
      isEngineOn = false;
    } else {
      System.out.println("Engine is turned on......");
      isEngineOn = true;
    }
    System.out.println("turnOnOrOffEngine method ended");
    return isEngineOn;
  }

  public static int accelerate() {
    System.out.println("accelerate method started");
    if (isEngineOn) {
      if (currentSpeed <= maxSpeed) {
        currentSpeed += 10;
        System.out.println("Current speed: " + currentSpeed + " mph");
      }
      if (currentSpeed == maxSpeed) {
        System.out.println("Max speed reached.");
      }
    } else {
      System.out.println("Turn on the engine first.");
    }
    System.out.println("accelerate method ended");
    return currentSpeed;
  }

  public static int decelerate() {
    System.out.println("decelerate method started");
    if (isEngineOn) {
      if (currentSpeed > minSpeed) {
        currentSpeed -= minSpeed;
        System.out.println("Current speed: " + currentSpeed + " mph");
        if (currentSpeed == minSpeed) {
          System.out.println("Min speed reached.");
        }
      }
    } else {
      System.out.println("Turn on the engine first.");
    }
    System.out.println("decelerate method ended");
    return currentSpeed;
  }

  public static void main(String[] car) {
    System.out.println("Main started");
    turnOnOrOffEngine();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    accelerate();
    System.out.println("Engine is on: " + isEngineOn);
    decelerate();
    decelerate();
    turnOnOrOffEngine();
    accelerate();
    System.out.println("Main ended");
  }
}
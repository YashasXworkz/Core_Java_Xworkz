class Television {
  static boolean isPowerOn;
  static String brand = "Sony";
  static double price = 30000;
  static int maxVolume = 100;
  static int minVolume = 20;
  static int currentVolume;

  public static boolean turnOnOrOffPower() {
    System.out.println("turnOnOrOffPower method started");
    if (isPowerOn) {
      System.out.println("Television is turned off......");
      isPowerOn = false;
    } else {
      System.out.println("Television is turned on......");
      isPowerOn = true;
    }
    System.out.println("turnOnOrOffPower method ended");
    return isPowerOn;
  }

  public static int increaseVolume() {
    System.out.println("increaseVolume method started");
    if (isPowerOn) {
      if (currentVolume < maxVolume) {
        currentVolume += 10;
        System.out.println("Current volume: " + currentVolume);
      }
      if (currentVolume == maxVolume) {
        System.out.println("Max volume reached.");
      }
    } else {
      System.out.println("Turn on the television first.");
    }
    System.out.println("increaseVolume method ended");
    return currentVolume;
  }

  public static int decreaseVolume() {
    System.out.println("decreaseVolume method started");
    if (isPowerOn) {
      if (currentVolume > minVolume) {
        currentVolume -= minVolume;
        System.out.println("Current volume: " + currentVolume);
        if (currentVolume == minVolume) {
          System.out.println("Min volume reached.");
        }
      }
    } else {
      System.out.println("Turn on the television first.");
    }
    System.out.println("decreaseVolume method ended");
    return currentVolume;
  }

  public static void main(String[] television) {
    System.out.println("Main started");
    turnOnOrOffPower();
    increaseVolume();
    increaseVolume();
    increaseVolume();
    increaseVolume();
    increaseVolume();
    increaseVolume();
    increaseVolume();
    increaseVolume();
    increaseVolume();
    increaseVolume();
    System.out.println("Television is on: " + isPowerOn);
    decreaseVolume();
    decreaseVolume();
    decreaseVolume();
    decreaseVolume();
    turnOnOrOffPower();
    increaseVolume();
    System.out.println("Main ended");
  }
}
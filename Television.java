class Television {
  static boolean isConnected; // false
  static String brand = "Sony";
  static double price = 50000.00;
  static int maxVolume = 100;
  static int minVolume = 0;
  static int currentVolume = 50;

  public static void main(String[] args) {
    System.out.println("Main Started");
    turnOnOrOff();
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
    increaseVolume();
    System.out.println("TV is connected " + isConnected);
    turnOnOrOff();
    System.out.println("Main Ended");
  }

  public static boolean turnOnOrOff() {
    System.out.println("----------------------------------------------");
    System.out.println("turnOnOrOff Method is started");
    // Conditional Statements
    // false == false
    if (isConnected == false) {
      isConnected = true;
      System.out.println("TV is turned on......");
    } else if (isConnected == true) {
      isConnected = false;
      System.out.println("TV is turned off......");
    }
    System.out.println("turnOnOrOff Method is ended");
    System.out.println("----------------------------------------------");
    return isConnected;
  }

  public static int increaseVolume() {
    System.out.println("increaseVolume Method is started");
    // false == true
    if (isConnected == true) {
      if (currentVolume < maxVolume) {
        System.out.println("Current Volume is less than Max Volume proceed");
        currentVolume = currentVolume + 5;
        System.out.println("The current volume is " + currentVolume);
      } else {
        System.out.println("Max Volume is reached");
      }
    } else {
      System.out.println("Turn on the TV");
    }
    System.out.println("increaseVolume Method is ended");
    System.out.println("----------------------------------------------");
    return currentVolume;
  }

  public static int decreaseVolume() {
    System.out.println("decreaseVolume Method is started");
    if (isConnected == true) {
      if (minVolume < currentVolume) {
        System.out.println("Current Volume is greater than Min Volume");
        currentVolume = currentVolume - 5;
        System.out.println("The Current Volume is " + currentVolume);
      } else {
        System.out.println("Min Volume is reached");
      }
    } else {
      System.out.println("Turn Off the TV");
    }
    System.out.println("decreaseVolume Method is ended");
    System.out.println("----------------------------------------------");
    return minVolume;
  }
}
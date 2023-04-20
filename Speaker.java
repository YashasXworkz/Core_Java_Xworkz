class Speaker {
   static boolean isConnected; // false
   static String name = "Bolt";
   static double price = 3000.00;
   static int maxVolume = 8;
   static int minVolume;
   static int currentVolume;

   public static void main(String[] speaker) {
      System.out.println("Main Started");
      onOrOff();
      increaseVolume();
      increaseVolume();
      increaseVolume();
      increaseVolume();
      increaseVolume();
      increaseVolume();
      System.out.println("Speaker is connected " + isConnected);
      onOrOff();
      increaseVolume();
      decreaseVolume();
      System.out.println("Main Ended");
   }
// Method is the functionality of the class
   public static boolean onOrOff() {
      System.out.println("----------------------------------------------");
      System.out.println("onOrOff Method is started");
      // Conditional Statements
      // false == false
      if (isConnected == false) {
         isConnected = true; // reassign
         System.out.println("Speaker is turned on......");
      } else if (isConnected == true) {
         isConnected = false;
         System.out.println("Speaker is turned off......");
      }
      System.out.println("onOrOff Method is ended");
      System.out.println("----------------------------------------------");
      return isConnected;
   }

   public static int increaseVolume() {
      System.out.println("increaseVolume Method is started");
      // false == true
      if (isConnected == true) {
         if (currentVolume < maxVolume) {
            System.out.println("Current Volume is less than Max Volume proceed");
            currentVolume = currentVolume + 1;
            System.out.println("The current volume is " + currentVolume);
         } else {
            System.out.println("Max Volume is reached");
         }
      } else {
         System.out.println("Turn on the Speaker");
      }
      System.out.println("increaseVolume Method is ended");
      System.out.println("----------------------------------------------");
      return currentVolume;
   }

   public static int decreaseVolume() {
      System.out.println("decreaseVolume is started");
      if (isConnected == true) {
         if (minVolume > currentVolume) {
            System.out.println("Current Volume is greater than Min Volume");
            currentVolume = currentVolume - 1;
            System.out.println("The Current Volume is " + maxVolume);
         } else {
            System.out.println("Min Volume is reached");
         }
      } else {
         System.out.println("Turn On the Speaker");
      }
      System.out.println("decreaseVolume Method is ended");
      System.out.println("----------------------------------------------");
      return minVolume;
   }
}
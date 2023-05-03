class RestaurantTester {
  public static void main(String[] menus) {
    System.out.println("Main method started");
    Restaurant.addMenuItem("Butter Chicken");
    Restaurant.addMenuItem("Paneer Tikka");
    Restaurant.addMenuItem("Chicken Tikka Masala");
    Restaurant.addMenuItem("Palak Paneer");
    Restaurant.addMenuItem("Chana Masala");
    Restaurant.addMenuItem("Dal Makhani");
    Restaurant.addMenuItem("Rajma Masala");
    Restaurant.addMenuItem("Aloo Gobi");
    Restaurant.addMenuItem("Fish Curry");
    Restaurant.addMenuItem("Biryani");
    Restaurant.addMenuItem("Tandoori Chicken");
    Restaurant.addMenuItem("Chaat");
    Restaurant.addMenuItem("Samosa");
    Restaurant.addMenuItem("Noodles");
    Restaurant.addMenuItem("Fried Rice");
    Restaurant.addMenuItem(null); // Extra argument to check whether menu item is null
    Restaurant.getMenu();
    boolean verify = Restaurant.updateMenuItem("Biryani", "Veg Biryani");
    System.out.println("Menu item is updated: " + verify);
    Restaurant.getMenu();
    String isPresent = Restaurant.getMenu("Chaat");
    System.out.println("Searched menu item is: " + isPresent);
    System.out.println("Main method ended");
  }
}
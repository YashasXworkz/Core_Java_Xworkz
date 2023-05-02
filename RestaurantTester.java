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
    Restaurant.getMenu();
    boolean verify = Restaurant.updateMenuItem("Biryani", "Veg Biryani");
    System.out.println("Menu item is updated: " + verify);
    Restaurant.getMenu();
    System.out.println("Main method ended");
  }
}
class Cameraa {
	static String brandName = "Canon";
	static int prize = 36990;
	static String modelName = "eos1500d";
	static String formFactor = "hand held";
	static double effectiveStill = 24.10;
	static String opticalZoom = "3x";
	static String color = "black";

	public static void main(String[] camera) {
		System.out.println("Brand: " + brandName);
		System.out.println("MRP: " + prize);
		System.out.println("Model: " + modelName);
		System.out.println("Use: " + formFactor);
		System.out.println("Still: " + effectiveStill);
		System.out.println("Zoom: " + opticalZoom);
		System.out.println("Colour: " + color);
		System.out.println("---------------");
		brandName = "Nicon";
		prize = 45285;
		modelName = "1500d";
		formFactor = "hand held";
		effectiveStill = 42.10;
		opticalZoom = "5x";
		color = "black";
		System.out.println("Brand: " + brandName);
		System.out.println("MRP: " + prize);
		System.out.println("Model: " + modelName);
		System.out.println("Use: " + formFactor);
		System.out.println("Still: " + effectiveStill);
		System.out.println("Zoom: " + opticalZoom);
		System.out.println("Colour: " + color);
	}
}
class GameTester {
	public static void main(String[] playGame) {
		System.out.println("Main method started");
		Game game1 = new Game("Counter Strike: Global Offensive", 2012, 699.0, "Valve Corporation", "United States");
		System.out.println("Name: " + game1.name + "\nYear: " + game1.year + "\nPrice: Rs." + game1.price + "\nCreator: "
				+ game1.creator + "\nCountry: " + game1.country);
		System.out.println("---------------------");

		Game game2 = new Game("Grand Theft Auto V", 2013, 1999.0, "Rockstar North", "United Kingdom");
		System.out.println("Name: " + game2.name + "\nYear: " + game2.year + "\nPrice: Rs." + game2.price + "\nCreator: "
				+ game2.creator + "\nCountry: " + game2.country);
		System.out.println("---------------------");

		Game game3 = new Game("Far Cry 5", 2018, 1499.0, "Ubisoft Montreal", "Canada");
		System.out.println("Name: " + game3.name + "\nYear: " + game3.year + "\nPrice: Rs." + game3.price + "\nCreator: "
				+ game3.creator + "\nCountry: " + game3.country);
		System.out.println("---------------------");

		Game game4 = new Game("Assassin's Creed Odyssey", 2018, 1999.0, "Ubisoft Quebec", "Canada");
		System.out.println("Name: " + game4.name + "\nYear: " + game4.year + "\nPrice: Rs." + game4.price + "\nCreator: "
				+ game4.creator + "\nCountry: " + game4.country);
		System.out.println("---------------------");

		Game game5 = new Game("Doom Eternal", 2020, 1999.0, "id Software", "United States");
		System.out.println("Name: " + game5.name + "\nYear: " + game5.year + "\nPrice: Rs." + game5.price + "\nCreator: "
				+ game5.creator + "\nCountry: " + game5.country);
		System.out.println("---------------------");

		Game game6 = new Game("Grand Theft Auto V", 2013, 1499.0, "Rockstar North", "United Kingdom");
		System.out.println("Name: " + game6.name + "\nYear: " + game6.year + "\nPrice: Rs." + game6.price + "\nCreator: "
				+ game6.creator + "\nCountry: " + game6.country);
		System.out.println("---------------------");

		Game game7 = new Game("Minecraft", 2011, 699.0, "Mojang Studios", "Sweden");
		System.out.println("Name: " + game7.name + "\nYear: " + game7.year + "\nPrice: Rs." + game7.price + "\nCreator: "
				+ game7.creator + "\nCountry: " + game7.country);
		System.out.println("---------------------");

		Game game8 = new Game("World of Warcraft", 2004, 3999.0, "Blizzard Entertainment", "United States");
		System.out.println("Name: " + game8.name + "\nYear: " + game8.year + "\nPrice: Rs." + game8.price + "\nCreator: "
				+ game8.creator + "\nCountry: " + game8.country);
		System.out.println("---------------------");

		Game game9 = new Game("Half-Life: Alyx", 2020, 999.0, "Valve Corporation", "United States");
		System.out.println("Name: " + game9.name + "\nYear: " + game9.year + "\nPrice: Rs." + game9.price + "\nCreator: "
				+ game9.creator + "\nCountry: " + game9.country);
		System.out.println("---------------------");

		Game game10 = new Game("Fallout 4", 2015, 1299.0, "Bethesda Game Studios", "United States");
		System.out.println("Name: " + game10.name + "\nYear: " + game10.year + "\nPrice: Rs." + game10.price + "\nCreator: "
				+ game10.creator + "\nCountry: " + game10.country);
		System.out.println("---------------------");
		System.out.println("Main method ended");
	}
}
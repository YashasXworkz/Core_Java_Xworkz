class MethodEx {
  // SuperMarket - Groceries, Chocolates, Perfumes, Shampoos, Soaps, Tshirts
  static String[] grocerieNames = { "bread", "milk", "eggs", "cheese", "yogurt", "apples", "bananas",
      "carrots", "broccoli", "chicken", "beef", "pork", "rice", "pasta", "sauce" };

  static String[] chocolateBrands = { "KitKat", "Snickers", "Cadbury Dairy Milk", "Galaxy", "Mars", "Bounty", "Twix",
      "Reese's", "Milky Way", "Lindt", "Ferrero Rocher", "Toblerone", "Nestle Crunch", "Hershey's", "M&M's" };

  static String[] perfumeBrands = { "Ajmal", "Amouage", "Bvlgari", "Calvin Klein", "Chanel", "Dior", "Gucci",
      "Hugo Boss", "Jaguar", "Lacoste", "Mont Blanc", "Nautica", "Paco Rabanne", "Tom Ford", "Versace" };

  static String[] shampooBrands = { "Head & Shoulders", "Pantene", "Herbal Essences", "Garnier", "L'Oreal", "Tresemme",
      "Dove", "Aussie", "OGX", "Nexxus", "Suave", "Paul Mitchell", "Redken", "Biolage", "Matrix" };

  static String[] soapBrands = { "Dettol", "Lifebuoy", "Santoor", "Pears", "Lux", "Cinthol", "Mysore Sandal", "Medimix",
      "Hamam", "Chandrika", "Ayush", "Park Avenue", "Fiama Di Wills", "Godrej No. 1", "Biotique" };

  static String[] tshirtBrands = { "Wrogn", "Roadster", "HRX", "Flying Machine", "Pepe Jeans",
      "United Colors of Benetton", "Tommy Hilfiger", "Puma", "Nike", "Adidas", "Reebok", "Fila", "Levis", "Mufti",
      "Jack & Jones" };

  // Netflix Series - English, Hindi, Korean
  static String[] seriesEngNames = { "Stranger Things", "The Crown", "Narcos", "Black Mirror", "The Witcher",
      "Money Heist", "Ozark", "The Queen's Gambit", "Breaking Bad", "Orange is the New Black",
      "The Umbrella Academy", "Peaky Blinders", "The Haunting of Hill House", "Dark", "The Irishman" };

  static String[] seriesHindiNames = { "Ludo", "Gunjan Saxena: The Kargil Girl", "The White Tiger", "Raat Akeli Hai",
      "Bulbbul", "Choked", "Guilty", "Class of '83", "Love per Square Foot", "Dolly Kitty Aur Woh Chamakte Sitare",
      "Mrs. Serial Killer", "Ghost Stories", "Drive", "Kaali Khuhi", "Pagglait" };

  static String[] koreanDramas = { "Crash Landing on You", "Itaewon Class", "Descendants of the Sun",
      "Goblin", "Reply 1988", "Mr. Sunshine", "Vincenzo", "Kingdom",
      "Signal", "Hospital Playlist", "My Love from the Star", "Start-Up",
      "Stranger", "Sky Castle", "Love Alarm" };

  // Chaat Shop - Chaats
  static String[] chaatNames = { "Pani Puri", "Sev Puri", "Bhel Puri", "Dahi Puri", "Aloo Tikki Chaat",
      "Papdi Chaat", "Ragda Patties", "Samosa Chaat", "Chana Chaat", "Dahi Bhalla", "Aloo Chaat",
      "Kachori Chaat", "Corn Chaat", "Fruit Chaat", "Chole Tikki Chaat" };

  // College - Department Names
  static String[] departmentNames = { "Computer Science", "Electrical Engineering", "Mechanical Engineering",
      "Chemical Engineering", "Civil Engineering", "Biology", "Physics",
      "Chemistry", "Mathematics", "Psychology", "Sociology", "History",
      "English", "Philosophy", "Music" };

  // Credit Cards - Card Names
  static String[] cardNames = { "SBI Card", "ICICI Bank Credit Card", "HDFC Bank Credit Card", "Axis Bank Credit Card",
      "Kotak Mahindra Bank Credit Card", "IndusInd Bank Credit Card", "Standard Chartered Credit Card",
      "American Express Credit Card", "Citi Bank Credit Card", "PNB Credit Card", "Bank of Baroda Credit Card",
      "Canara Bank Credit Card", "Union Bank Credit Card", "IDBI Bank Credit Card", "Central Bank Credit Card",
      "Andhra Bank Credit Card", "Syndicate Bank Credit Card", "Indian Bank Credit Card",
      "Corporation Bank Credit Card", "Punjab & Sind Bank Credit Card" };

  // Garage - Worker Names
  static String[] workerNames = { "Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace",
      "Hannah", "Isaac", "Jasmine", "Katie", "Liam", "Mia", "Nathan", "Olivia" };

  // Hospital - Doctor Names
  static String[] doctorNames = { "Dr. Alok", "Dr. Anjali", "Dr. Rajesh", "Dr. Shalini", "Dr. Ravi",
      "Dr. Sanjay", "Dr. Geeta", "Dr. Shikha", "Dr. Anil", "Dr. Nisha", "Dr. Neha", "Dr. Vivek",
      "Dr. Neelam", "Dr. Mohan", "Dr. Preeti" };

  // Icecream - Icecream Flavor Names
  static String[] iceCreamFlavors = { "Chocolate", "Vanilla", "Strawberry", "Mint Chocolate Chip",
      "Rocky Road", "Butter Pecan", "Cookies and Cream", "Coffee",
      "Mango Sorbet", "Raspberry Sorbet", "Lemon Sorbet", "Mint Chocolate",
      "Pistachio", "Caramel Swirl", "Chocolate Chip Cookie Dough", "Birthday Cake",
      "Mint Chip", "Cherry Garcia", "Chunky Monkey", "Phish Food" };

  // Mnc - MNC Company Names
  static String[] mncCompanies = { "Tata Consultancy Services", "Infosys", "Wipro", "HCL Technologies",
      "Tech Mahindra", "Larsen & Toubro Infotech", "Mindtree", "Persistent Systems",
      "Hexaware Technologies", "Mphasis" };

  // Pub - Pub Names
  static String[] pubNames = { "The Red Lion", "The Crown Inn", "The Royal Oak", "The White Horse",
      "The Black Bull", "The Blue Boar", "The Rose and Crown", "The Plough", "The Bell", "The Swan",
      "The King's Head", "The Coach and Horses", "The George and Dragon", "The Golden Lion",
      "The Bear and Staff", "The Wheatsheaf", "The Cross Keys", "The Anchor", "The Ship",
      "The Horse and Groom" };

  // Temples - Temple Names
  static String[] godNames = { "Tirumala Venkateswara Temple", "Kashi Vishwanath Temple", "Somnath Temple",
      "Jagannath Temple", "Meenakshi Temple", "Brihadeeswarar Temple", "Siddhivinayak Temple",
      "Akshardham Temple", "Golden Temple", "Sabarimala Temple", "Lotus Temple",
      "Vaishno Devi Temple", "Padmanabhaswamy Temple", "Amarnath Temple", "Kedarnath Temple",
      "Kamakhya Temple", "Ramanathaswamy Temple", "Lingaraj Temple", "Sri Ranganathaswamy Temple",
      "Shirdi Sai Baba Temple" };

  // Tourist - Tourist Place Names
  static String[] places = { "Taj Mahal", "Golden Temple", "Charminar", "Lotus Temple", "Red Fort",
      "Gateway of India", "Hawa Mahal", "Qutub Minar", "Amer Fort", "India Gate",
      "Jama Masjid", "Mysore Palace", "Victoria Memorial", "Ellora Caves",
      "Sanchi Stupa", "Fatehpur Sikri", "Hampi", "Ajanta Caves", "Khajuraho",
      "Konark Sun Temple" };

  public static void main(String[] methEx) {
    System.out.println("-----------------Main Started-----------------");
    getGrocerieNames(); // calls getgrocerieNames
    getChocolateBrands();
    getPerfumeBrands();
    getShampooBrands();
    getSoapBrands();
    getTshirtBrands();
    getSeriesEngNames();
    getSeriesHindiNames();
    getKoreanDramas();
    getChaatNames();
    getDepartmentNames();
    getCardNames();
    getWorkerNames();
    getDoctorNames();
    getIceCreamFlavors();
    getMncCompanies();
    getPubNames();
    getGodNames();
    getPlaces();
    System.out.println("-----------------Main Ended-----------------");
  }

  // Methods
  public static void getGrocerieNames() {
    System.out.println("List of Groceries in Supermarket:" + grocerieNames.length);
    for (int gr = 0; gr < grocerieNames.length; gr++) {
      System.out.println(grocerieNames[gr]); // Prints the Output
    }
    return;
  }

  public static void getChocolateBrands() {
    System.out.println("-------------------------------------------");
    System.out.println("List of Chocolates in Supermarket:" + chocolateBrands.length);
    for (int ch = 0; ch < chocolateBrands.length; ch++) {
      System.out.println(chocolateBrands[ch]);
    }
    return;
  }

  public static void getPerfumeBrands() {
    System.out.println("-------------------------------------------");
    System.out.println("List of Perfumes in Supermarket:" + perfumeBrands.length);
    for (int pe = 0; pe < perfumeBrands.length; pe++) {
      System.out.println(perfumeBrands[pe]);
    }
    return;
  }

  public static void getShampooBrands() {
    System.out.println("-------------------------------------------");
    System.out.println("List of Shampoos in Supermarket:" + shampooBrands.length);
    for (int sh = 0; sh < shampooBrands.length; sh++) {
      System.out.println(shampooBrands[sh]);
    }
    return;
  }

  public static void getSoapBrands() {
    System.out.println("-------------------------------------------");
    System.out.println("List of Soaps in Supermarket:" + soapBrands.length);
    for (int so = 0; so < soapBrands.length; so++) {
      System.out.println(soapBrands[so]);
    }
    return;
  }

  public static void getTshirtBrands() {
    System.out.println("-------------------------------------------");
    System.out.println("List of Tshirts in Supermarket:" + tshirtBrands.length);
    for (int ts = 0; ts < tshirtBrands.length; ts++) {
      System.out.println(tshirtBrands[ts]);
    }
    return;
  }

  public static void getSeriesEngNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Netflix English Series:" + seriesEngNames.length);
    for (int en = 0; en < seriesEngNames.length; en++) {
      System.out.println(seriesEngNames[en]);
    }
    return;
  }

  public static void getSeriesHindiNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Netflix Hindi Series:" + seriesHindiNames.length);
    for (int hi = 0; hi < seriesHindiNames.length; hi++) {
      System.out.println(seriesHindiNames[hi]);
    }
    return;
  }

  public static void getKoreanDramas() {
    System.out.println("---------------------------------------");
    System.out.println("List of Netflix Korean Dramas:" + koreanDramas.length);
    for (int ko = 0; ko < koreanDramas.length; ko++) {
      System.out.println(koreanDramas[ko]);
    }
    return;
  }

  public static void getChaatNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Chaats:" + chaatNames.length);
    for (int ca = 0; ca < chaatNames.length; ca++) {
      System.out.println(chaatNames[ca]);
    }
    return;
  }

  public static void getDepartmentNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of College Departments:" + departmentNames.length);
    for (int cd = 0; cd < departmentNames.length; cd++) {
      System.out.println(departmentNames[cd]);
    }
    return;
  }

  public static void getCardNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Credit Cards:" + cardNames.length);
    for (int bc = 0; bc < cardNames.length; bc++) {
      System.out.println(cardNames[bc]);
    }
    return;
  }

  public static void getWorkerNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Garage Workers:" + workerNames.length);
    for (int wo = 0; wo < workerNames.length; wo++) {
      System.out.println(workerNames[wo]);
    }
    return;
  }

  public static void getDoctorNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Hospital Doctors:" + doctorNames.length);
    for (int dr = 0; dr < doctorNames.length; dr++) {
      System.out.println(doctorNames[dr]);
    }
    return;
  }

  public static void getIceCreamFlavors() {
    System.out.println("---------------------------------------");
    System.out.println("List of Ice Cream Flavors:" + iceCreamFlavors.length);
    for (int ic = 0; ic < iceCreamFlavors.length; ic++) {
      System.out.println(iceCreamFlavors[ic]);
    }
    return;
  }

  public static void getMncCompanies() {
    System.out.println("---------------------------------------");
    System.out.println("List of MNC Companies:" + mncCompanies.length);
    for (int mn = 0; mn < mncCompanies.length; mn++) {
      System.out.println(mncCompanies[mn]);
    }
    return;
  }

  public static void getPubNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Pubs:" + pubNames.length);
    for (int pu = 0; pu < pubNames.length; pu++) {
      System.out.println(pubNames[pu]);
    }
    return;
  }

  public static void getGodNames() {
    System.out.println("---------------------------------------");
    System.out.println("List of Indian Temples:" + godNames.length);
    for (int go = 0; go < godNames.length; go++) {
      System.out.println(godNames[go]); // Prints the output
    }
    return;
  }

  public static void getPlaces() {
    System.out.println("---------------------------------------");
    System.out.println("List of Tourist Places:" + places.length);
    for (int pl = 0; pl < places.length; pl++) {
      System.out.println(places[pl]);
    }
    return;
  }
}
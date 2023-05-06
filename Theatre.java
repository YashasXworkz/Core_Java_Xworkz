class Theatre {
  static String[] movieNames = { null, null, null, null, null, null, null, null, null, null };
  static int index;

  public static boolean addMovieName(String movieName) {
    System.out.println("addMovieName method started");
    System.out.println("No of parameters: " + 1);
    System.out.println("Type of parameter is string: " + movieName);
    boolean isAdded = false;
    if (movieName != null && index < movieNames.length) {
      movieNames[index++] = movieName;
      isAdded = true;
    } else {
      System.out.println("---------Array is full---------");
    }
    System.out.println("addMovieName method ended");
    return isAdded;
  }

  public static void getMovieNames() {
    System.out.println("getMovieNames method started");
    for (int i = 0; i < movieNames.length; i++) {
      System.out.println(movieNames[i]);
    }
    System.out.println("getMovieNames method ended");
  }

  public static boolean updateMovieName(String oldMovieName, String updatedMovieName) {
    System.out.println("updateMovieName method started");
    boolean isUpdated = false;
    for (int i = 0; i < movieNames.length; i++) {
      if (movieNames[i].equals(oldMovieName)) {
        movieNames[i] = updatedMovieName;
        isUpdated = true;
        System.out.println("Updated movie name " + oldMovieName + " to " + updatedMovieName);
      }
    }
    System.out.println("updateMovieName method ended");
    return isUpdated;
  }

  // searching
  public static String getMovieName(String movieName) {
    System.out.println("getMovieName method started");
    for (int i = 0; i < movieNames.length; i++) {
      if (movieNames[i].equals(movieName)) {
        return movieNames[i];
      }
    }
    System.out.println("getMovieName method ended");
    return "Movie name not found";
  }
}
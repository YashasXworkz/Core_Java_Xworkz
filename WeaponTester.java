class WeaponTester {
  public static void main(String[] weapons) {
    System.out.println("Main method started");
    Weapon weapon1 = new Weapon("Talwar", 2.0, "Sword", "Steel", 8);
    System.out.println("Weapon name: " + weapon1.name + "\nWeight: " + weapon1.weight + " Kg" + "\nType: "
        + weapon1.type + "\nMaterial: " + weapon1.material + "\nDamage: " + weapon1.damage + " pts");
    System.out.println("---------------------");

    Weapon weapon2 = new Weapon("Khanda", 3.5, "Sword", "Steel", 9);
    System.out.println("Weapon name: " + weapon2.name + "\nWeight: " + weapon2.weight + " Kg" + "\nType: "
        + weapon2.type + "\nMaterial: " + weapon2.material + "\nDamage: " + weapon2.damage + " pts");
    System.out.println("---------------------");

    Weapon weapon3 = new Weapon("Katar", 1.5, "Dagger", "Steel", 6);
    System.out.println("Weapon name: " + weapon3.name + "\nWeight: " + weapon3.weight + " Kg" + "\nType: "
        + weapon3.type + "\nMaterial: " + weapon3.material + "\nDamage: " + weapon3.damage + " pts");
    System.out.println("---------------------");

    Weapon weapon4 = new Weapon("Urumi", 3.0, "Flexible sword", "Steel", 7);
    System.out.println("Weapon name: " + weapon4.name + "\nWeight: " + weapon4.weight + " Kg" + "\nType: "
        + weapon4.type + "\nMaterial: " + weapon4.material + "\nDamage: " + weapon4.damage + " pts");
    System.out.println("---------------------");

    Weapon weapon5 = new Weapon("Bichua", 0.5, "Dagger", "Iron", 5);
    System.out.println("Weapon name: " + weapon5.name + "\nWeight: " + weapon5.weight + " Kg" + "\nType: "
        + weapon5.type + "\nMaterial: " + weapon5.material + "\nDamage: " + weapon5.damage + " pts");
    System.out.println("---------------------");

    Weapon weapon6 = new Weapon("Chakram", 0.5, "Throwing weapon", "Iron", 4);
    System.out.println("Weapon name: " + weapon6.name + "\nWeight: " + weapon6.weight + " Kg" + "\nType: "
        + weapon6.type + "\nMaterial: " + weapon6.material + "\nDamage: " + weapon6.damage + " pts");
    System.out.println("---------------------");

    Weapon weapon7 = new Weapon("Kulhari", 2.5, "Axe", "Iron", 8);
    System.out.println("Weapon name: " + weapon7.name + "\nWeight: " + weapon7.weight + " Kg" + "\nType: "
        + weapon7.type + "\nMaterial: " + weapon7.material + "\nDamage: " + weapon7.damage + " pts");
    System.out.println("---------------------");

    Weapon weapon8 = new Weapon("Bagh Nakh", 0.5, "Hand weapon", "Iron", 6);
    System.out.println("Weapon name: " + weapon8.name + "\nWeight: " + weapon8.weight + " Kg" + "\nType: "
        + weapon8.type + "\nMaterial: " + weapon8.material + "\nDamage: " + weapon8.damage + " pts");
    System.out.println("---------------------");

    Weapon weapon9 = new Weapon("Pata", 1.5, "Sword", "Iron", 8);
    System.out.println("Weapon name: " + weapon9.name + "\nWeight: " + weapon9.weight + " Kg" + "\nType: "
        + weapon9.type + "\nMaterial: " + weapon9.material + "\nDamage: " + weapon9.damage + " pts");
    System.out.println("---------------------");

    Weapon weapon10 = new Weapon("Haladie", 0.75, "Double-edged dagger", "Iron", 7);
    System.out.println("Weapon name: " + weapon10.name + "\nWeight: " + weapon10.weight + " Kg" + "\nType: "
        + weapon10.type + "\nMaterial: " + weapon10.material + "\nDamage: " + weapon10.damage + " pts");
    System.out.println("---------------------");
    System.out.println("Main method ended");
  }
}
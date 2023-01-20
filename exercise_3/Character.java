public class Character {
    int damage;
    int agility;
    int intelligence;
    String name;
    String attack;
    String Weapon;
    int newdamage;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    public void sayDamage() {
        System.out.println("My damage is " + damage);
}

public void Attack() {
    System.out.println("I am attacking! ");
}

public void intelligence() {
    System.out.println("I have " + intelligence + " intelligence");
}

public void sayMyWeapon() {
    System.out.println("My weapon is the " + Weapon);

}

public void newdamage() {
    System.out.println("Damage increased from " + damage + " to " + newdamage);

}
}
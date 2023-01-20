public class Weapon {

    String name;
    int damage;
    String rarity;
    int newdamage;

    public void sayMyWeapon() {
        System.out.println("My weapon is " + name);
    }

    public void sayMyDamage() {
        System.out.println("The damage of my weapon is  " + damage);
    }

    public void sayMyRarity() {
        System.out.println("The rarity of my weapon is  " + rarity);
    }

    public void newdamage() {
        System.out.println("Damage increased from " + damage + " to " + newdamage);
    }

    public String showNameandRarity(){
        return this.name + " " + this.rarity;
    }

}

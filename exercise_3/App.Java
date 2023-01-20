
public class App {
    public static void main(String[] args) throws Exception {


        Character knight = new Character();

        knight.damage = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayDamage();
        knight.Attack();

        Character mage = new Character();

        mage.damage = 10;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayDamage();
        mage.Attack();

        Character thief = new Character();

        thief.damage = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName();
        thief.sayDamage();
        thief.Attack();

        Character Lord = new Character();

        Lord.damage = 500;
        Lord.agility = 50;
        Lord.intelligence = 100;
        Lord.name = "Jesus";
        Lord.Weapon = "Holy spirit";
        Lord.newdamage = 1000;
        Lord.sayMyName();
        Lord.sayDamage();
        Lord.intelligence();
        Lord.sayMyWeapon();
        Lord.newdamage();
        Lord.Attack();



        Weapon Weapon1 = new Weapon();
        Weapon1.name = "Mjolnir";
        Weapon1.damage = 300;
        Weapon1.rarity = "rare";
        Weapon1.newdamage = 500;
        Weapon1.sayMyWeapon();
        Weapon1.sayMyDamage();
        Weapon1.sayMyRarity();
        Weapon1.newdamage();
        System.out.println(Weapon1.showNameandRarity());

        Weapon Weapon2 = new Weapon();
        Weapon2.name = "Jonathan";
        Weapon2.damage = 600;
        Weapon2.rarity = "rare";
        Weapon2.newdamage = 1000;
        Weapon2.sayMyWeapon();
        Weapon2.sayMyDamage();
        Weapon2.sayMyRarity();
        Weapon2.newdamage();
        System.out.println(Weapon2.showNameandRarity());
    }
}

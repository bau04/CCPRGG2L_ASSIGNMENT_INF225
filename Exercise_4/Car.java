public class Car {
    
    String name;
    Myself owner;

    Car(String cName, Myself myName){
        this.name = cName;
        this.owner = myName;
    }

    void showcName() {
        System.out.println("My car is " + this.name + " My owner's name is " + owner.name);
    }
}

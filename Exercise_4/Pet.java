public class Pet {
    
    String name;
    Person owner;

    Pet(String pName, Person oName){
        this.name = pName;
        this.owner = oName;
    }

    void showoName() {
        System.out.println("My name is " + this.name + " My owner's name is " + owner.name);
    }
}

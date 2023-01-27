public class Myself {
    String name;
    int age;

    Pet pet;
    Car car;

    Myself(String myName, int myAge){
        this.age = myAge;
        this.name = myName;

    }

    void addFriend(Person friend) {
        System.out.println("I am friends with " + friend.name);
    }
}

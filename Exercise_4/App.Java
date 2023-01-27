public class App {
    public static void main(String[] args) throws Exception {

        Person friend = new Person("Kent", 19);

        Myself me = new Myself("Charles", 18);

        me.addFriend(friend);

        Pet cat = new Pet("Whitey", friend);
        
        Car car = new Car("Mustang", me);


        cat.showoName();

        car.showcName();
    }

}

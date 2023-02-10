public class App {
    public static void main(String[] args) throws Exception {

        GroceryItem item1 = new GroceryItem();
        item1.name = "floss";
        item1.showItemName();
        item1.price = 27.99;


        GroceryItem item2 = new GroceryItem();
        item2.name = "Tissue";
        item2.showItemName();
        item2.price = 11.99;

        GroceryItem item3 = new GroceryItem();
        item3.name = "colgate";
        item3.showItemName();
        item3.price = 69.99;

        //cashier object
        Cashier l1 = new Cashier();

        l1.checkOut(item1);
        l1.showPrice(item1);

        l1.checkOut(item2);
        l1.showPrice(item2);

        l1.checkOut(item3);
        l1.showPrice(item3);

        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item1;
        itemArray[1] = item2;

        for (int i = 0 ; i < itemArray.length; i++){
            itemArray[i].showItemName();
        }

        KomodoDragon myKomodoDragon = new KomodoDragon();
        myKomodoDragon.eat();

        Dinosaur myDinosaur = new Dinosaur();
        myDinosaur.crawl();
        myDinosaur.run();
    }
}

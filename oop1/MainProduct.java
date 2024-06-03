package oop.oop1;

import java.util.List;

public class MainProduct {
    public static void main(String[] args) {
        
        HotDrink coffee1 = new HotDrink("latte", 220, 0.2, 90);
        HotDrink tea1 = new HotDrink("greentea", 100, 0.3, 89);
        HotDrink coffee2 = new HotDrink("capuchino", 220, 0.2, 90);
        HotDrink tea2 = new HotDrink("blackntea", 100, 0.3, 89);
        HotDrink cacao1 = new HotDrink("mokka", 300, 0.4, 94);
        HotDrink cacao2 = new HotDrink("greentea", 300, 0.4, 94);
        HotDrink glintvein1 = new HotDrink("citrus", 500, 0.4, 60);
        HotDrink glintvein2 = new HotDrink("citrus", 500, 0.4, 60);


        HotDrinkMachine crazyMachine = new HotDrinkMachine();
        crazyMachine.addProduct(List.of(coffee1,coffee2,cacao1,cacao2, tea1,tea2,glintvein1,glintvein2));
        System.out.println(crazyMachine.showProducts());
        crazyMachine.getProduct("latte");
        System.out.println(crazyMachine.showProducts());
        System.out.println(crazyMachine.getProduct("citrus", 0.4, 60));
        System.out.println(crazyMachine.showProducts());



    }
}

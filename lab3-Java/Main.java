package main;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        //creare backpack
        Knapsack backpackGlobal = new Knapsack();
        backpackGlobal.setCapacity(100000);

        Knapsack backpack = new Knapsack();
        backpack.setCapacity(10);

        Book book1 = new Book("Dragon Rising", 300, 5);
        Book book2 = new Book("A Blade in the Darkness", 852, 3);

        Food food1 = new Food("Cabbage", 2);
        Food food2 = new Food();
        food2.setName("Rabbit");
        food2.setWeight(4);

        Weapon weapon1 = new Weapon(Weapon.WeaponType.SWORD, 5, 6);

        System.out.println("Capacity of the Knapsack = " + backpack.getCapacity());
        System.out.println("Available items before sort:");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(food1.toString());
        System.out.println(food2.toString());
        System.out.println(weapon1.toString());

        backpackGlobal.addItem(food1);
        backpackGlobal.addItem(food2);
        backpackGlobal.addItem(book1);
        backpackGlobal.addItem(book2);
        backpackGlobal.addItem(weapon1);


        System.out.println("Available items after sort:");

        NameCompare nameCompare = new NameCompare();
        Collections.sort(backpackGlobal.getItems(), nameCompare);
        System.out.println(backpackGlobal.getItems());

    }
}

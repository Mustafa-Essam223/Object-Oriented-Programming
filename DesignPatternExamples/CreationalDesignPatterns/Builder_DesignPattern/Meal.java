package CreationalDesignPatterns.Builder_DesignPattern;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0f;
        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void ShowItems() {
        for (Item item : items) {
            System.out.print(item.getName() + " : " + item.getPrice());
            System.out.println(" , Packing : " + item.packing().pack());
        }
    }

}

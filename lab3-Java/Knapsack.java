import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private double capacity;
    private List<Item> items = new ArrayList<>();

    public Knapsack() { }

    public Knapsack(double capacity, List<Item> items) {
        this.capacity = capacity;
        this.items = items;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
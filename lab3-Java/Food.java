public class Food implements Item {
    private String name;
    private double weight; // → getWeight, getValue

    public Food(){ }

    public Food(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getValue() {
        return this.weight*2;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public double profitFactor() {
        return this.getValue()/this.weight;
    }

    @Override
    public String toString() {
        return "\nFood\t" + "{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", value=" + this.getValue() +
                ", profit= " + this.profitFactor() +
                "}";
    }

    //
}
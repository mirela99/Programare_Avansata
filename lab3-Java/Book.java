public class Book implements Item {
    private String name;
    private int pageNumber; // getWeight
    private double value;

    public Book() { }

    public Book(String name, int pageNumber, double value) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double getWeight() {
        return (double)(pageNumber)/100;
    }

    @Override
    public double profitFactor() {
        return value/getWeight();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nBook\t{" +
                "name='" + name + '\'' +
                ", weight=" + this.getWeight() +
                ", value=" + value + ", profit=" + this.profitFactor() +
                "}";
    }
}

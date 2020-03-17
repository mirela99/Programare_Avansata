public class Weapon implements Item {
    private WeaponType type;
    private double weight;
    private double value;

    public Weapon() { }

    public Weapon(WeaponType type) {
        this.type = type;
    }

    public Weapon(double weight, double value) {
        this.weight = weight;
        this.value = value;
    }

    public Weapon(WeaponType type, double weight, double value) {
        this.type = type;
        this.weight = weight;
        this.value = value;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public enum WeaponType{
        SWORD, PISTOL;
    }

    @Override
    public double profitFactor() {
        return this.value/this.weight;
    }


    @Override
    public String getName() {
        return type.name();
    }

    @Override
    public double getValue() {
        return 0;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nWeapon\t{" +
                "type=" + type +
                ", weight=" + weight +
                ", value=" + value +
                ", profit=" + this.profitFactor() +
                "}";
    }
}

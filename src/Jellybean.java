public class Jellybean extends Sweetness {

    private double rigidity;

    Jellybean(String name, double price, double weight, double rigidity) {
        super(name, price, weight);
        this.rigidity = rigidity;
    }

    @Override
    public String toString() {
        return "Jellybean{" + super.toString() +
                ", rigidity='" + rigidity + '\'' +
                '}';
    }
}

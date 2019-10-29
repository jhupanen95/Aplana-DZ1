public class Jellybean extends Sweetness {

    double rigidity;

    public Jellybean(String name, double price, double weight, double rigidity) {
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

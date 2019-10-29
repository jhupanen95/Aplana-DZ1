public class Сookies extends Sweetness {
    private String structure;

    Сookies(String name, double price, double weight, String structure) {
        super(name, price, weight);
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "Сookies{" + super.toString() +
                ", structure='" + structure + '\'' +
                '}';
    }
}

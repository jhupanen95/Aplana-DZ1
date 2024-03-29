public abstract class Sweetness {

    private String name;
    private double price;
    private double weight;

    Sweetness(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight;
    }
}

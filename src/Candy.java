public class Candy extends Sweetness {

    boolean filling;

    public Candy(String name, double price, double weight, boolean filling) {
        super(name, price, weight);
        this.filling = filling;
    }
}

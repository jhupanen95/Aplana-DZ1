public class Candy extends Sweetness {

    private boolean filling;

    Candy(String name, double price, double weight, boolean filling) {
        super(name, price, weight);
        this.filling = filling;
    }
    @Override
    public String toString() {
        return "Candy{" + super.toString() +
                ", filling='" + filling + '\'' +
                '}';
    }
}

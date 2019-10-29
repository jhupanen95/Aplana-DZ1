import java.util.ArrayList;

public class NewYearGift implements Box {
    private ArrayList<Sweetness> box = new ArrayList<Sweetness>();

    @Override
    public void add(Sweetness sweet) {
        box.add(sweet);
    }

    @Override
    public boolean delete() {
        if (!box.isEmpty()) {
            box.remove(box.size() - 1);
            return true;
        }
        else return false;
    }

    @Override
    public boolean delete(int id) {
        if (box.size()-1 >= id) {
            box.remove(id);
            return true;
        }
        else return false;
    }

    @Override
    public double weightBox() {
        double weightBox = 0;
        for (Sweetness sw: box) {
            weightBox = weightBox + sw.getWeight();
        }
        return weightBox;
    }

    @Override
    public double priceBox() {
        double priceBox = 0;
        for (Sweetness sw: box) {
            priceBox = priceBox + sw.getPrice();
        }
        return priceBox;
    }

    @Override
    public void openBox() {
        for (Sweetness sw: box) {
            System.out.println(sw);
        }
    }

    void reduceWeight(double weight){
        while (weightBox() > weight){
            if (box.size() >= 2) {
                double minWeight = box.get(0).getWeight();
                int index = 0;
                for (int i = 1; i < box.size(); i++) {
                    if (box.get(i).getWeight() < minWeight) {
                        minWeight = box.get(i).getWeight();
                        index = i;
                    }
                }
                box.remove(index);
            }
        }
    }

    void reducePrice(double price){
        while (priceBox() > price){
            if (box.size() >= 2) {
                double minPrice = box.get(0).getPrice();
                int index = 0;
                for (int i = 1; i < box.size(); i++) {
                    if (box.get(i).getPrice() < minPrice) {
                        minPrice = box.get(i).getPrice();
                        index = i;
                    }
                }
                box.remove(index);
            }
        }
    }

}

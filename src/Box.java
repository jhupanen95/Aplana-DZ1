public interface Box {
    void add(Sweetness sweet);
    boolean delete();
    boolean delete(int id);
    double weightBox();
    double priceBox();
    void openBox();
}

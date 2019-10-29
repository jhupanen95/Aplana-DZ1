public class Main {
    public static void main(String[] args) {
        NewYearGift gift = new NewYearGift();

        gift.add(new Candy("Ласточка", 5.1, 15.3, true));
        gift.add(new Candy("Маска", 7.3, 13.2, true));
        gift.add(new Candy("Монпасье", 10.7, 9.1, false));
        gift.add(new Jellybean("Мишки", 8.4, 9.7, 0.5));
        gift.add(new Jellybean("Дольки", 6, 13.5, 0.7));
        gift.add(new Сookies("Гранола", 18, 25, "мука, шоколад"));

        gift.openBox();
        System.out.println("price: " + gift.priceBox());
        System.out.println("weight: " + gift.weightBox());

        //gift.reduceWeight(60);
        gift.reducePrice(45);

        gift.openBox();
        System.out.println("price: " + gift.priceBox());
        System.out.println("weight: " + gift.weightBox());


//        gift.delete();
//        gift.openBox();
//        System.out.println();
//        gift.delete(2);
//        gift.openBox();
    }
}

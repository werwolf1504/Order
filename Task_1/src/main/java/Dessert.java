public class Dessert extends Dish{
    private boolean isDessert = true;

    public boolean isDessert() {
        return isDessert;
    }

    public Dessert(String name, float price) {
        super(name, price);
    }
}

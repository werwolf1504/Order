public class Dessert extends Dish{
    private boolean isDessert = true;

    public boolean isDessert() {
        return isDessert;
    }

    public Dessert(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return getName() + " as Dessert, ";
    }
}

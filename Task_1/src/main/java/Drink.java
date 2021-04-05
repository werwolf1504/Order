public class Drink extends Dish{
    public Drink(String name, float price) {
        super(name, price);
    }

    boolean ice;
    boolean lemon;

    public void setIce(boolean ice) {
        this.ice = ice;
    }

    public void setLemon(boolean lemon) {
        this.lemon = lemon;
    }
}

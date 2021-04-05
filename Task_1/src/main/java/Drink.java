public class Drink extends Dish{
    public Drink(String name, int price) {
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

    @Override
    public String toString() {
        String text = getName() + "as Drink ";

        if (ice && lemon){
            text = text + "with ice and lemon";
        }else if (ice){
            text = text + "with ice";
        }else if (lemon){
            text = text + "with lemon";
        }

        return text;
    }
}

public class Drink {
    private String name;
    private float price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Drink(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Drink(){}
}

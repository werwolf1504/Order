import java.util.ArrayList;
import java.util.List;

public class Cuisines {
    private String name;
    private List<Dish> menu = new ArrayList<Dish>();
    private List<Drink> drinkMenu = new ArrayList<Drink>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Dish> getMenu() {
        return menu;
    }

    public List<Drink> getDrinkMenu() {
        return drinkMenu;
    }

    public void setDrinkMenu(List<Drink> drinkMenu) {
        this.drinkMenu = drinkMenu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }

    public Cuisines(String name) {
        this.name = name;
    }

    public Cuisines(String name, List<Dish> menu, List<Drink> drinkMenu) {
        this.name = name;
        this.menu = menu;
        this.drinkMenu = drinkMenu;
    }

    public static Cuisines createPolish(){
        List<Dish> polish = new ArrayList<Dish>(5);
        polish.add(new MainCourse("Bigos", 10));
        polish.add(new MainCourse("Borch", 12));
        polish.add(new MainCourse("Meat with patato", 15));
        polish.add(new Dessert("PinaColada",8));
        polish.add(new Dessert("Honny cook",7));

        List<Drink> drinks = new ArrayList<Drink>(3);
        drinks.add(new Drink("Sprit", 4));
        drinks.add(new Drink("Pepse", 4));
        drinks.add(new Drink("Mirina", 4));

        return new Cuisines("Polish", polish, drinks);
    }

    public static Cuisines createItalian(){
        List<Dish> italian = new ArrayList<Dish>(5);
        italian.add(new MainCourse("Carbonara", 14));
        italian.add(new MainCourse("Pizza", 17));
        italian.add(new MainCourse("Bolonesa", 14));
        italian.add(new Dessert("PinaColada",8));
        italian.add(new Dessert("Gofra",5));

        List<Drink> drinks = new ArrayList<Drink>(3);
        drinks.add(new Drink("Wine White", 5));
        drinks.add(new Drink("Wine Red", 5));
        drinks.add(new Drink("Wine Pink", 5));

        return new Cuisines("Italian", italian, drinks);
    }

    public static Cuisines createMexican(){
        List<Dish> mexican = new ArrayList<Dish>(5);
        mexican.add(new MainCourse("Chili", 10));
        mexican.add(new MainCourse("Burger", 15));
        mexican.add(new MainCourse("Burrito", 11));
        mexican.add(new Dessert("PinaColada",8));
        mexican.add(new Dessert("Mango",2));

        List<Drink> drinks = new ArrayList<Drink>(3);
        drinks.add(new Drink("Latte", 3));
        drinks.add(new Drink("Cappuccino", 3));
        drinks.add(new Drink("Espresso", 3));

        return new Cuisines("Mexican", mexican, drinks);
    }

    @Override
    public String toString() {
        return name + " cuisines";
    }
}

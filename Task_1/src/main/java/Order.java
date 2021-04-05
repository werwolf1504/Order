import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Order {
    static List<Cuisines> cuisines = new ArrayList<Cuisines>(3);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Lunch lunch;
    Drink drink;

    int index = 0;

    String nameCuisines = "";
    String nameMain = "";
    String nameDessert = "";
    String nameDrink = "";

    static {
        cuisines.add(Cuisines.createPolish());
        cuisines.add(Cuisines.createItalian());
        cuisines.add(Cuisines.createMexican());
    }

    private Cuisines chooseCuisines(){
        System.out.println("Choose cuisines:");
        for (int i = 0; i < cuisines.size(); i++) {
            System.out.println(cuisines.get(i).getName());
        }

        try {
            nameCuisines = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < cuisines.size(); i++) {
            String name = cuisines.get(i).getName();
            if (nameCuisines.equals(name)){
                index = i;
            }
        }

        System.out.println("Was choosed - " + cuisines.get(index).getName());

        return cuisines.get(index);
    }

    private MainCourse chooseMain(){
        MainCourse mc = null;
        System.out.println("what main course do you want?");

        Cuisines c = cuisines.get(index);
        List<Dish> menu = c.getMenu();
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i) instanceof MainCourse){
                System.out.println(menu.get(i).getName());
            }
        }

        try {
            nameMain = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < menu.size(); i++) {
            String name = menu.get(i).getName();
            if (nameMain.equals(name)){
                mc = (MainCourse) menu.get(i);
            }
        }

        System.out.println("Main Course was chosen");
        return mc;
    }

    private Dessert chooseDessert(){
        Dessert d = null;
        System.out.println("what dessert do you want?");

        Cuisines c = cuisines.get(index);
        List<Dish> menu = c.getMenu();
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i) instanceof Dessert){
                System.out.println(menu.get(i).getName());
            }
        }

        try {
            nameDessert = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < menu.size(); i++) {
            String name = menu.get(i).getName();
            if (nameDessert.equals(name)){
                d = (Dessert) menu.get(i);
            }
        }

        System.out.println("Dessert was chosen");
        return d;
    }

    private Drink chooseDrink(){
        Drink d = null;
        System.out.println("what drink do you want?");

        Cuisines c = cuisines.get(index);
        List<Drink> menu = c.getDrinkMenu();
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i).getName());
        }

        try {
            nameDrink = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < menu.size(); i++) {
            String name = menu.get(i).getName();
            if (nameDrink.equals(name)){
                d = menu.get(i);
            }
        }

        System.out.println("Drink was chosen");
        return d;
    }

    public Lunch makeLunch(){
        return new Lunch(chooseMain(), chooseDessert());
    }

    public Order makeOrder(){
        chooseCuisines();
        lunch = makeLunch();

        String choose = "";
        System.out.println("Do you want drink? (Please, choose Yes or No)");
        try {
            choose = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (choose.equals("Yes")){
            drink = chooseDrink();

            System.out.println("Do tou want ice and/or lemon? (ice, lemon, all)");

            try {
                choose = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (choose.equals("all")){
                drink.setIce(true);
                drink.setLemon(true);
            }
            if (choose.equals("ice")){
                drink.setIce(true);
            }
            if (choose.equals("lemon")){
                drink.setLemon(true);
            }

            System.out.println("Order was made");

        }

        return new Order(lunch, drink);
    }

    private Order(Lunch lunch, Drink drink) {
        this.lunch = lunch;
        this.drink = drink;
    }

    public Order(){}

    @Override
    public String toString() {
        String text = "You ordered: " + cuisines.get(index).toString() + ", ";

        if (drink != null) {
            text = text + lunch.toString() + drink.toString();
        }else {
            text = text + lunch.toString();
        }

        return text;
    }
}

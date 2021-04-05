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

        Cuisines c = chooseCuisines();
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

        return mc;
    }

    private Dessert chooseDessert(){
        Dessert d = null;
        System.out.println("what dessert do you want?");

        Cuisines c = chooseCuisines();
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

        return d;
    }

    private Drink chooseDrink(){
        Drink d = null;
        System.out.println("what drink do you want?");

        Cuisines c = chooseCuisines();
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

        return d;
    }

    public Lunch makeLunch(){
        return new Lunch(chooseMain(), chooseDessert());
    }

    public Order makeOrder(){
        Lunch l = makeLunch();
        Drink d = null;

        String choose = "";
        try {
            choose = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Do you want drink? (Please, choose Yes or No)");

        if (choose.equals("Yes")){
            drink = chooseDrink();

            System.out.println("Do tou want ice and/or lemon? (ice, lemon, all)");

            try {
                choose = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (choose.equals("all")){
                d.setIce(true);
                d.setLemon(true);
            }
            if (choose.equals("ice")){
                d.setIce(true);
            }
            if (choose.equals("lemon")){
                d.setLemon(true);
            }

        }

        return new Order(l, d);
    }

    public Order(Lunch lunch, Drink drink) {
        this.lunch = lunch;
        this.drink = drink;
    }
}

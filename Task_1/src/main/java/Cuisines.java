import java.util.ArrayList;
import java.util.List;

public class Cuisines {
    private String name;
    private List<Dish> menu = new ArrayList<Dish>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Dish> getMenu() {
        return menu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }
}

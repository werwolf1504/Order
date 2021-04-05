public class MainCourse extends Dish{
    private boolean isMainCourse = true;

    public MainCourse(String name, float price) {
        super(name, price);
    }

    public boolean isMainCourse() {
        return isMainCourse;
    }
}

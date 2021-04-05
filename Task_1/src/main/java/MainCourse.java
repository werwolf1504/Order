public class MainCourse extends Dish{
    private boolean isMainCourse = true;

    public MainCourse(String name, int price) {
        super(name, price);
    }

    public boolean isMainCourse() {
        return isMainCourse;
    }

    @Override
    public String toString() {
        return getName() + " as Main Course, ";
    }
}

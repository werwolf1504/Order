public class Lunch {
    MainCourse mainCourse;
    Dessert dessert;

    public Lunch(MainCourse mainCourse, Dessert dessert){
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return mainCourse.toString() + dessert.toString();
    }
}

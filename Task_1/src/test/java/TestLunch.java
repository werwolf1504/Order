import org.junit.Assert;
import org.junit.Test;

public class TestLunch {
    Lunch lunch = new Lunch(new MainCourse("a", 5), new Dessert("b", 2));

    @Test
    public void testToString(){
        Assert.assertNotNull(lunch.toString());
    }
}

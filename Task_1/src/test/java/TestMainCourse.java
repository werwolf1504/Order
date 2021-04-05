import org.junit.Assert;
import org.junit.Test;

public class TestMainCourse {
    MainCourse mainCourse = new MainCourse("MainCourse", 12);

    @Test
    public void testGetPrice(){
        Assert.assertSame(12, mainCourse.getPrice());
    }

    @Test
    public void testGetName(){
        Assert.assertSame("MainCourse", mainCourse.getName());
    }

    @Test
    public void testToString(){
        Assert.assertNotNull(mainCourse.toString());
    }
}

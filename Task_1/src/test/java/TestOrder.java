import org.junit.Assert;
import org.junit.Test;

public class TestOrder {
    Order order = new Order(new Lunch(new MainCourse("A", 10), new Dessert("B", 5)), new Drink("C", 4));

    @Test
    public void testToString(){
        Assert.assertNotNull(order.toString());
    }
}

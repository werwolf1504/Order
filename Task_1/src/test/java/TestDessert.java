import org.junit.Assert;
import org.junit.Test;

public class TestDessert {
    int price = 14;
    Dessert dessert = new Dessert("Dessert", price);

    @Test
    public void testGetPrice(){
        int test = 14;
        Assert.assertSame(test, dessert.getPrice());
    }

    @Test
    public void testGetName(){
        Assert.assertSame("Dessert", dessert.getName());
    }

    @Test
    public void testToString(){
        Assert.assertNotNull(dessert.toString());
    }
}

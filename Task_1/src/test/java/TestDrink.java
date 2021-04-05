import org.junit.Assert;
import org.junit.Test;

public class TestDrink {
    Drink drink = new Drink("Drink", 5);

    @Test
    public void testGetPrice(){
        Assert.assertSame(5, drink.getPrice());
    }

    @Test
    public void testGetName(){
        Assert.assertSame("Drink", drink.getName());
    }

    @Test
    public void testToString(){
        Assert.assertNotNull(drink.toString());
    }
}


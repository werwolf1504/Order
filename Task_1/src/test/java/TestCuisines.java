import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestCuisines {

    @Test
    public void testGetName(){
        Cuisines cuisines = Cuisines.createPolish();
        String name = cuisines.getName();
        Assert.assertEquals("Polish", name);
    }

    @Test
    public void testGetMenu(){
        Cuisines cuisines = Cuisines.createPolish();
        List<Dish> menu = cuisines.getMenu();
        Assert.assertSame(cuisines.getMenu(), menu);
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before

    public void before(){
        waterBottle = new WaterBottle(100);
    }

   @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
   }

   @Test
    public void hasTakenSip(){
        assertEquals(90, waterBottle.takeSip());
   }

   @Test
    public void hasBeenEmptied(){
        assertEquals(0, waterBottle.empty());
   }

   @Test
    public void hasBeenFilled(){
        assertEquals(100, waterBottle.fill());
   }


}

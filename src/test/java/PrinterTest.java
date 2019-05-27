import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10, 30);
    }

    @Test
    public void hasSheets(){
        assertEquals(10, printer.hasPaper());
    }

    @Test
    public void hasTonner(){
        assertEquals(30, printer.getToner());
    }

    @Test
    public void canPrint(){
        printer.print(4,2);
        assertEquals(2, printer.hasPaper());
        assertEquals(22, printer.getToner());
    }
}

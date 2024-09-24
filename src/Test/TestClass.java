package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    public void test() {
        Printer printer = new Printer(11);
        assertEquals("PrimeEleven",printer.printt(11));
    }
    @Test
    public void test2()
    {
        Printer printer = new Printer(1);
        assertEquals("EvenPrimeEleven",printer.printt(22));
    }
    @Test
    public void test3()
    {
        Printer printer = new Printer(1);
        assertEquals("EvenPrimeLucky",printer.printt(286));
    }
}

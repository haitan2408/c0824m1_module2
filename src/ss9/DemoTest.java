package ss9;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    public void sum() throws Exception {
        int a = 2;
        int b = 1;
        int result = Demo.sum(a,b);
        assertEquals(3, result);
    }

    @Test
    public void sum1() throws Exception {
        int a = 2147483647;
        int b = 1;
        int result = Demo.sum(a,b);
        assertEquals(2147483648l, result);
    }
}
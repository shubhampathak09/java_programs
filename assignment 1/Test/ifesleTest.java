import org.junit.Test;

import static org.junit.Assert.*;

public class ifesleTest {

    @Test
    public void ascii() {
        ifesle obj=new ifesle();

        assertEquals(67,obj.ascii('A'));
    }
}
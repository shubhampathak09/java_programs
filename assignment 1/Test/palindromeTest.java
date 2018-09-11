import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {

    @Test
    public void reverse() {
        palindrome obj=new palindrome();
       assertEquals(323,obj.reverse(323));
    }

    @Test
    public void checkpalindrome() {

    }
}
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void checkBefore(){
        palindrome = new Palindrome();
    }

    @Test
    public void checkCorrectPalindrome(){
        assertEquals(false,palindrome.checkPalindrome("SREE"));
    }
    @Test
    public void checkWrongPalindrome(){
        assertEquals(true,palindrome.checkPalindrome("SRRS"));
    }
    @Test
    public void checkOddPalindrome(){
        assertEquals(false,palindrome.checkPalindrome("SRCPDRS"));
    }


}

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RemoveGivenCharFromStringTest {
    RemoveGivenCharFromString removeGivenCharFromString;
    @Before
    public void beforeTest(){
    removeGivenCharFromString = new RemoveGivenCharFromString();
    }
    @Test
    public void removeCharNotExists(){
        assertEquals("sree",removeGivenCharFromString.checkRemoveChar("sree",'q'));
        assertEquals("sree",removeGivenCharFromString.removeRecursive("sree",'q'));
    }
    @Test
    public void removeAtStarting(){
        assertEquals("ree",removeGivenCharFromString.checkRemoveChar("sree",'s'));
        assertEquals("ree",removeGivenCharFromString.removeRecursive("sree",'s'));
    }
    @Test public void removeAtBeginning(){
        assertEquals("bc", removeGivenCharFromString.checkRemoveChar("abc", 'a'));
        assertEquals("bc",removeGivenCharFromString.removeRecursive("abc", 'a'));
    }
    @Test
        public void removeAtMiddle(){
        assertEquals("abd", removeGivenCharFromString.checkRemoveChar("abcd", 'c'));
        assertEquals("abd",removeGivenCharFromString.removeRecursive("abcd", 'c'));
    }
    @Test
    public void removeAtEnd(){
        assertEquals("abc",removeGivenCharFromString.checkRemoveChar("abcd", 'd'));
        assertEquals("abc",removeGivenCharFromString.removeRecursive("abcd", 'd'));
    }



}

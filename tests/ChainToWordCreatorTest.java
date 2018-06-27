import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.ChainToWordCreator;

public class ChainToWordCreatorTest {
    private ChainToWordCreator chainToWordCreator;

    @Before
    public void setUp() {
        chainToWordCreator = new ChainToWordCreator();
    }

    @Test
    public void testIfMethodToCompareWordsLengthReturnTrueIfTheyAreEqual() {
        String first = "abcd";
        String second = "bdca";
        Assert.assertTrue(chainToWordCreator.areWordsTheSameLength(first, second));
    }


}

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.WordsComparator;

public class WordsComparatorTest {
    private WordsComparator wordsComparator;
    private final String FIRST_EXAMPLE_WORD = "abcd";
    private final String SECOND_EXAMPLE_WORD = "bdca";
    private final String THIRD_EXAMPLE_WORD = "bdcsda";

    @Before
    public void setUp() {
        wordsComparator = new WordsComparator();
    }

    @Test
    public void testIfMethodToCompareWordsLengthReturnTrueIfTheyAreEqual() {
        Assert.assertTrue(wordsComparator.areWordsTheSameLength(FIRST_EXAMPLE_WORD,
            SECOND_EXAMPLE_WORD));
    }
    @Test
    public void testIfMethodToCompareWordsLengthReturnFalseIfTheyAreNotEqual() {
        Assert.assertFalse(wordsComparator.areWordsTheSameLength(FIRST_EXAMPLE_WORD,
            THIRD_EXAMPLE_WORD));
    }


}

package util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class WordsComparatorTest {
    private WordsComparator wordsComparator;
    private String FIRST_EXAMPLE_WORD;
    private String SECOND_EXAMPLE_WORD;
    private String THIRD_EXAMPLE_WORD;

    @BeforeAll
    public void setUp() {
        wordsComparator = new WordsComparator();
        FIRST_EXAMPLE_WORD = "abcd";
        SECOND_EXAMPLE_WORD = "bcda";
        THIRD_EXAMPLE_WORD = "bdcsda";
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

package util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordsComparatorTest {
    private WordsComparator wordsComparator;
    private final String FIRST_EXAMPLE_WORD  = "abcd";
    private final String WORD_WITH_MORE_THEN_ONE_DIFFERENCE  = "bcda";
    private final String LONGER_EXAMPLE_WORD = "bdcsda";
    private final String WORD_WITH_ONE_DIFFERENCE = "abcc";

    @Before
    public void setUp() {
        wordsComparator = new WordsComparator();
    }

    @Test
    public void testIfMethodToCompareWordsLengthReturnTrueIfTheyAreEqual() {
        Assert.assertTrue(wordsComparator.areWordsTheSameLength(FIRST_EXAMPLE_WORD,
            WORD_WITH_MORE_THEN_ONE_DIFFERENCE));
    }
    @Test
    public void testIfMethodToCompareWordsLengthReturnFalseIfTheyAreNotEqual() {
        Assert.assertFalse(wordsComparator.areWordsTheSameLength(FIRST_EXAMPLE_WORD,
            LONGER_EXAMPLE_WORD));
    }

    @Test
    public void testIfMethodReturnsTrueIfWordsAreDifferentByOneLetter() {
        Assert.assertTrue(wordsComparator.areWordsDifferentByOneWord(FIRST_EXAMPLE_WORD,
            WORD_WITH_ONE_DIFFERENCE));
    }
}

package util;

import java.util.Arrays;
import java.util.List;
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

    @Test
    public void testIfMethodReturnsFalseIfWordsAreDifferentByMoreThanOneLetter() {
        Assert.assertFalse(wordsComparator.areWordsDifferentByOneWord(FIRST_EXAMPLE_WORD,
            WORD_WITH_MORE_THEN_ONE_DIFFERENCE));
    }

    @Test
    public void testIfMethodReturnsWordsWithTheSameLength() {
        final int DESIRED_LENGTH = 4;
        List<String> equalLengthWords = wordsComparator.getSameLengthWords(
            Arrays.asList(FIRST_EXAMPLE_WORD, WORD_WITH_ONE_DIFFERENCE, LONGER_EXAMPLE_WORD),
            DESIRED_LENGTH);
        for (String word : equalLengthWords) {
            Assert.assertTrue(word.length() == DESIRED_LENGTH);
        }
    }
}

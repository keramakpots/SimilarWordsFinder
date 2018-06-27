package util;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class FileReaderTest {
    private final String DICTIONARY_FILE = "test dictionary.txt";
    private FileReader fileReader;

    @BeforeAll
    void setUp() {
        fileReader = new FileReader();
    }

    @Test
    void testIfFileReaderLoadsEveryWordFromFile() {
        List<String> testStrings = Arrays.asList("koń", "toń", "goń", "Słoń");
        List<String> loadedStrings = fileReader.getWordsFromFile(DICTIONARY_FILE);
        for (String string:testStrings) {
            Assert.assertTrue(loadedStrings.contains(string));
        }
    }
}

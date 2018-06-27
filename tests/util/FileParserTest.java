package util;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class FileReaderTest {
    private final String DICTIONARY_FILE = "testResources/test dictionary.txt";
    private FileReader fileReader;

    @BeforeEach
    public void setUp() {
        fileReader = new FileReader();
    }

    @Test
    public void testIfFileReaderLoadsEveryWordFromFile() throws IOException {
        List<String> testStrings = Arrays.asList("koń", "toń", "goń", "Słoń");
        List<String> loadedStrings = fileReader.getWordsFromFile(DICTIONARY_FILE);
        for (String string:testStrings) {
            Assert.assertTrue(loadedStrings.contains(string));
        }
    }
}

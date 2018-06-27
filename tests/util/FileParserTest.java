package util;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class FileParserTest {
    private final String DICTIONARY_FILE = "testResources/test dictionary.txt";
    private FileParser fileParser;

    @Test
    public void testIfFileReaderLoadsEveryWordFromFile() throws IOException {
        fileParser = new FileParser();
        List<String> testStrings = Arrays.asList("koń", "toń", "goń", "Słoń");
        List<String> loadedStrings = fileParser.getWordsFromFile(DICTIONARY_FILE);
        for (String string:testStrings) {
            Assert.assertTrue(loadedStrings.contains(string));
        }
    }
}

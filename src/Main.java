import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import model.Chain;
import util.FileParser;
import util.WordsComparator;

public class Main {

    public static void main(String[] args) {
        final String START_WORD = "lead";
        final String FINAL_WORD = "goat";
        final String PATH_TO_FILE = "resources/dictionary.txt";
        try {
            long startTime = System.currentTimeMillis();
            List<String> chainFromFirstWordToDesired = Arrays.asList(START_WORD, FINAL_WORD);
            List<String> dictionary = WordsComparator.getSameLengthWords(
                FileParser.getWordsFromFile(PATH_TO_FILE), START_WORD.length());

            Chain chain = new Chain(dictionary, chainFromFirstWordToDesired);
            chain.print();
            chain.findShortestSuitableChain();
            long endTime = System.currentTimeMillis();
            System.out.println("Founded in " + ((endTime - startTime) / 1000 % 60) + "seconds");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}

package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    final static Charset ENCODING = StandardCharsets.UTF_8;
    public List<String> getWordsFromFile(String pathToFile) throws IOException {


            List<String> list = new ArrayList<>();
            Path path = Paths.get(pathToFile);

            try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String line1 = line.trim().replaceAll("\uFEFF", "");
                    list.add(line1);
                }
                reader.close();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).length() <= 1) {
                        list.remove(i);
                    }
                }
            }
            return list;
        }
}

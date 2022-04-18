package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {
    public static void main(String[] args) {
        Path path = Paths.get("sample.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String content : lines) {
                System.out.println(content);
            }
        } catch (Exception e) {
           System.out.println(e.toString());
        }
    }
}

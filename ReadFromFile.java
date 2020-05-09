import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFromFile {
    public static void main(String[] args) {  
        try {
            Path file = Paths.get("text.txt");
            BufferedReader reader = Files.newBufferedReader(file , 
                    StandardCharsets.UTF_8);
            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
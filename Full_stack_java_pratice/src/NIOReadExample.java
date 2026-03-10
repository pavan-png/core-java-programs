import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class NIOReadExample {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\Pavan\\Downloads\\Documents\\outputnio.txt");

        // Reads entire file
        List<String> lines = Files.readAllLines(path);

        for(String line : lines){
            System.out.println(line);
        }

    }
}
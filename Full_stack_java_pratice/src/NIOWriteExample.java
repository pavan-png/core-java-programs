import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class NIOWriteExample {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\Pavan\\Downloads\\Documents\\outputnio.txt");

        List<String> data = List.of(
                "Java",
                "Spring",
                "Microservices"
        );

        Files.write(path, data);

    }
}
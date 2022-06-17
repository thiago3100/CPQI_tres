import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class arquivos {

    public static void main(String args[]) throws IOException {
       
      Path path = Paths.get("C://CPQI_tres/fonte.txt");
      Files.deleteIfExists(path);
      Files.createFile(path);
      Files.write(path, "Meu texto".getBytes());
      
      Path copia = Paths.get("C://CPQI_tres/copia.txt");
      Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
    }
}

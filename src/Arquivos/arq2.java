import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class arquivos {

    public static void main(String args[]) throws IOException {
       
      Path dir = Paths.get("C://");
      try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
          
          for(Path path : stream){
              System.out.println(path.getFileName());
          }
      }catch(IOException | DirectoryIteratorException e){
          e.printStackTrace();
      }
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DesafioContas {
    
    private Path path = Paths.get("C://CPQI_tres/contas.txt");
    private Charset utf8 = StandardCharsets.UTF_8; 
    
    public void armazenarContas(ArrayList<Contas> contas) throws IOException{    
        try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
            for(Contas conta : contas){
                writer.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
            }
        }
    }
    
    public ArrayList<Contas> recuperarContas() throws IOException{
        ArrayList<Contas> contas = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
            String line = null;
            while((line = reader.readLine()) != null){
                String [] t = line.split(";");
                Contas conta = new Contas(t[0], Double.parseDouble(t[1]));
                contas.add(conta);
            }
        }
        return contas;
    }

    public static void main(String args[]) throws IOException {
   /*
        ArrayList<Contas> contas = new ArrayList<>();
        contas.add(new Contas("Ricardo", 12000.00));
        contas.add(new Contas("Thiago", 3900.00));
        contas.add(new Contas("Felipe", 45000.00));
        contas.add(new Contas("Santos", 98200.00));
        contas.add(new Contas("Bianca", 123200.00));
    */    
        DesafioContas operacao = new DesafioContas();
        //operacao.armazenarContas(contas);
         ArrayList<Contas> contas2 = operacao.recuperarContas();
         for(Contas conta : contas2){
             conta.exibeSaldo();
         }
    }
}

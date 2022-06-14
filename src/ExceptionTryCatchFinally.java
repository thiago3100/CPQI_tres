import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryCatchFinally {
    
    public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException {
              System.out.print("Digite um numero : ");
                int a = s.nextInt();
                
                System.out.print("Digite um numero : ");
                int b = s.nextInt();
                
                System.out.println(a / b);
        } 
    public static void main(String args[]) {
        
        
        Scanner s = new Scanner(System.in);
        boolean continua = true;
        
        
        do{
            try{ 
                dividir(s);
                continua = false;
            }catch(InputMismatchException  | ArithmeticException e1){
                System.err.println("Numero inválido");
                e1.getMessage();
                s.nextLine();
            }
            finally{
                System.out.println("Finally executado...");
            }
        }while(continua);
            
    
    }
}

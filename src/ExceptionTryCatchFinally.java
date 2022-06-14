import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryCatchFinally {

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        boolean continua = true;
        
        do{
            try{ 
                System.out.print("Digite um numero : ");
                int a = s.nextInt();
                
                System.out.print("Digite um numero : ");
                int b = s.nextInt();
                
                System.out.println(a / b);
                continua = false;
            }catch(InputMismatchException e1){
                System.err.println("Numeros devem ser inteiros");
                s.nextLine();
            }catch(ArithmeticException e2){
                System.err.println("Divisor deve ser diferente de 0");
                s.nextLine();
            }
            finally{
                System.out.println("Finally executado...");
            }
        }while(continua);
            
    
    }
}

public class EnumTest {
    
    public static final double PI = 3.14;

   public static void main(String[] args){
          
       System.out.println(PeçasXadrez.BISPO);
       System.out.println(Medida.CM.titulo);
       
       for(Medida m : Medida.values()){
           System.out.println(m + " : " + m.titulo);
       }
        
 }
}
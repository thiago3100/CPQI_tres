public class sobrecarregados {
    double media(int x){
       return x;
   }
   
   double media(int x, int y){
       return (x + y) / 2;
   }
   double media (String x, String y){
       System.out.print("String ");
       int x1 = Integer.parseInt(x);
       int y1 = Integer.parseInt(y);
       return (x1 + y1) / 2;
   }
}

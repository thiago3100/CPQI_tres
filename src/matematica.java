public class matematica {
    
    double soma(double ... numeros){
        double total = 0;
        for(double n : numeros){
            total+= n;
        }
        return total;
    }
}
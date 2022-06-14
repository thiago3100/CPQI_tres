public class AnimalTest {

    public static void main(String args[]) {
        
        Cachorro lobo = new Cachorro();
        Galinhas g1 = new Galinhas();
        g1.peso = 20;
        lobo.dormir();
        lobo.comida = "ração";
        lobo.fazerBarulho();  
        
        System.out.println(g1.peso);
    }
}

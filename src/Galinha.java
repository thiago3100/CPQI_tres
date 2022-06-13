public class Galinha {
    
    public static int ovosDaGranja;
    
    public int ovos;
    public Galinha botar(){
        this.ovos++;
        Galinha.ovosDaGranja++;
        return this;
    }
}

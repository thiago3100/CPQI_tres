public class InterfaceTest {
    
    
    public static void area(AreaCalculavel o){
        System.out.println(o.CalculaArea());
    }
    
    public static void volume(VolumeCalculavel o){
        System.out.println(o.CalculaVolume());
    }
    
    public static void main(String[] args){
        
        area(new Quadrado(2));
        volume(new Cubo(3));
    }
}
public class Cubo implements AreaCalculavel, VolumeCalculavel {
    
    double lado;
    public Cubo(double lado){
        this.lado = lado;
    }

    @Override
    public double CalculaArea() {
       return 6 * lado * lado;
    }
    @Override
    public double CalculaVolume() {
        return lado * lado * lado;
    }
}

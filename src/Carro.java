public class Carro {
    private String modelo;
    private int ano;
    private double kmRodado;
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String md){
        this.modelo = md;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public void setAno(int an){
        this.ano = an;
    }
    
     public double getKmRodado(){
        return this.kmRodado;
    }
    
    public void setKmRodado(int km){
        this.kmRodado = km;
    }
    
    public Carro(String modelo, int ano, double kmRodado ){
        this.modelo = modelo;
        this.ano = ano;
        this.kmRodado = kmRodado;
    }
    public void status(){
        System.out.println("O nome é "+ this.modelo + " " + this.ano + " " + this.kmRodado);
    }
 }
 
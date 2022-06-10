public class Funcionario {

    private String nome;
    private boolean ativo;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public boolean isAtivo(){
        return ativo;
    } 
    
    public void setAtivo(boolean ative){
        this.ativo = ative;
    }
    
    public void status(){
        System.out.println("O nome é "+ this.nome);
    }
 }
 
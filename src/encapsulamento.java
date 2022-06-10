public class encapsulamento {

    public static void main(String[] args) {
       
        Funcionario f = new Funcionario();
        String n = f.getNome();
        f.setNome("Thiago");
        f.status();
    }
}

public class Arquiteto extends Funcionario {

    public Arquiteto(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void fazAlgo() {
        System.out.println(this.nome + "está fazendo uma casa");
    }
}

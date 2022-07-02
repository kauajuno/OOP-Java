public class Gerente extends Funcionario{
    private double salario_mensal;
    private double bonificacao;

    Gerente(String nome, String sobrenome, double salario_mensal, double bonificacao){
        super(nome, sobrenome);
        this.salario_mensal = salario_mensal;
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public void setSalario_mensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }


    @Override
    public double getRenda() {
        return this.salario_mensal + this.bonificacao;
    }
}

public class Comissionado extends Funcionario{
    private double salario_mensal;
    private int total_vendas;
    private double perc_comissao;

    Comissionado(String nome, String sobrenome, double salario_mensal, int total_vendas, double perc_comissao){
        super(nome, sobrenome);
        this.salario_mensal = salario_mensal;
        this.total_vendas = total_vendas;
        this.perc_comissao = perc_comissao;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public double getPerc_comissao() {
        return perc_comissao;
    }

    public int getTotal_vendas() {
        return total_vendas;
    }

    public void setSalario_mensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }

    public void setPerc_comissao(double perc_comissao) {
        this.perc_comissao = perc_comissao;
    }

    public void setTotal_vendas(int total_vendas) {
        this.total_vendas = total_vendas;
    }

    @Override
    public double getRenda() {
        return this.salario_mensal + this.total_vendas * this.perc_comissao;
    }
}

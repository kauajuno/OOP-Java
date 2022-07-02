public class Administrador extends Funcionario{
    private double salario_mensal;

    Administrador(String nome, String sobrenome, double salario_mensal){
        super(nome, sobrenome);
        this.salario_mensal = salario_mensal;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }

    @Override
    public double getRenda(){
        return getSalario_mensal();
    }
}

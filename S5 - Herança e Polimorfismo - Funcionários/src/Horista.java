public class Horista extends Funcionario{
    private int horas_trabalhadas;
    private double valor_hora;

    Horista(String nome, String sobrenome, int horas_trabalhadas, double valor_hora){
        super(nome, sobrenome);
        this.horas_trabalhadas = horas_trabalhadas;
        this.valor_hora = valor_hora;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }

    @Override
    public double getRenda() {
        return this.horas_trabalhadas * this.valor_hora;
    }
}

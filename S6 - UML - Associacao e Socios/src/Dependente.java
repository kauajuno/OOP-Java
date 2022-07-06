public class Dependente extends Socio{
    private int tipo;

    Dependente(String nome, int idade, char genero, int tipo){
        super(nome, idade, genero);
        this.tipo = tipo;
    }

    public double calcularValorMensalidade(){
        if(idade < 10 && tipo != 3) return 100;
        else if(idade < 22 && tipo != 3) return 150;
        else if(idade < 66 && tipo != 3) return 200;
        else if(idade < 66) return 250;
        else return 150;
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "tipo=" + tipo +
                "} " + super.toString();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Titular extends Socio{
    private int numTitulo;
    List<Object> dependente = new ArrayList<>();

    Titular(String nome, int idade, char genero, int numTitulo){
        super(nome, idade, genero);
        this.numTitulo = numTitulo;
    }

    public double calcularValorMensalidade(){
        double valorDependentes = 0;
        for(Object dep : dependente){
            if (dep instanceof Dependente) valorDependentes += ((Dependente) dep).calcularValorMensalidade();
        }
        if(idade > 21 && idade < 66) return 500 + valorDependentes;
        else return 200 + valorDependentes;
    }

    public void associarObjetos(Object obj){
        dependente.add(obj);
    }

    @Override
    public String toString() {
        return "Titular{" +
                "numTitulo=" + numTitulo +
                ", dependente=" + dependente +
                "} " + super.toString();
    }
}

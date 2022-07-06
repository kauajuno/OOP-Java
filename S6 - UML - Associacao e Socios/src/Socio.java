public abstract class Socio {
    private String nome;
    int idade;
    private char genero;

    Socio(String nome, int idade, char genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public double calcularValorMensalidade(){
        return 2;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero=" + genero +
                '}';
    }
}

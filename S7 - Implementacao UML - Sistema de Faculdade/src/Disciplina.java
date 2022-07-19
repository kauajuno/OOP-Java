public class Disciplina {
    private int codigo;
    private String nome;
    private int creditos;

    Disciplina(int codigo, String nome, int creditos){
        this.codigo = codigo;
        this.nome = nome;
        this.creditos = creditos;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", creditos=" + creditos +
                '}';
    }
}

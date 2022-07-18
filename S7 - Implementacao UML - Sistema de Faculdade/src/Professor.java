public class Professor extends Pessoa{

    private int matricula;
    private String formacao;

    public Professor(String nome, Endereco endereco, int matricula, String formacao){
        super(nome, endereco);
        this.matricula = matricula;
        this.formacao = formacao;
    }

    @Override
    public String mostraDados() {
        return null;
    }
}

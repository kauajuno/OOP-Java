public class Professor extends Pessoa{

    private int matricula;
    private String formacao;

    public Professor(String nome, Endereco endereco, int matricula, String formacao){
        super(nome, endereco);
        this.matricula = matricula;
        this.formacao = formacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getFormacao() {
        return formacao;
    }

    @Override
    public String mostraDados() {
        return this.getNome() + "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "Matrícula: " + this.getMatricula() + "\n" +
                "Formação: " + this.getFormacao();
    }
}

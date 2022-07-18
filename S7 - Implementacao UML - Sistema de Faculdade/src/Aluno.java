public class Aluno extends Pessoa{

    private int matricula;
    private int ano;
    private Curso curso;

    Aluno(String nome, Endereco endereco, int matricula, int ano){
        super(nome, endereco);
        this.matricula = matricula;
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String mostraDados() {
        return null;
    }
}

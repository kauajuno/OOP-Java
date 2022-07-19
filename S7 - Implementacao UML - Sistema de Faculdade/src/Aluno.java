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

    public int getMatricula() {
        return matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String mostraDados() {
        return this.getNome() + "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "Matrícula: " + this.getMatricula() + "\n" +
                "Curso: " + this.getCurso() + "\n" +
                "Ano: " + this.getAno();
    }
}

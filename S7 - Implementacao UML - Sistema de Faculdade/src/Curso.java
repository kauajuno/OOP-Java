import java.util.ArrayList;

public class Curso {
    private String nome;
    private String codigo;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Curso(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}

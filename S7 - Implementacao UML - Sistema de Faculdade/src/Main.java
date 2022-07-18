import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args){

        String nomeMateria, nomeCurso;
        boolean flag;

        Curso auxCurso;
        Aluno auxAluno;
        Professor auxProfessor;

        ArrayList<Disciplina> disciplinaArrayList = new ArrayList<>();
        ArrayList<Curso> cursoArrayList = new ArrayList<>();
        ArrayList<Aluno> alunoArrayList = new ArrayList<>();
        ArrayList<Professor> professorArrayList = new ArrayList<>();


        // Cadastro de disciplinas
        while(!Objects.equals(JOptionPane.showInputDialog("Cadastrar nova disciplina? Sim/Não"), "Não")){
            disciplinaArrayList.add(new Disciplina(
                    Integer.parseInt(JOptionPane.showInputDialog("Código da disciplina (números)")),
                    JOptionPane.showInputDialog("Nome da disciplina"),
                    Integer.parseInt(JOptionPane.showInputDialog("Créditos da disciplina (1 crédito = 16 horas)"))
            ));
        }


        // Cadastro de cursos
        while(!Objects.equals(JOptionPane.showInputDialog("Cadastrar novo curso Sim/Não"), "Não")){
            auxCurso = new Curso(
                    JOptionPane.showInputDialog("Nome do curso"),
                    JOptionPane.showInputDialog("Código do curso (INF, IME, etc.)")
            );
            while(!Objects.equals(JOptionPane.showInputDialog("Associar matéria ao curso? Sim/Não"), "Não")){
                nomeMateria = JOptionPane.showInputDialog("Insira o nome da matéria");
                for(Disciplina disciplina : disciplinaArrayList){
                    if(disciplina.getNome().equals(nomeMateria)) auxCurso.addDisciplina(disciplina);
                }
            }
            cursoArrayList.add(auxCurso);
        }

        // Cadastro de alunos
        while(!Objects.equals(JOptionPane.showInputDialog("Cadastrar novo aluno? Sim/Não"), "Não")){
            flag = true;
            auxAluno = new Aluno(
                    JOptionPane.showInputDialog("Nome do aluno"),
                    new Endereco(
                            JOptionPane.showInputDialog("Rua"),
                            Integer.parseInt(JOptionPane.showInputDialog("Número")),
                            JOptionPane.showInputDialog("Bairro")
                    ),
                    Integer.parseInt(JOptionPane.showInputDialog("Matrícula do aluno")),
                    Integer.parseInt(JOptionPane.showInputDialog("Ano do aluno"))
            );
            while(flag){
                nomeCurso = JOptionPane.showInputDialog("Insira o nome do curso do aluno");
                for(Curso curso : cursoArrayList){
                    if(curso.getNome().equals(nomeCurso)){
                        auxAluno.setCurso(curso);
                        alunoArrayList.add(auxAluno);
                        JOptionPane.showMessageDialog(null, "Aluno cadastrado!");
                        flag = false;
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "Curso não encontrado!");
                }
            }
        }

        // Cadastro de professores
        while(!Objects.equals(JOptionPane.showInputDialog("Cadastrar novo professor? Sim/Não"), "Não")){
            auxProfessor = new Professor(
                    JOptionPane.showInputDialog("Insira o nome do professor"),
                    new Endereco(
                            JOptionPane.showInputDialog("Rua"),
                            Integer.parseInt(JOptionPane.showInputDialog("Número")),
                            JOptionPane.showInputDialog("Bairro")
                    ),
                    Integer.parseInt(JOptionPane.showInputDialog("Insira a matrícula do professor")),
                    JOptionPane.showInputDialog("Insira a formação do professor")
            );
            professorArrayList.add(auxProfessor);
        }


    }

}

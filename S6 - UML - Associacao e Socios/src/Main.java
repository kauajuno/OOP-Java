import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Titular> titularList =  new ArrayList<>();

        int cont;
        int qtdDependentes;

        do{
            titularList.add(new Titular(
                            JOptionPane.showInputDialog("Nome do titular"),
                            Integer.parseInt(JOptionPane.showInputDialog("Idade do titular")),
                            JOptionPane.showInputDialog("Gênero do titular").charAt(0),
                            Integer.parseInt(JOptionPane.showInputDialog("Número do titular"))
                            )
            );
            cont = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastar novo titular\n" + "2. Sair"));
        }while (cont == 1);

        for(Titular titular : titularList){
            qtdDependentes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de dependentes de " + titular.getNome()));
            for(cont=0;cont<qtdDependentes;cont++){
                titular.associarObjetos(new Dependente(
                        JOptionPane.showInputDialog("Nome do dependente "+cont),
                        Integer.parseInt(JOptionPane.showInputDialog("Idade do dependente "+cont)),
                        JOptionPane.showInputDialog("Gênero do dependente "+cont).charAt(0),
                        Integer.parseInt(JOptionPane.showInputDialog("Tipo do dependente "+cont+"\n" +
                                "Tipo 1: filho/a/e\n"+
                                "Tipo 2: cônjugue\n"+
                                "Tipo 3: outro"))
                ));
            }
        }

        for(Titular titular : titularList){
            JOptionPane.showMessageDialog(
                    null,
                    titular.getNome() + "\n Valor da mensalidade: " + titular.calcularValorMensalidade());
        }

    }
}

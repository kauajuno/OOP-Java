import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String auxNomeCidade;
        Cidade cidadeTemp1, cidadeTemp2;
        ArrayList<Cidade> cidadeArrayList = new ArrayList<>();

        System.out.println("Inserir nova cidade? s/n");
        while(!sc.nextLine().equals("n")){
            System.out.println("Insira o código, o nome da cidade e a área em metros quadrados: ");
            cidadeArrayList.add(new Cidade(
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextDouble()
            ));
            sc.nextLine();
            System.out.println("Inserir nova cidade? s/n");
        }

        for(Cidade cidade : cidadeArrayList){
            System.out.println("Adicionar nova fronteira para " + cidade.getNome() + "? s/n");
            while(!sc.nextLine().equals("n")){
                System.out.println("Insira o nome da cidade fronteira: ");
                auxNomeCidade = sc.nextLine();
                for(Cidade cidade1 : cidadeArrayList){
                    if (cidade1.getNome().equals(auxNomeCidade)){
                        cidade.addFronteira(cidade1);
                        break;
                    }
                }
                System.out.println("Adicionar nova fronteira para " + cidade.getNome() + "? s/n");
            }
        }

        System.out.println("Checar se duas cidades são limítrofes? s/n");
        while(!sc.nextLine().equals("n")){
            System.out.println("Insira o nome da primeira cidade");
            auxNomeCidade = sc.nextLine();
            for(Cidade cidade1 : cidadeArrayList){
                if(cidade1.getNome().equals(auxNomeCidade)){
                    System.out.println("Insira o nome da segunda cidade");
                    auxNomeCidade = sc.nextLine();
                    for (Cidade cidade2 : cidadeArrayList){
                        if (cidade2.getNome().equals(auxNomeCidade)){
                            System.out.println(cidade1.isLimitrofe(cidade2));
                            break;
                        }
                    }
                    break;
                }
            }
            System.out.println("Checar se duas cidades são limítrofes? s/n");
        }

        for(Cidade cidade : cidadeArrayList){
            System.out.println("Informe a quantidade de habitantes de " + cidade.getNome());
            cidade.setHabitantes(sc.nextInt());
            sc.nextLine();
        }

        for(Cidade cidade : cidadeArrayList){
            System.out.println(cidade.getNome() + " - " + cidade.getClassificacao());
        }

        for(Cidade cidade : cidadeArrayList){
            System.out.println("Obter os vizinhos em comum de " + cidade.getNome() + " com outra cidade? s/n");
            while(!sc.nextLine().equals("n")){
                System.out.println("Insira o nome da cidade com a qual se deseja comparar");
                auxNomeCidade = sc.nextLine();
                for(Cidade cidade1 : cidadeArrayList){
                    if(auxNomeCidade.equals(cidade1.getNome())){
                        System.out.println("Cidades em comum entre " + cidade.getNome() + " e " + cidade1.getNome());
                        for(Cidade cidadeComum : cidade.vizinhosEmComum(cidade1)){
                            System.out.println(cidadeComum.getNome());
                        }
                    }
                }
                System.out.println("Obter os vizinhos em comum de " + cidade + " com outra cidade? s/n");
            }
        }

        for(Cidade cidade : cidadeArrayList){
            System.out.println(cidade.mostraDados());
        }
    }
}

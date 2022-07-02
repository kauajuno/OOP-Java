import javax.swing.JOptionPane;

public class Main {
    static int QTD_FUNCIONARIOS = 10;

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[QTD_FUNCIONARIOS];
        int[] tipo = new int[QTD_FUNCIONARIOS];

        int tipo_funcionario;
        int i;
        String nome;
        String sobrenome;
        Gerente gerente;
        Administrador administrador;
        Comissionado comissionado;
        Horista horista;

        for (i = 0; i < QTD_FUNCIONARIOS; i++) {
            tipo_funcionario = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    1. CADASTRAR ADMINISTRADOR
                    2. CADASTRAR GERENTE
                    3. CADASTRAR COMISSIONADO
                    4. CADASTRAR HORISTA
                    """));

            tipo[i] = tipo_funcionario;
            nome = JOptionPane.showInputDialog("Nome do funcionário");
            sobrenome = JOptionPane.showInputDialog("Sobrenome do funcionário");

            switch (tipo_funcionario) {
                case 1 -> {
                    funcionarios[i] = new Administrador(
                            nome,
                            sobrenome,
                            Double.parseDouble(JOptionPane.showInputDialog("Salário"))
                    );
                    System.out.println("Administrador criado!\n" + funcionarios[i]);
                }
                case 2 -> {
                    funcionarios[i] = new Gerente(
                            nome,
                            sobrenome,
                            Double.parseDouble(JOptionPane.showInputDialog("Salário mensal")),
                            Double.parseDouble(JOptionPane.showInputDialog("Bonificação"))
                    );
                    System.out.println("Gerente criado!\n" + funcionarios[i]);
                }
                case 3 -> {
                    funcionarios[i] = new Comissionado(
                            nome,
                            sobrenome,
                            Double.parseDouble(JOptionPane.showInputDialog("Salário mensal")),
                            Integer.parseInt(JOptionPane.showInputDialog("Bonificação")),
                            Double.parseDouble(JOptionPane.showInputDialog("Percentual de bonificação"))
                    );
                    System.out.println("Comissionado criado!\n" + funcionarios[i]);
                }
                case 4 -> funcionarios[i] = new Horista(
                        nome,
                        sobrenome,
                        Integer.parseInt(JOptionPane.showInputDialog("Horas trabalhadas")),
                        Double.parseDouble(JOptionPane.showInputDialog("Valor da hora"))
                );
                default -> {
                    System.out.println("Invalid number!");
                    i--;
                }
            }
        }

        for (i=0; i<QTD_FUNCIONARIOS; i++){
            System.out.println(funcionarios[i]);
            switch (tipo[i]) {
                case 1 -> {
                    administrador = (Administrador) funcionarios[i];
                    System.out.println(administrador.getRenda());
                }
                case 2 -> {
                    gerente = (Gerente) funcionarios[i];
                    System.out.println(gerente.getRenda());
                }
                case 3 -> {
                    comissionado = (Comissionado) funcionarios[i];
                    System.out.println(comissionado.getRenda());
                }
                case 4 -> {
                    horista = (Horista) funcionarios[i];
                    System.out.println(horista.getRenda());
                }
            }
        }
    }
}

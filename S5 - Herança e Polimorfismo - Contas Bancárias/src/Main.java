import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Conta> contaArrayList = new ArrayList<>();

        while (true){
            int num_conta = Integer.parseInt(JOptionPane.showInputDialog("Número da conta"));
            if (num_conta == 0){
                break;
            }
            String nome_dono = JOptionPane.showInputDialog("Nome do cliente");
            String telefone_dono = JOptionPane.showInputDialog("Telefone do cliente");

            switch (num_conta) {
                case 1 -> contaArrayList.add(new ContaCorrente(num_conta, new Cliente(nome_dono, telefone_dono)));
                case 2 -> contaArrayList.add(new ContaSalario(num_conta, new Cliente(nome_dono, telefone_dono)));
                case 3 -> contaArrayList.add(new ContaPoupanca(num_conta, new Cliente(nome_dono, telefone_dono)));
            }

        }

        for (Conta conta : contaArrayList){
            System.out.println(conta);
        }
    }
}

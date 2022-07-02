public class TestaConta {
    public static void main(String[] args){
        ContaCorrente cc1 = new ContaCorrente(1, new Cliente("Gabriel Mesquita", "992879010"));
        ContaPoupanca cp1 = new ContaPoupanca(2, new Cliente("Kauã Júnio", "995229200"));
        ContaCorrente cc2 = new ContaCorrente(3, new Cliente("Ana Júlia Amorim", "999995555"));
        ContaPoupanca cp2 = new ContaPoupanca(4, new Cliente("Dione Júnior", "988887777"));
        ContaSalario cs1 = new ContaSalario(5, new Cliente("Luiz Pires", "995230078"));
        ContaSalario cs2 = new ContaSalario(6, new Cliente("Vitor Ribeiro", "995678130"));

        cc1.depositar(200);
        cc1.sacar(100);

        cp1.depositar(200);
        cp1.sacar(100);

        cp1.atualizaSaldo(50);

        cc1.transferir(50, cc2);
        cp1.transferir(50, cp2);

        cs1.depositar(1000);
        cs1.sacar(500);

        cs2.depositar(1000);
        cs2.sacar(500);





    }
}

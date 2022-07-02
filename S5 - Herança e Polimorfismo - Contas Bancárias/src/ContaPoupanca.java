public class ContaPoupanca extends Conta {
    ContaPoupanca(int numero, Cliente dono){
        super(numero, dono);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        destino.saldo = destino.saldo + valor - 0.05;
        this.saldo = this.saldo - valor - 0.05;
        System.out.println(this);
        System.out.println(destino);
    }

    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
        System.out.println(this);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println(this);
    }

    public void atualizaSaldo(float perc) {
        this.saldo = this.saldo + this.saldo * perc/100;
        System.out.println(this);
    }

}

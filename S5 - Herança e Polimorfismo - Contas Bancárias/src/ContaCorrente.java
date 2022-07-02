public class ContaCorrente extends Conta{
    ContaCorrente(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        this.saldo = this.saldo - 0.05;
        System.out.println(this);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
        this.saldo = this.saldo - 0.05;
        System.out.println(this);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        destino.saldo = destino.saldo + valor - 0.05;
        this.saldo = this.saldo - valor - 0.05;
        System.out.println(this);
        System.out.println(destino);
    }

}

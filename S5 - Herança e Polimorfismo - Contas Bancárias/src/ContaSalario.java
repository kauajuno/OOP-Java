public class ContaSalario extends ContaCorrente{
    ContaSalario(int numero, Cliente dono){
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - valor - 0.01;
        System.out.println(this);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor - 0.01;
        System.out.println(this);
    }

}

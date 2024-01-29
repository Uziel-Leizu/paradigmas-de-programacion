package banco2;

public class Cuenta {
    protected double saldo;
    public Cuenta (double saldoInicial){
        saldo=saldoInicial;
    }
    public double consultar(){
        return saldo;
    }
    public void depositar(double monto){
        saldo=saldo+monto;
    }
    public void retirar(double monto){
        saldo=saldo-monto;
    }
}

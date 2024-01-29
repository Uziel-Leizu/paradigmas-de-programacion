package banco2;

public class CuentaDeAhorros extends Cuenta{
    private double tasaDeInteres;

    public CuentaDeAhorros(double saldoInicial,double interes) {
        super(saldoInicial);
        tasaDeInteres = interes;
    }
    
    @Override
    public double consultar(){
        return saldo = saldo + (tasaDeInteres * saldo);
    }
}

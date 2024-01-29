package banco2;

public class CuentaDeCheques extends Cuenta{
    private double montoSobregiro;

    public CuentaDeCheques(double saldoInicial,double sobregiro){
        super(saldoInicial);
    }
    
    public CuentaDeCheques(double saldoInicial) {
        super(saldoInicial);
    }

    void consultarSobregiro() {
        System.out.println("Su sobregiro es: " + montoSobregiro);
    }
}

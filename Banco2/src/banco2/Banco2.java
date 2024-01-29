package banco2;

public class Banco2 {
    public static void main(String[] args) {
        CuentaDeAhorros ca1=new CuentaDeAhorros(1000, 0.3);
        CuentaDeCheques cch1=new CuentaDeCheques(1000,1000);
        System.out.println("Cuenta de ahorros: " + ca1.consultar());
        System.out.println("Cuenta de cheques, saldo: "+ cch1.consultar());
        cch1.retirar(1000);
        System.out.println("Cuenta de cheques, saldo: "+ cch1.consultar());
        cch1.retirar(500);
        System.out.println("cuenta de cheqes, saldo: "+ cch1.consultar());
        cch1.consultarSobregiro();
        cch1.retirar(499);
        cch1.consultarSobregiro();
        cch1.retirar(2);
    }  
}

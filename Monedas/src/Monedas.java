import java.util.Scanner;
public class Monedas {

    public static void main(String[] args) {
        
        System.out.println("Problema de dar cambio");
        
        Scanner teclado = new Scanner(System.in);
        
        //Monedas
        int MonedaUno=0;
        int MonedaDos=0;
        int MonedaCinco=0; 
        int MonedaDiez=0;
        
        //Billetes
        int BilleteVeinte=0;
        int BilleteCincuenta=0; 
        int BilleteCien=0;
        int BilleteDoscientos=0;
        int BilleteQuinientos=0;
        int aux1=0, aux2=0, aux5=0, aux10=0;
        
        int aux20=0; 
        int aux50=0; 
        int aux100=0; 
        int aux200=0;
        int aux500=0;
        int cambio;
        System.out.println("Cantidad de Monedas o Billetes");
        
        //Monedas
        System.out.println("Monedas\n");
        System.out.println("Monedas de Uno");
        MonedaUno = teclado.nextInt();
        System.out.println("Monedas de Dos");
        MonedaDos = teclado.nextInt();
        System.out.println("Monedas de Cinco");
        MonedaCinco = teclado.nextInt();
        System.out.println("Monedas de Diez");
        MonedaDiez = teclado.nextInt();
        
        //Billetes
        System.out.println("Billetes\n");
        System.out.println("Billetes de Veinte");
        BilleteVeinte = teclado.nextInt();
        System.out.println("Billetes de Cincuenta");
        BilleteCincuenta = teclado.nextInt();
        System.out.println("Billetes de Cien");
        BilleteCien = teclado.nextInt();
        System.out.println("Billetes de Doscientos");
        BilleteDoscientos = teclado.nextInt();
        System.out.println("Billetes de Quinientos");
        BilleteQuinientos = teclado.nextInt();
        
        //Cambio
        System.out.println("Cambio a regresar");
        cambio = teclado.nextInt();
        
        //Ejecución de lectura de datos y cambio.
        while(cambio>0){
            if(cambio>= 500 && BilleteQuinientos>0){
                cambio= cambio - 500;
                BilleteQuinientos= BilleteQuinientos-1;
                aux500++;
            }
            if((cambio>= 200 && cambio < 500 && BilleteDoscientos>0) || (cambio>= 500 && BilleteQuinientos==0 && BilleteDoscientos>0)){
                cambio= cambio - 200;
                BilleteDoscientos= BilleteDoscientos-1;
                aux200++;
            }
            if((cambio>= 100 && cambio < 200 && BilleteCien>0) || (cambio>= 200 && BilleteQuinientos==0 && BilleteDoscientos == 0 && BilleteCien>0)){
                cambio= cambio - 100;
                BilleteCien= BilleteCien-1;
                aux100++;
            }
            if((cambio>= 50 && cambio < 100 && BilleteCincuenta>0) || (cambio>= 100 && BilleteQuinientos==0 && BilleteDoscientos == 0 && 
                    BilleteCien==0 && BilleteCincuenta>0)){
                cambio= cambio - 50;
                BilleteCincuenta= BilleteCincuenta-1;
                aux50++;
            }
            if((cambio>= 20 && cambio < 50 && BilleteVeinte>0) || (cambio>= 50 && BilleteQuinientos==0 && BilleteDoscientos == 0 && 
                    BilleteCien==0 && BilleteCincuenta == 0 && BilleteVeinte>0)){
                cambio= cambio - 20;
                BilleteVeinte= BilleteVeinte-1;
                aux20++;
            }
            if((cambio>= 10 && cambio < 20 && MonedaDiez>0) || (cambio>= 20 && BilleteQuinientos==0 && BilleteDoscientos == 0 && 
                    BilleteCien==0 && BilleteCincuenta == 0 && BilleteVeinte == 0 && MonedaDiez>0)){
                cambio= cambio - 10;
                MonedaDiez= MonedaDiez-1;
                aux10++;
            }
            if((cambio>= 5 && cambio < 10 && MonedaCinco>0) || (cambio>= 10 && BilleteQuinientos==0 && BilleteDoscientos == 0 && 
                    BilleteCien==0 && BilleteCincuenta == 0 && BilleteVeinte == 0 && MonedaDiez==0 && MonedaCinco>0)){
                cambio= cambio - 5;
                MonedaCinco= MonedaCinco-1;
                aux5++;
            }
            if((cambio>= 2 && cambio < 5 && MonedaDos>0) || (cambio>= 5 && BilleteQuinientos==0 && BilleteDoscientos == 0 && 
                    BilleteCien==0 && BilleteCincuenta == 0 && BilleteVeinte == 0 && MonedaDiez==0 && MonedaCinco==0 && MonedaDos>0)){
                cambio= cambio - 2;
                MonedaDos= MonedaDos-1;
                aux2++;
            }
            if((cambio>= 1 && cambio < 2 && MonedaUno>0) || (cambio>= 2 && BilleteQuinientos==0 && BilleteDoscientos == 0 && 
                    BilleteCien==0 && BilleteCincuenta == 0 && BilleteVeinte == 0 && MonedaDiez==0 && MonedaCinco==0 && MonedaDos == 0 && MonedaUno>0)){
                cambio= cambio - 1;
                MonedaUno= MonedaUno-1;
                aux1++;
            }
            if(cambio> 0 && BilleteQuinientos==0 && BilleteDoscientos == 0 && 
                    BilleteCien==0 && BilleteCincuenta == 0 && BilleteVeinte == 0 && MonedaDiez==0 && MonedaCinco==0 && MonedaDos == 0 && MonedaUno == 0){
                System.out.println("No existe dinero disponible para el cambio");
                break;
            }
        }
        if(cambio>0){
            System.out.println("No es posible devolver cambio");
          
        }
        if(cambio == 0){
            System.out.println("Cambio");
            
            //Monedas
            System.out.println("Monedas\n");
            System.out.println("1=" +aux1);
            System.out.println("2=" +aux2);
            System.out.println("5=" +aux5);
            System.out.println("10=" +aux10);
            
            //Billetes
            System.out.println("Billetes\n");
            System.out.println("20=" +aux20);
            System.out.println("50=" +aux50);
            System.out.println("100=" +aux100);
            System.out.println("200=" +aux200);
            System.out.println("500=" +aux500);
        }
        
    }
    
}
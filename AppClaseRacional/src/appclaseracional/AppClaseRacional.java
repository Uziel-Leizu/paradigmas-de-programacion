package appclaseracional;

import java.util.Random;

public class AppClaseRacional {

    public static void main(String[] args) {

		ClaseRacional A;

		A = new ClaseRacional("A",1,2);
		ClaseRacional B = new ClaseRacional("B",2,4);
		ClaseRacional C = new ClaseRacional("C",2,5);
                
//                System.out.println("*************************");
//		A.imprimir();
//                B.imprimir();
//                C.imprimir();
//                A.imprimir();
//                B.imprimir();
//                C.imprimir(); 
//                System.out.println("-----------------");
//		A.imprimir();
//                A.mult(B.mult(C));
//                A.imprimir();
                System.out.println("Uso de equals");
                A.imprimir();
                B.imprimir();
                A=B;
                boolean b = A.equals(B);
                System.out.println("Valor de la variable es: "+b);
                System.out.println((B));
                
                System.out.println("Generamos un numero Racional aleatoriamente: ");
                Random rand = new Random();
                int x = rand.nextInt(10);
                int y = rand.nextInt(10);
                int z = rand.nextInt(30);
                String S = "G" +z;
                ClaseRacional azar = new ClaseRacional(S,x,y);
                azar.imprimir();
                System.out.println(azar);
                        
    }
    
}

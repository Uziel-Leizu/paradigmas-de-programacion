package programaciondinamica;

import java.util.Scanner;

public class ProgramacionDinamica {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero de matrices");
        int k = scan.nextInt();

        Matriz [] entrada = new Matriz[k];

        int fila, columna, value;
        String nombre;

        for (int i = 0; i < k; ++i) {
            System.out.println("Ingrese la matriz "+(i+1));
            nombre = scan.next();
            fila = scan.nextInt();
            columna = scan.nextInt();
            entrada[i] = new Matriz(fila, columna, nombre, 0);
        }
        Matriz[][] memo = new Matriz[k][k];

        for (int i = 0; i < k - 1; ++i) {
            fila = entrada[i].f;
            columna = entrada[i + 1].c;
            nombre = "(" + entrada[i].n + entrada[i + 1].n + ")";
            value = fila * columna * entrada[i].c;
            memo[i][i + 1] = new Matriz(fila, columna, nombre, value);
        }

        for (int i = 2; i < k; i++) {
            for (int j = 0; j < k - i; j++) {
                memo[j][i + j] = seleccionar(memo[j][i + j - 1], entrada[i + j], memo[j + 1][i + j], entrada[j]);
            }
        }

        System.out.println("Menor cantidad: " + memo[0][k - 1] + "\n\n");

        for (Matriz[] mats : memo) {
            for (Matriz m : mats) {
                System.out.printf("%-20s", m);
            }
            System.out.println();
        }
    }

    public static Matriz seleccionar(Matriz izq, Matriz act, Matriz abajo, Matriz fila) {

        int val1 = izq.f * izq.c * act.c + izq.v;
        int val2 = abajo.v + fila.f * fila.c * abajo.c;

        Matriz ans;
        if (val2 <= val1) {
            ans = new Matriz(fila.f, abajo.c, "(" + fila.n + abajo.n + ")", val2);
        } else {
            ans = new Matriz(izq.f, act.c, "(" + izq.n + act.n + ")", val1);
        }

        return ans;

    }

}

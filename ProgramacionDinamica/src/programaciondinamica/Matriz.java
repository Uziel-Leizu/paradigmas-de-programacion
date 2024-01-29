package programaciondinamica;

public class Matriz {
    public int f,c, v;
    public String n;

    public Matriz(int fila, int columna, String nombre,int value){
        f = fila;
        c = columna;
        n = nombre;
        v = value;
    }

    @Override
    public String toString(){
        String info;
        info = n + f + "x" + c + "->" + v;
        return info;
    }
}

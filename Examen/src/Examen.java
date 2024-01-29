class Empleado{
    void hacerTrabajo(){ System.out.println("Trabajo generico");}
}
class Gerente extends Empleado{
    @Override
    void hacerTrabajo(){System.out.println("Gestionar");}
    void hobby(){System.out.println("Netflix");}
}
public class Examen{
    public static void main (String[] args){
        Empleado[]a= {new Empleado(), new Gerente(), new Empleado()};
        for(Empleado emp: a){
            emp.hacerTrabajo();
            if(emp instanceof Gerente){
                Gerente d= (Gerente) emp;
                d.hobby();
            }
        }
    }
}
package appclaseracional;

public class ClaseRacional {
private int num;
	private int den;
        private String nombre;
        
        public ClaseRacional (String nom){
            num=den=1;
            nombre=nom;
        }

	public ClaseRacional(String nom, int num, int den){
		this.num = num;
                nombre = nom;
		if(den == 0)
			this.den = 1;
		else
			this.den = den;
	}
	public ClaseRacional(){
		num = den = 0;
	}
	
	public void establecer(String nom,int num, int den){

		this.num = num;
		if(den == 0)
			this.den = 1;
		else
			this.den = den;
                        nombre =nom;
	}
//        public void mult(ClaseRacional R){
//            num *= R.num;
//            den *= R.den;
//        }
        
	public void imprimir(){
		System.out.println(nombre + ":" + "[" + num + "," + den + "]");
	}
        public ClaseRacional mult(ClaseRacional X){
            num=num * X.num;
            den=den * X.den;
            return this;
        }
        
        public boolean equals(ClaseRacional X){
            if(X.den*this.num == X.num*this.den)
                return true;
            else
                return false;
        }
        
@Override
        public String toString(){
            return nombre + ":" +" Numerador : " + num + " Denominador: " + den;
        }
}

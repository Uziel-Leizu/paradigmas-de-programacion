package appcadenas;

public class Contador {
    String s;
    
    Contador(){
        
    }
    
    Contador(String s){
        this.s = s;
    }
    
    public int contPal(String s){
        char c;
        int cont = 1;
        for(int i=0; i<s.length();i++){
            c = s.charAt(i);
            if(c == ' ')
               cont ++;
        }
        return cont;
    }
}

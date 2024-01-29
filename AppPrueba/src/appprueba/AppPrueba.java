package appprueba;


public class AppPrueba {

    public static void main(String[] args) {
        String s1 = new String("Soy un String");
        String s2 = new String("Soy un String");
        
        boolean res1 = (s1 == s2);
        boolean res2 = s1.equals(s2);
        
        System.out.println("s1==s2: "+res1);
        System.out.println("s1.equals(s2): "+res2);
    }
    
}

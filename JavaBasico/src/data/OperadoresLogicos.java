package data;

public class OperadoresLogicos {
    // Métodos
    
    public void principal(){
        System.out.println("==========================================");
        System.out.println("Bienvenido Al Modulo De Operadores Logicos");
        System.out.println("==========================================");
        
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        System.out.println("OPERADOR LOGICO (AND) (Y) SIMBOLO = (&&)");
        System.out.println("Verdadero && Verdadero: " + String.valueOf(esVerdadero && esVerdadero));
        System.out.println("Falso && Verdadero: " + String.valueOf(esFalso && esVerdadero));
        System.out.println("Verdadero && Falso: " + String.valueOf(esVerdadero && esFalso));
        System.out.println("Falso && Falso: " + String.valueOf(esFalso && esFalso));
        
    }
}

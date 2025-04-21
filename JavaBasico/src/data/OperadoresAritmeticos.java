package data;

public class OperadoresAritmeticos {
    
    
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("no se puede dividir");
        }
        return (double) a / b;
    }
}

    
   

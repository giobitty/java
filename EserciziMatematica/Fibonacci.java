package EserciziMatematica;
public class Fibonacci{
    private static long[] fibonacciCache;
    //trovare un numero nella lista dei numeri di fibonacci
    public static void main(String[] args){
        int n = 9;
        fibonacciCache = new long[n+1];

        //stampiamo tutti i numeri fino a quel punto
        for (int i=0; i <=n; i++){
        System.out.println(fibonacci(i) + " ");
        }
        //limite e'il numero che la primitiva long puo contenere, limite di n e' 92
    }

    private static long fibonacci(int n){
        if(n<=1){
            return n;
            }
        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }
        //salviamo il risultato
        long nthFibonacciNumber = (fibonacci(n-1)+fibonacci(n-2));
        fibonacciCache[n]= nthFibonacciNumber;
        return nthFibonacciNumber;
        
    }
    
    //ci serve salvare la variabile, creiamo un array
}
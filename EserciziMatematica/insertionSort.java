package EserciziMatematica;
import java.util.Random;

public class insertionSort {

    public static void main(String[] args){
        //useremo una variabile temporanea per salvare il numero che si verra paragonato con il valore che lo precede presente nell'array iniziamo da 1 e non dalla position 0 visto che quella posizione non si paragona con nessuno
        Random rand = new Random(); 
        //random e' una classe gia messa a disposizione da Java
        int[] numbers = new int[10];
        //creiamo un array di numeri casuali tra 0 e 100
        for(int i = 0; i<numbers.length; i++){
            numbers[i]= rand.nextInt(100);
            //riempiamo l'array con un numero casuale 
        }

       insertionS(numbers);
       printArray(numbers);
    }

    public static void insertionS(int[] inputArray){

        for(int i=1; i<inputArray.length; i++){
            //partendo dalla position 1 (seconda) dell array, e per tutta la lunghezza dell'array; i si sposta di uno
            int currentValue = inputArray[i];
            //variabile temporanea
            int j = i-1;
            //mentre j e' maggiore di 0 quindi non all inizio dell array; e il suo valore e' piu grande del currentValue in esame ossia la posizione di i, j si sposta di uno a destra
            while (j>=0 && inputArray[j]>currentValue){
                inputArray[j+1] = inputArray[j];
                j--;
            }
            inputArray[j+1] = currentValue;
        }
    }

    //funzione per stampare i numeri presenti nell array
    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
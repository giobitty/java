package EserciziMatematica;
public class BubbleSort{
    //bubble sort: coppie di elementi affiancati vengono comparati e riordinati
    /*
     |2|3|6|8|1|4|7|5|  il primo numero verra paragonato al numero seguente fino alla fine dell'array ogni numero preso in analisi verra comparato con il precedente se quello non e' maggiore di se rimarra al suo posto
     */
    public static void main(String[] args){
        int array[]={9,4,6,2,3,7,8,0,1,5};
        bubbleSort(array);

        //stampiamo ogni numero nella posizione corretta
        for(int i : array){
            System.out.print(i);
        }
    }

    public static void bubbleSort(int array[]){
        for(int i = 0; i<array.length-1;i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
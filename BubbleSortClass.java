//import java.io.*

public class BubbleSortClass {
    public static void main(String[] args){


        int arr[] = {64, 23, 32, 25, 12, 22, 11, 90, 5};

        int n = arr.length;
        bubbleSort(arr, n);
        printTheArr(arr, n);

    }

    @SuppressWarnings("unused")
    static void bubbleSort(int arr[], int n){
        int i, j, temp;

        boolean swapped;
        for (i = 0; i<n-1; i++){
            swapped=false;
            for (j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){

                    //swap arr[j] with arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }

                
            }
            // if two items were swapped by inner loop, then break

            if (swapped == false){
            break;
            }else{
                continue;
            }
        }
        }

        //method to print an array

        static void printTheArr(int arr[], int size){
            int i;
            for (i=0; i<size; i++){
                System.out.print(arr[i] + " ");
                //System.out.println();
            }


            
        
    }

}

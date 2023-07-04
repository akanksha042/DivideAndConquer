public class QuickSort {
    public static void Print(int arr[]){
        for(int i=0 ; i<arr.length; i++){{
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        }
    }
    public static void quickSrt(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        //last element
        int PivotIndex = partition(arr, si, ei);
        quickSrt(arr, si, PivotIndex-1); //left
        quickSrt(arr, PivotIndex+1, ei);  //right

    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1 ; //to make place for those elements which are smaller than pivot

        for(int j=si ; j<ei ; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        //abhi pivot ko sahi place pr dalne ke liye
        //last time swap hoga
        i++;
        int temp = pivot;
        //make sure you don't do pivot = arr[i]
        //cause pivot is a variable and we want index
        //and we know pivot is at arr[ei]
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;



    }



    public static void main(String args[]){
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSrt(arr, 0, arr.length-1);
        Print(arr);
    }
    
}

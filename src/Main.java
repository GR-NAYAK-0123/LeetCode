//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void selection(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
           int minIdx = i;
           int j = i+1;
           while(j<arr.length){
               if(arr[j] < arr[minIdx]){
                   minIdx = j;
               }
               j++;
           }
           //Swapping
            int temp = arr[i];
           arr[i] = arr[minIdx];
           arr[minIdx] = temp;
        }
    }
    public static void bubble(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void insertion(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid + 1;
        int[] aux = new int[(end-start)+1];
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                aux[k++] = arr[i++];
            }
            else{
                aux[k++] = arr[j++];
            }
        }

        while (i <= mid){
            aux[k++] = arr[i++];
        }

        while (j <= end){
            aux[k++] = arr[j++];
        }


        for(int l = start;l<=end;l++){
            arr[l] = aux[l - start];
        }
    }
    public static void divide(int[] arr, int start, int end){
        if(start >= end) return;

        // Calculate the mid
        int mid = start + (end - start) / 2;

        divide(arr, start, mid);
        divide(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    public static int findPivotIndex(int[] arr, int start, int end){
        int i = start;
        int j = end;
        int pivot = arr[start];
        while(i < j){
            while(arr[i] <= pivot && i < end){
                i++;
            }
            while(arr[j] > pivot && j > start){
                j--;
            }
            if(i < j){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap with pivot element
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void quick(int[] arr, int start, int end){
        if(start >= end) return;

        int pivotIndex = findPivotIndex(arr, start, end);
        quick(arr, start, pivotIndex-1);
        quick(arr, pivotIndex+1, end);
    }
    public static void recursive_Bubble(int[] arr, int n){
        // Base Condition
        if(n == 1) return;

        int count = 0;
        for(int i = 0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                // swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++;
            }
        }
        if(count == 0) return;

        recursive_Bubble(arr, n-1);
    }
    public static void recursive_insertion(int[] arr, int start){
        // Base Case
        if(start == arr.length) return;

        int i = start;
        while(i > 0 && arr[i] < arr[i-1]){
            //swap
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            i--;
        }

        //Calling next function
        recursive_insertion(arr, start+1);
    }
    public static void recursive_selection(int[] arr, int start){
        if(start == arr.length-1) return;

        int minIdx = start;
        for(int i = start + 1;i<arr.length;i++){
            if(arr[i] < arr[minIdx]) minIdx = i;
        }

        // Swap the starting index with minimum value index
        int temp = arr[start];
        arr[start] = arr[minIdx];
        arr[minIdx] = temp;

        // Call for next function
        recursive_selection(arr, start+1);
    }
    public static void main(String[] args) {
        System.out.println("LeetCode");

        int[] arr = new int[] {20,42,23,19,1,5,56,1,45,67,0,1,4};
        System.out.println("Before sorting");
        for(int value : arr){
            System.out.print(value+" ");
        }
        System.out.println();

        //selection(arr);
        //bubble(arr);
        //insertion(arr);
        //divide(arr, 0, arr.length-1);
        //quick(arr, 0, arr.length-1);
        //recursive_Bubble(arr, arr.length);
        //recursive_insertion(arr, 0);
        recursive_selection(arr, 0);

        System.out.println("After sorting");
        for(int value : arr){
            System.out.print(value+" ");
        }
    }
}
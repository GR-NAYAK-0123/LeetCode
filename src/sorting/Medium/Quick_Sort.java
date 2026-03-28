// Sorting: Quick Sort
// Time: O(n * log(n))
// Space: O(1)

package sorting.Medium;

public class Quick_Sort {
    public int findPivotIndex(int[] arr, int start, int end){
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
    public void quick(int[] arr, int start, int end){
        if(start >= end) return;

        int pivotIndex = findPivotIndex(arr, start, end);
        quick(arr, start, pivotIndex-1);
        quick(arr, pivotIndex+1, end);
    }
}

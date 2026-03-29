// Sorting: Selection Sort
// Time: O(n*2)
// Space: O(1)

package sorting.Easy;

public class Selection_Sort {
    // It means find the minimum value and swap with first value
    public void selectionSort(int[] arr){
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

    // This is recursive Selection sort
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
}

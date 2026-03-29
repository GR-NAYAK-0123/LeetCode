// Sorting: Bubble Sort
// Time: O(n*2) but In Best case the time complexity is O(n)
// Space: O(1)

package sorting.Easy;

public class Bubble_Sort {
    // Here we just have to swap with near value if the current value is greater that next value
    public void bubble(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int countSwap = 0;
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    countSwap++;
                }
            }
            // For Optimization
            if(countSwap == 0) break;
        }
    }

    // This is Recursive Bubble Sort with best Approach
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
}

// Sorting: Insertion Sort
// Time: O(n*2) but In Best case the time complexity is O(n)
// Space: O(1)

package sorting.Easy;

public class Insertion_Sort {
    public static void insertion(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                // Swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
}

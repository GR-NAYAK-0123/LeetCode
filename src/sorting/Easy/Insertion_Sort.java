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

    //This is recursive Insertion Sort which having same time and space complexity but here we are using O(n) stack memory because of recursion
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
}

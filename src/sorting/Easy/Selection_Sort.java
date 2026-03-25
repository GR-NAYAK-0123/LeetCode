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
}

// Sorting: Merge Sort
// Time: O(n * log(n))
// Space: O(n)  [For that temporary array]

package sorting.Medium;

public class Merge_Sort {
    public void merge(int[] arr, int start, int mid, int end){
        int left = start;
        int right = mid+1;

        // Taking the temporary array
        int[] temp = new int[(end-start) + 1];
        int k = 0;

        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }
            else{
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid){
            temp[k++] = arr[left++];
        }

        while (right <= end){
            temp[k++] = arr[right++];
        }

        // Copying all the values from temp array to original array
        for(int i = start; i<= end;i++){
            arr[i] = temp[i - start];
        }
    }
    public void mergeSort(int[] arr, int start, int end){
        if(start == end) return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
}

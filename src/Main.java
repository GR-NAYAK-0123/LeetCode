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
    public static void main(String[] args) {
        System.out.println("LeetCode");

        int[] arr = new int[] {20,42,23,19,7,80,3,12,45,12,67,34,1};
        System.out.println("Before sorting");
        for(int value : arr){
            System.out.print(value+" ");
        }
        System.out.println();

        selection(arr);

        System.out.println("After sorting");
        for(int value : arr){
            System.out.print(value+" ");
        }
    }
}
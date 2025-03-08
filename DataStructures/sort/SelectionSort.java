package DataStructures.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3,5,1,4,2,8}; 
        int n = nums.length; 
        int temp; 
        int minIndex; 
        System.out.println("Before Sorting: "); 
        for(int num : nums) {
            System.out.print(num + " ");
        }
          for(int i = 0; i < nums.length -1; i++) {
            minIndex = i ;
            for(int j = i+1; j < nums.length; j++) {
               if(nums[j] < nums[minIndex]){
                  minIndex = j ;
               }
            }
            temp = nums[minIndex]; 
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        System.out.println("After Sorting: "); 
        for(int num : nums) {
            System.out.print(num + " ");
        }
}
}
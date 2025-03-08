package DataStructures.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {3,5,1,4,2,8}; 
        int n = nums.length;
        for(int i =1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        for(int num : nums){
            System.out.print(num+ " ");
        }
    }
}

// 75. Sort Color

class Solution {
    public void sortColors(int[] nums) {
        int zeroPointer = 0;
        int twoPointer = nums.length-1;
        int i = 0;

        while(i <= twoPointer){
            if(nums[i]  == 0){
                swap(nums,i,zeroPointer);
                i++;
                zeroPointer++;
            }
            else if(nums[i] == 2){
                swap(nums,i,twoPointer);
                twoPointer--;
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int nums[], int num1, int num2){

        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}

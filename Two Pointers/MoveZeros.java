public class MoveZeros {
    public void moveZeroes(int[] nums) {


        int left = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }

    }
}


/*
nums = [2,0,4,0,9]

Two pointer approach
left is to keep track of actual non zero element
right is to keep track of the moving index

initiate both with 0
if nums[right] is not zero then nums[left] = nums[right];
increment both index
else 
right++;


*/
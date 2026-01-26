public class Solution {
    public Integer maxSum(int[] nums, Integer k) {

        
        int left = 0;
        int currSum = 0, maxSum = 0;

        for(int right = 0; right < nums.length; right++) {

            currSum += nums[right];

            if((right - left + 1) == k) {
                maxSum = Math.max(currSum, maxSum);
                currSum -= nums[left++];
            }
        }

        return maxSum;

    }

}


/*
left and right pointer
while left < right && right < length-1:
    add to currentSum
    if(right - left + 1 == k) {
        compute maxsum 
        increment left
    }

*/
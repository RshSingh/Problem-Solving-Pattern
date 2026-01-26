public class MaxSumDistinctSubArray {
    public Long maxSum(int[] nums, Integer k) {
        // Your code goes here

        int left = 0;
        Long currSum = 0L;
        Long maxSum = 0L;
        Set<Integer> set = new HashSet<>();

        for(int right = 0; right < nums.length; right++) {
            if(set.contains(nums[right])) {
                while(set.contains(nums[right])) {
                    currSum -= nums[left];
                    set.remove(nums[left++]);
                }
            }
            currSum += nums[right];
            set.add(nums[right]);
            if(right - left + 1 == k) {
                    maxSum = Math.max(currSum, maxSum);
                    set.remove(nums[left]);
                    currSum -= nums[left++];
            }
        }

        return maxSum;
    }
}

/*
two pointer
one left and next right 
set
iterate through nums
check if the elements is in set
if yes then remove element from set and moving left
Also subtract from currSum
if size of left and right is greater or equal then move left
add to set
keep track of currSum
update maxSum

*/
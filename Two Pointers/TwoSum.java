
public class TwoSum {
    public Boolean twoSum(int[] nums, Integer target) {

    	int left = 0;
    	int right = nums.length - 1;

    	while(left < right) {
    		int sum = nums[left] + nums[right];
    		if(sum == target) return true;

    		if(sum > target) {
    			right--;
    		} else {
    		left++;
    		}
    	}

    	return false;

    }

 }

 /*

two pointer approach
left and right index
while left < right
if nums[left] + nums[right] == target return True
nums[left]+ nums[right] > target
right--
else 
left++
 */
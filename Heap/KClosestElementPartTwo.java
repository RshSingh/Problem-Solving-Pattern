public class kClosestElementPartTwo {
    public List<Integer> kClosest(int[] nums, Integer k, Integer target) {
        // Your code goes here

        int low = 0, high = nums.length-k;

        while(low < high) {
            int mid = (low + high)/2;

            if(target - nums[mid] > nums[mid+k] - target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = low; i < low + k; i++) {
            result.add(nums[i]);
        }

        return result;
    }
}


/*
Using binary to find the left index of the element
if target - nums[mid] > nums[mid+k] - target 
low = mid + 1 else high = mid

Add result to the list
starting from low to low + k
*/
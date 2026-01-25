public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // Your code goes here

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {

            if( i != 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[right] == nums[right-1]) {
                        right--;
                    }
                }

                if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}

/*

First sort the array
Loop through it
if first element is not zero and last element is equal to current then skip

left start from index + 1
while left < right
 similar comparison as above for left
 check is nums[i] + nums[left] + nums[right] == 0 then add it to the result
 move right to left if same

*/
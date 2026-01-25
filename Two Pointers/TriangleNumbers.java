public class TriangleNumbers {
    public Integer triangleNumber(int[] heights) {


        Arrays.sort(heights); //4, 6, 9, 11, 15, 18
        List<List<Integer>> result = new ArrayList<>();
        if(heights.length == 2) return 0;
        int count = 0;

        for(int i = heights.length - 1; i > 1; i--) {

            int left = 0; 
            int right = i - 1;

            while(left < right) {
                int sum = heights[left] + heights[right];
                if(sum > heights[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }

            }
        }

        return count;
    }

}



/*


Sort the heights array
Iterate thorugh each element from end
left starts from 0
right starts from index - 1
while(left < right)
if nums[left] + nums[right] > nums[i] then increment the count by lenth between left and right
right--;
else 
left++;

*/
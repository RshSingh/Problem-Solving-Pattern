public class TrappingRainWater {
    public Integer trappingWater(int[] height) {

        if(height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int leftMax = height[0], rightMax = height[right];
        int count = 0;

        while(left < right) {
            if(leftMax < rightMax) {

                left++;
                if(height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    count += leftMax - height[left];
                }
            } else {
                right--;
                if(height[right] > rightMax) {
                    rightMax = height[right];
                } else  {
                    count += rightMax - height[right];
                }
            }
        }

        return count;

    }
}


/*

Two pointer approach
left and right pointer
leftMax and rightMax
while left < right
if leftMax < rightMax
 left++;
 if height{left} > leftMax: update leftMax
 else add diff between leftMax and height[left] to count

else:
 right--;
 if height[right] > rightMax: update rightMax
 else add diff between rightMax and height[right] to count


*/

public class ContainerWithMostWater {
	public Integer max_area(int[] heights) {

		if(heights.length == 0) return 0;

		int left = 0;
		int right = heights.length - 1;
		int maxValue = 0;


		while(left < right) {
			int val = (right - left) * Math.min(heights[right],heights[left]);
			maxValue = Math.max(maxValue, val);

			if(heights[left] < heights[right]) {
				left++;
			} else {
				right--;
			}

		}

		return maxValue;
	}
}


/*
Start with two pointer approach
First pointer at the first index
Next  pointer at the last index

loop through until left < right index
Find the container value by 
finding the difference between left and right index 
and mullypying with min height of left and right index

Move left index if height of left  index is small
or right otherwise

*/
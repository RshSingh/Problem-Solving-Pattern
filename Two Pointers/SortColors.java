public class SortColors {
    public void sortColors(int[] nums) {

        int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

    }


    public swap(int[] nums, int left, int right) {
        int swap = nums[left];
        nums[left] = nums[right];
        nums[right] = swap;
    }

}



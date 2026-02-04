public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Your code goes here
        List<List<Integer>> result = new ArrayList<>();

        dfs(result, new ArrayList<>(), 0, nums);
        return result;
    }


    public void dfs(List<List<Integer>> result, List<Integer> currList, int index, int[] nums) {

        result.add(new ArrayList<>(currList));

        for(int i = index; i < nums.length; i++) {
            currList.add(nums[i]);
            dfs(result, currList, i+1, nums);
            currList.remove(currList.size()-1);
        }
    }
}


/*
backtracking

currentlist, nums, index, new list of list

add currentlist to list
iterate through nums from index to end of list
add index value to list
increment count of index and call the function again
remove this index value from the list


--removing from list based on size

*/
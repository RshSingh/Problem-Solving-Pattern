public class Solution {
    public Integer kthLargest(int[] nums, Integer k) {
        // Your code goes here
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> a-b);

        for(int num: nums) {
            pq.add(num);
            if(pq.size() > k) {
                pq.poll();
            }
        }

        return pq.poll();
    }
}
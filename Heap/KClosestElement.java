public class kClosestElment {
    public List<Integer> kClosest(int[] nums, Integer k, Integer target) {
        // Your code goes here

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> {
            int diff = Math.abs(b - target) - Math.abs(a - target);
            if(diff != 0) return diff;
            return b-a;
        
        });

        for(int num: nums) {
            maxHeap.offer(num);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>(maxHeap);
        Collections.sort(result);
        return result;
    }
}


/*
PriorityQueue maxHeap
Add items to pq 
if size greater than k then remove
Sort the result

--Math.abs for distance
--Finding diff inside pq
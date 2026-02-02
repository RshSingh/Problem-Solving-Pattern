class kClosestPoint {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> (b[0]*b[0] +b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));

        
        for(int[] point: points) {
            pq.add(point);
            if(pq.size() > k) {
                pq.remove();
            }
        }

        int[][] result = new int[k][2];
        int i = k-1;
        while(!pq.isEmpty()) {
            result[i--] = pq.remove();
        }

        return result;
    }
}


/*
Create a priorityqueue in descending order based on distance
Iterate through each points
Add to the queue
if size grreater than k then remove from the queue

Add points from queue to the final result

-- braces
*/

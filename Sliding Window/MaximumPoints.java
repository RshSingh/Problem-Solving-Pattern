class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(cardPoints.length == 0) return 0;
        int n = cardPoints.length;

        int sum = 0;
        for(int p: cardPoints) {
            sum += p;
        }

        int minSize = n-k;
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;

        for(int i = 0; i < cardPoints.length; i++) {
            currSum += cardPoints[i];

            if(i >= minSize) {
                currSum -= cardPoints[i-minSize];
            }

            if( i >= (minSize - 1)) {
                minSum = Math.min(minSum, currSum);
            }
        }

        return sum - minSum;
    }


    public int maxScore1(int[] cardPoints, int k) {
        if(cardPoints.length == 0) return 0;
        int n = cardPoints.length;

        int sum = 0;
        for(int p: cardPoints) {
            sum += p;
        }

        int minSum = 0;
        int currSum = 0;
        int start = 0;

        for(int i = 0; i < cardPoints.length; i++) {
            currSum += cardPoints[i];

            if(i - start + 1 == n - k) {
                minSum = Math.max(sum - currSum, minSum);
                currSum -= cardPoints[start++];
            }
            
        }

        return minSum;
    }
}


/*
Approach find the minSum over size n - k
iterate thorugh points and find the total sum
iterate through points
update minSum
return sum - minSum


*/
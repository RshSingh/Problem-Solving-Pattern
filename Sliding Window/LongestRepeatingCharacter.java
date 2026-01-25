public class LongestRepeatingCharacter {
public Integer characterReplacement(String s, Integer k) {
        // Your code goes here

        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0, maxFreq = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));

            while((i - left + 1) - maxFreq > k) {
                char  c = s.charAt(left);
                map.put(c, map.get(c) - 1);
                left++;
            }

            max = Math.max(max, i - left + 1);   
        }

        return max;

    }
}


/*

s = "BBABCCDD"
k = 2


Map of character and count
int left = 0

Iterate through each chars
Add chars to map and increment the count
if the size is equal to k + 1 then update the max
also while loop until map size is not equals to k +1 by incrementing left

*/
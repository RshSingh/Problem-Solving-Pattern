public class Solution {
    public Integer longestSubstringWithoutRepeat(String s) {

        int left = 0;
        Set<Character> set = new HashSet<>();

        int max = 0;
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if(set.contains(ch)) {

                while(set.contains(ch)) {
                    set.remove(s.charAt(left++));
                }
            }
            set.add(ch);
            max = Math.max(max, i - left+1);
        }

        return max;

    }
}

/*


s = "eghghhgg"

left right -- moving index
Set
Iterate through it
Add to the set

if set contains the char
then while loop of till set does not contains

update max value

*/
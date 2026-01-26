public class Solution {
    public Boolean isValid(String s) {
        // Your code goes here

        Map<Character, Character> map = new HashMap<>();

        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(map.containsKey(ch)) {
                if(stack.isEmpty()) {
                    return false;
                } 

                char c = stack.pop();
                if(map.get(ch) != c) return false;
            } else {
                stack.push(ch);
            }
        }

        return stack.size() == 0 ? true: false;
    }
}


/*
map of closing to opening braces

iterate through each characters
if stack is empty and closing found then return false
otherwise check if stack contains the map of closing bracess if not false

if stack size is 0 then return true else false

*/
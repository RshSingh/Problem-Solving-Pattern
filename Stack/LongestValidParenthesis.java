public class LongestValidParenthesis {
    public Integer longest_valid_parentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxLen = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if(stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        } 

        return maxLen;

    }
}


/*

Initialize stack by pushing -1
Iterate through each characters
if found "(" then add it to stack
else 
    remove from stack
    if stack is empty then initialize new  staring point of ith index
    else update maxLen with i - stack.peek()

*/
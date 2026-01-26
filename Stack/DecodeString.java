public class DecodeString {
    public String decodeString(String s) {
        // Your code goes here
        Stack<String> stack = new Stack<>();
        Stack<Integer> stackNum = new Stack<>();

        String currString = "";
        Integer currNum = 0;
        for(char ch: s.toCharArray()) {
            if(ch == '[') {
                stack.push(currString);
                stackNum.push(currNum);
                currString = "";
                currNum = 0;
            } else if(ch == ']') {
                
                int num = stackNum.pop();
                String str = stack.pop();

                currString = str + currString.repeat(num);
            } else if (Character.isDigit(ch)){
                currNum = currNum * 10 + (ch - '0');
            } else {
                currString += ch;
            }
        }

        return currString;
    }
}


/*
Stack of string and number
currNum and currString

Iterate through each character
if found [ then
    push string and num to stack and initialize to empty and 0
if found number then
    add character to currNum
if found character then add it to currString
if found ] then
    pop the number and string from stack
    then add it to string with repeat characters


*/
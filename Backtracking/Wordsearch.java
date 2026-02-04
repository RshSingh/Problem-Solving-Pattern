public class Solution {
    boolean found = false;
    public Boolean exist(Character[][] board, String word) {
        // Your code goes here

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    dfs(board, i, j, word, 0);
                    if(found) return true;
                }
            }
        }

        return false;
    }


    public void dfs(Character[][] board, int i, int j, String word, int index) {
        if(index == word.length()) {
            found = true; 
            return;
        }

        if(i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != word.charAt(index)) return;

        char temp = board[i][j];
        board[i][j] = '*';
        dfs(board, i+1, j, word, index+1);
        dfs(board, i-1, j, word, index+1);
        dfs(board, i, j+1, word, index+1);
        dfs(board, i, j-1, word, index+1);

        board[i][j] = temp;
    }
}


/*
Iterate through each character
if first character of word found then apply dfs search

if index is equal to word length then return true
if index of word is not equal to board x,y then return false
store char value in some temp
update it to *
then call horizontal and vertical
update it back to temp

*/


/*
public class Solution {
    boolean found = false;
    public Boolean exist(Character[][] board, String word) {
        // Your code goes here

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    
                    if(dfs(board, i, j, word, 0)) return true;
                }
            }
        }

        return false;
    }


    public boolean dfs(Character[][] board, int i, int j, String word, int index) {
        if(index == word.length()) {
            found = true; 
            return true;
        }

        if(i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != word.charAt(index)) return false;

        char temp = board[i][j];
        board[i][j] = '*';
        boolean ifPresent = dfs(board, i+1, j, word, index+1) || dfs(board, i-1, j, word, index+1) || dfs(board, i, j+1, word, index+1) || dfs(board, i, j-1, word, index+1);

        board[i][j] = temp;

        return ifPresent;
    }
}


/*
Iterate through each character
if first character of word found then apply dfs search

if index is equal to word length then return true
if index of word is not equal to board x,y then return false
store char value in some temp
update it to *
then call horizontal and vertical
update it back to temp

*/
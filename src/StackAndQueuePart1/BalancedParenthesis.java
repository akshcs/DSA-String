package StackAndQueuePart1;

import java.util.Stack;

public class BalancedParenthesis {
    public static boolean isValid(String s) {
        int n = s.length();
        Stack<Character> parenthesis = new Stack<>();
        for(int i=0;i<n;i++){
            updateStack(s.charAt(i), parenthesis);
        }
        return parenthesis.isEmpty();
    }

    public static void updateStack(char ch, Stack<Character> parenthesis){
        if(ch == '(' || ch == '{' || ch == '['){
            handleOpenParenthesis(ch, parenthesis);
        } else if(ch == ')' || ch == '}' || ch == ']'){
            handleClosedParenthesis(ch, parenthesis);
        }
    }

    public static void handleOpenParenthesis(char ch, Stack<Character> parenthesis){
        parenthesis.push(ch);
    }

    public static void handleClosedParenthesis(char ch, Stack<Character> parenthesis){
        if(!parenthesis.isEmpty() && hasSameParenthesisOnTop(ch, parenthesis)){
            parenthesis.pop();
        } else {
            parenthesis.push(ch);
        }
    }

    public static boolean hasSameParenthesisOnTop(char ch, Stack<Character> parenthesis){
        if(ch==')'){
            return parenthesis.peek() == '(';
        }
        else if(ch=='}'){
            return parenthesis.peek() == '{';
        }
        else if(ch==']'){
            return parenthesis.peek() == '[';
        }
        return false;
    }
}

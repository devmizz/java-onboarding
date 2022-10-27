package onboarding;

import java.util.Stack;

public class Problem2 {
    public static String solution(String cryptogram) {
        Stack<Character> stack = new Stack();
        char temp;

        for(int i = 0; i < cryptogram.length(); i++) {
            if(stack.isEmpty()) {
                stack.add(cryptogram.charAt(i));
                continue;
            }

            temp = stack.peek();

            if(temp == cryptogram.charAt(i)) {
                stack.pop();
                continue;
            }

            stack.add(cryptogram.charAt(i));
        }

        return answer;
    }
}

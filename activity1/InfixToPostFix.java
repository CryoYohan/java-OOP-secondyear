package activity1;
import java.util.Stack;

public class InfixToPostFix {
	static String infixExpression = "3 + 4 * 2 / (1 - 5)";
	   public static void main(String[] args) {
	        String postfixExpression = infixToPostfix(infixExpression);
	        System.out.println("Infix Expression: " + infixExpression);
	        System.out.println("Postfix Expression: " + postfixExpression);
	    }
    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : infixExpression.toCharArray()) {
            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Pop and discard the '('
            } else {
                // Operator encountered
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return 0; // Default precedence for other characters (operands, parentheses)
    }

 
}


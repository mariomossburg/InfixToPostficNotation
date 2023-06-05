package queueAndStack;

import java.util.Scanner;

public class InfixNotationToPostfix {
    public StackForArray<Character> stack;

    public InfixNotationToPostfix() {
        stack = new StackForArray<>();
    }

    public static boolean isOperator(char c) {
        return c == '*' || c == '/' || c == '+' || c == '-';
    }

    public static int getPriority(char operator) {
        switch (operator) {
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    public static String convertToPostfix(String infix) {

        StackForArray<Character> s = new StackForArray<>();
        StringBuilder postfix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                s.push(c);
            } else if (c == ')') {
                while (s.peek() != '(') {
                    postfix.append(s.pop());
                }
                s.pop();
            } else if (isOperator(c)) {
                while (!s.isEmpty() && getPriority(c) <= getPriority(s.peek())) {
                    postfix.append(s.pop());
                }
                s.push(c);
            }
        }
        while (!s.isEmpty()) {
            postfix.append(s.pop());

        }
        return postfix.toString();
    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter infix notation: ");
        String userInfix = sc.nextLine();
        //convertToPostfix(userInfix);
        System.out.println("Postfix notation: " + convertToPostfix(userInfix));
    }
}//end class

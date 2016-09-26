package com.example.pasha_000.mycalculator;

import java.util.Stack;
public class Validator {




    private boolean parenthesisValidator(String exp) {
        Stack<Character> parenthesisStack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(') {
                parenthesisStack.push('(');
            }
            if (exp.charAt(i) == ')') {
                if (parenthesisStack.isEmpty()) {
                    return false;
                }
                parenthesisStack.pop();
            }
        }
        return parenthesisStack.isEmpty();
    }

    public boolean checkErrors(String exp) {

        if (!parenthesisValidator(exp)) {

            return true;
        }
        return false;
    }

}
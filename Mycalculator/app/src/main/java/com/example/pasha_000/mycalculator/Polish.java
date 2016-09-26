package com.example.pasha_000.mycalculator;

import java.util.Stack;
public class Polish {
        public static Double calculateExp(String exp) {
            Stack<Double> stack = new Stack<>();
            for (String token : exp.split(" ")){
                System.out.println(token);
            }
            for (String token : exp.split(" ")) {
                Double numb = null;
                try {
                    numb = Double.parseDouble(token);
                } catch (NumberFormatException e) {
                }

                if (numb != null) {
                    stack.push(Double.parseDouble(token));
                } else if (token.equals("^")) {
                    double op2 = stack.pop();
                    double op1 = stack.pop();
                    stack.push(Math.pow(op1, op2));
                } else if (token.equals("*")) {
                    double op2 = stack.pop();
                    double op1 = stack.pop();
                    stack.push(op1 * op2);
                } else if (token.equals("/")) {
                    double op2 = stack.pop();
                    double op1 = stack.pop();
                    stack.push(op1 / op2);
                } else if (token.equals("+")) {
                    double op2 = stack.pop();
                    double op1 = stack.pop();
                    stack.push(op1 + op2);
                } else if (token.equals("-")) {
                    double op2 = stack.pop();
                    double op1 = stack.pop();
                    stack.push(op1 - op2);
                }
            }
            return stack.pop();
        }
    }


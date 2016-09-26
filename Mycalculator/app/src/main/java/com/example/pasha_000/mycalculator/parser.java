package com.example.pasha_000.mycalculator;
public class parser {
    public static String splitExpression(String exp) {
        String splittedExp = "";
        String str = "";
        for (int i = 0; i < exp.length(); i++) {

                if (Character.isDigit(exp.charAt(i)) || exp.charAt(i) == '.') {
                    splittedExp += exp.charAt(i);

                }
                else {
                    if(!str.equals("")) {
                        splittedExp += " " + str + " ";
                        str = "";
                    }
                    splittedExp += " ";
                    str = String.valueOf(exp.charAt(i));
                }
        }
        return splittedExp.trim();
    }

}

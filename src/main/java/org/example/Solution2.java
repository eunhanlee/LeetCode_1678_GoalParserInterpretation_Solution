package org.example;

public class Solution2 {
    /**
     * Interprets the given command string and returns the interpreted result.
     *
     * @param command the command string to be interpreted
     * @return the interpreted result as a string
     */
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                str.append("G");
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                str.append("o");
                i = i + 2;
            } else {
                str.append("al");
                i = i + 4;
            }
        }
        return str.toString();
    }
}
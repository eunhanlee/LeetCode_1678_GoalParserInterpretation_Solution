package org.example;

public class Solution {
    /**
     * Interprets the given command string and returns the interpreted result.
     *
     * @param command the command string to be interpreted
     * @return the interpreted result
     */
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}

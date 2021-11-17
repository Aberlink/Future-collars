package task_51;

import java.util.Locale;

public class TextCheck {

    String textGiven;

    public TextCheck(String textGiven) {
        this.textGiven = textGiven;
    }

    boolean isTextNotEmpty(){
        if (!this.textGiven.isEmpty() && this.textGiven !=null) {
            return true;
        }
        else {
            return false;
        }
    }

    int textLengthCheck(){
        if (isTextNotEmpty() == true) {
            return this.textGiven.length();
        }
        else {
            return 0;
        }
    }

    boolean isPalindrome() {
        if (isTextNotEmpty() == true) {
            String whitespacesRemoved = this.textGiven.replaceAll("\\s+","").toLowerCase(Locale.ROOT);
            int length = whitespacesRemoved.length();
            int forward = 0;
            int backward = length - 1;
            while (backward >= forward) {
                char forwardChar = whitespacesRemoved.charAt(forward++);
                char backwardChar = whitespacesRemoved.charAt(backward--);
                if (forwardChar != backwardChar) {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

}

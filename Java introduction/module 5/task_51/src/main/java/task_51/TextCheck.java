package task_51;

import java.util.Locale;

public class TextCheck {

    public TextCheck() {
    }


    boolean isTextNotEmpty(String textGiven){
        return (textGiven !=null && !textGiven.isEmpty()) ? true : false;
    }

    int textLengthCheck(String textGiven){
        if (isTextNotEmpty(textGiven) == true) {
            return textGiven.length();
        }
        else {
            return 0;
        }
    }

    boolean isPalindrome(String textGiven) {
        if (isTextNotEmpty(textGiven) == true) {
            String whitespacesRemoved = textGiven.replaceAll("\\s+","").toLowerCase(Locale.ROOT);
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

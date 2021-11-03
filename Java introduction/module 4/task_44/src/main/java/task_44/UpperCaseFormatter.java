package task_44;

public class UpperCaseFormatter implements TextFormatter {

    public UpperCaseFormatter() {
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}

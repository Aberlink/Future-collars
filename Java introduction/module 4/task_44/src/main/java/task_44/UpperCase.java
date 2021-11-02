package task_44;

public class UpperCase implements TextFormatter {

    public UpperCase() {
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}

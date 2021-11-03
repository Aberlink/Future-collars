package task_44;

public class LowerCaseFormatter implements TextFormatter{

    public LowerCaseFormatter() {
    }

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}

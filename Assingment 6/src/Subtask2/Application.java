package Subtask2;

public class Application {

    private static Dialog dialog;

    public static void main(String[] args) throws java.io.IOException {

        initializeWindows();
        dialog.DialogRender();

        initializeHTML();
        dialog.DialogRender();
    }

    static void initializeWindows() {
            dialog = new WindowsDialog();
    }

    static void initializeHTML() {
        dialog = new HTMLDialog();
    }
}

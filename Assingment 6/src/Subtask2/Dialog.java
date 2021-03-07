package Subtask2;

public abstract class Dialog {

    public abstract Button createButton();

    public void DialogRender() throws java.io.IOException{
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}




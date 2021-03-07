package Subtask2;


import java.io.IOException;
import java.net.URI;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Button<button>"); //this is unnecessary but decided to keep it for pseudocode
    }

    @Override
    public void onClick() throws IOException {
        System.out.println("onClickFucntion");
        java.awt.Desktop.getDesktop().browse(URI.create("https://rakhabay.github.io/Button/"));
    }
}

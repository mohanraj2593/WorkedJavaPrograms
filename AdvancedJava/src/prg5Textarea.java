import javax.swing.*;
public class prg5Textarea {
    prg5Textarea() {

        JFrame f = new JFrame();
        f.setSize(500, 500);
        JTextArea a = new JTextArea();
        a.setBounds(300, 300, 100, 100);
        f.add(a);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new prg5Textarea();

    }
}

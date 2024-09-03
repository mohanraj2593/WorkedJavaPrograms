import javax.swing.*;
public class prg1SwingDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);
        JButton b = new JButton("My First Web Page");
        b.setBounds(100,100,100,40);
        f.add(b);
        f.setVisible(true);
        f.setLayout(null);


    }
}

import javax.swing.*;
public class prg7JPasswordFField {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(500,500);
        JLabel tf=new JLabel("Password");
        tf.setBounds(50,150,100,30);
        f.add(tf);
        JPasswordField pw= new JPasswordField();
        pw.setBounds(100,150,50,30);
        f.add(pw);
        f.setLayout(null);
        f.setVisible(true);


    }
}

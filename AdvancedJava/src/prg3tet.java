import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class prg3tet extends JFrame{
    prg3tet(){
        JFrame f = new JFrame();
        f.setSize(500,500);
        JButton b= new JButton("CLICK");
        b.setBounds(200,200,100,150);
        JTextField tf = new JTextField();
        tf.setBounds(200,200,100,200);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome toMy Web Page");
            }
        });
        f.add(tf);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new prg3tet();

    }
}

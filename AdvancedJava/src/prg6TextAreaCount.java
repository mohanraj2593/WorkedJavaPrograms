import javax.swing.*;
import java.awt.event.*;
public class prg6TextAreaCount implements ActionListener {
    JLabel l1,l2;
    JTextArea ta;
    JButton b;
    prg6TextAreaCount(){
        JFrame f=new JFrame();
        f.setSize(500,500);
        l1 = new JLabel();
        l2 = new JLabel();
        l1.setBounds(50,25,100,30);
        l2.setBounds(160,25,100,30);
        ta=new JTextArea();
        ta.setBounds(20,75,250,200);
        b =new JButton("Count Words");
        b.setBounds(100,300,120,30);
        b.addActionListener(this);
        f.add(l1);
        f.add(l2);
        f.add(ta);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String text=ta.getText();

        String words[]=text.split("\\s");
        l1.setText("Words:"+words.length);
        l2.setText("Character"+text.length());


    }
    public static void main(String[] args) {
        new prg6TextAreaCount();

    }
}

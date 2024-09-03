import javax.swing.*;
public class prg2con extends JFrame{
    prg2con(){
        JFrame f=new JFrame();
        f.setSize(500,500);
        JButton b=new JButton("CLICK");
        b.setBounds(200,200,200,100);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("MY FIRST WEB PAGE");


    }
    public static void main(String[] args) {
        new prg2con();

    }
}

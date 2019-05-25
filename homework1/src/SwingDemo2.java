import javax.swing.*;
import java.awt.*;

public class SwingDemo2{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("LOL");

        jFrame.setSize(400,300);
        jFrame.setLocation(200,200);
        jFrame.setLayout(null);

        JButton jButton = new JButton("hello");
        jButton.setBounds(100,100,200,30);
        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }
}

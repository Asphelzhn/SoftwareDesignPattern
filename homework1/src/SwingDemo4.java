import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("lol");
        f.setSize(1500, 1000);
        f.setLocation(600, 400);
        f.setLayout(null);

        final JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\56871\\IdeaProjects\\SA\\1.jgp");
        jLabel.setIcon(imageIcon);
        jLabel.setBounds(250, 50, imageIcon.getIconWidth(), imageIcon.getIconHeight());
        System.out.println(imageIcon.getIconWidth());

        JButton button = new JButton("隐藏");
        button.setBounds(250, 800, 100, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setVisible(false);
            }
        });
        f.add(jLabel);
        f.add(button);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
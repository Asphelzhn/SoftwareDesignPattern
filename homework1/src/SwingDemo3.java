import javax.swing.*;
import java.awt.*;
import java.io.*;

public class SwingDemo3 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        File file = new File("./location.txt");
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            x = dataInputStream.readInt();
            y = dataInputStream.readInt();
        }catch (IOException e){
            e.printStackTrace();
        }
        JFrame f=new JFrame("LoL");
        f.setLocation(x,y);
        f.setSize(400,300);

        JButton b=new JButton("button");
        b.setBounds(50,140,300,20);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        Thread thread = new Thread(){
            public void run(){
                File file = new File("./location.txt");
                while (true){
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

                        Point location = f.getLocation();
                        System.out.println(location.x+"-----"+location.y);
                        dataOutputStream.writeInt(location.x);
                        dataOutputStream.writeInt(location.y);


                    }catch (IOException e){
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
        };
        thread.start();

    }
}

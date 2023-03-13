import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{
    MainMenu(){

        JLabel imageLabel = new JLabel();
        ImageIcon catImage = new ImageIcon("catVsnake.gif");
        imageLabel.setIcon(catImage);

        JButton startButton = new JButton();
        startButton.setText("Start Game");
        startButton.setFont(new Font("Times New Roman", Font.BOLD, 20));

        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        this.setLayout(new FlowLayout());


        this.add(startButton);
        this.add(imageLabel);
        
        this.setTitle("Snake Game");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(390,354);

        this.setLocationRelativeTo(null);

        this.setVisible(true);

        this.setResizable(false);

        this.getContentPane().setBackground(Color.DARK_GRAY);

    }

    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new ColorMenu();

            dispose();

        }
    }
}

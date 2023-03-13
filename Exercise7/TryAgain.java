import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame{

    TryAgain(){

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("Try Again");
        tryAgainButton.setFont(new Font("Times New Roman", Font.BOLD, 25));

        exitButton.setText("Exit Game");
        exitButton.setFont(new Font("Times New Roman", Font.BOLD, 25));

        this.add(exitButton);
        this.add(tryAgainButton);

        TryAgainHandler handler = new TryAgainHandler();
        tryAgainButton.addActionListener(handler);

        this.setLayout(new FlowLayout());

        ExitHandler handlers = new ExitHandler();
        exitButton.addActionListener(handlers);

        this.setLayout(new FlowLayout());
        
        this.setTitle("Snake Game");
    
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        this.setSize(390,354);
    
        this.setLocationRelativeTo(null);
    
        this.setVisible(true);
    
        this.setResizable(false);
    
        this.getContentPane().setBackground(Color.DARK_GRAY);

    }

    private class TryAgainHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            new MainMenu();
            dispose();
        } 
    }

    private class ExitHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            dispose();
        } 
    }
    
}

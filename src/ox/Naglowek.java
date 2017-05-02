package ox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pawel
 */
@Setter
@Getter
public class Naglowek extends JPanel{

    public Panel1 panel1;
    public Panel2 panel2;
    public Panel3 panel3;
    public Funkcje funkcje;

    JLabel labelNaglowka = new JLabel("KÓŁKO - KRZYŻYK");
    
    public Naglowek(){
    
        setPreferredSize(new Dimension(406, 50));
        //setBackground(Color.red);
        setVisible(true);
        labelNaglowka.setFont(new Font("Serif",Font.BOLD,30));
        add(labelNaglowka);
        
        
    
    }
    
    
}

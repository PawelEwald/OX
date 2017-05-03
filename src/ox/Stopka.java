package ox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
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
public class Stopka extends JPanel{

    public Panel1 panel1;
    public Panel2 panel2;
    public Panel3 panel3;
    public Funkcje funkcje;

    JLabel labelNaglowka = new JLabel("    P.E. v1.0");
    
    public Stopka(){
        setLayout(new GridLayout(1, 1,10,10)); 
        setPreferredSize(new Dimension(406, 20));
        //setBackground(Color.red);
        setVisible(true);
        labelNaglowka.setFont(new Font("Serif",Font.BOLD,10));
        add(labelNaglowka);
    }
}

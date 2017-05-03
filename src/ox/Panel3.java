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
@Getter
@Setter
public class Panel3 extends JPanel implements ActionListener {

    public Panel1 panel1;
    public Panel2 panel2;
    public Naglowek naglowek;
    public Funkcje funkcje;

    JButton exit = new JButton("EXIT");
    JButton odNowa = new JButton("GRAJ DALEJ");
    

    public Panel3() {
        
        setPreferredSize(new Dimension(406, 50));
        //setBackground(Color.blue);
        setVisible(true);

        exit.addActionListener(this);
        exit.setFont(new Font("Serif",Font.CENTER_BASELINE,16));
        exit.setPreferredSize(new Dimension(100, 40));
        add(exit);
        
        odNowa.addActionListener(this);
        odNowa.setFont(new Font("Serif",Font.CENTER_BASELINE,16));
        odNowa.setPreferredSize(new Dimension(140, 40));
        add(odNowa);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object źródło = e.getSource();

        if (źródło == exit) {
            System.exit(0);
        }
        if (źródło == odNowa) {
            funkcje.odNowa(panel1.pomocnicza, panel1.b);
        }
    }
}

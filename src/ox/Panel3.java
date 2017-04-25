package ox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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

    Kolejka kolejka = new Kolejka();
    Funkcje funkcje = new Funkcje();
    JButton exit = new JButton("EXIT");
    JButton odNowa = new JButton("Zagraj jeszcze raz");

    public Panel3() {

        setPreferredSize(new Dimension(200, 200));
        setBackground(Color.blue);
        setVisible(true);

        exit.addActionListener(this);
        add(exit);
        odNowa.addActionListener(this);
        add(odNowa);
    }

    public void odNowa() {
        for (int j = 0; j < 9; j++) {
            panel1.pomocnicza[j] = 9;

//            panel1.b[j].setIcon(new ImageIcon("scr/N.png"));
//            panel1.b[j].setDisabledIcon(new ImageIcon("scr/N.png"));
        }
        kolejka.setIleJeszczeRuchowZostalo(9);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object źródło = e.getSource();

        if (źródło == exit) {
            System.exit(0);
        }
            else if (źródło == odNowa){
            for (int j = 0; j < 9; j++) {
            panel1.pomocnicza[j] = 9;
            panel1.b[j].setIcon(new ImageIcon("scr/N.png"));
            panel1.b[j].setDisabledIcon(new ImageIcon("scr/N.png"));
            panel1.b[j].setEnabled(true);
            }
                
        }
    }
}

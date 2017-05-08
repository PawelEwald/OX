package ox;

import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    public Naglowek naglowek;
    public Funkcje funkcje;
    public Punkty punkty;

    JButton exit = new JButton("EXIT");
    JButton odNowa = new JButton("GRAJ DALEJ");
    JButton resetPkt = new JButton("ZRESETUJ PUNKTY");

    public Panel3() {

        setPreferredSize(new Dimension(406, 50));
        //setBackground(Color.blue);
        setVisible(true);

        exit.addActionListener(this);
        exit.setFont(new Font("Serif", Font.CENTER_BASELINE, 14));
        exit.setPreferredSize(new Dimension(80, 40));
        add(exit);

        odNowa.addActionListener(this);
        odNowa.setFont(new Font("Serif", Font.CENTER_BASELINE, 14));
        odNowa.setPreferredSize(new Dimension(120, 40));
        add(odNowa);

        resetPkt.addActionListener(this);
        resetPkt.setFont(new Font("Serif", Font.CENTER_BASELINE, 14));
        resetPkt.setPreferredSize(new Dimension(160, 40));
        add(resetPkt);
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

        if (źródło == resetPkt) {
            funkcje.resetPkt(this);

        }
    }
}

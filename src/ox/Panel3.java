package ox;

import java.awt.Color;
import java.awt.Dimension;
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
    public Panel4 panel4;
    public Funkcje funkcje;

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

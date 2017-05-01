package ox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import lombok.Getter;
import lombok.Setter;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

@Setter
@Getter
public class Panel2 extends JPanel implements ActionListener {

    public Panel1 panel1;
    public Panel3 panel3;
    public Panel4 panel4;
    public Funkcje funkcje;
    public Taktyka taktyka;
           

    public JRadioButton łatwe, średnie, trudne;
    public JLabel l = new JLabel("hello\n");
    JTextField t = new JTextField("a");
    JButton b = new JButton("Change");
    int j = 0;

    public Panel2() {

        setPreferredSize(new Dimension(200, 200));
        setBackground(Color.YELLOW);
        setVisible(true);
        System.out.println("Działa Panel2");

        t.setPreferredSize(new Dimension(100, 20));
        b.addActionListener(this);
        add(l);
        add(t);
        add(b);

        ButtonGroup buttonGroupPoziom = new ButtonGroup();
        //JRadioButton samNaSam = new JRadioButton("Jeden na jednego");
        łatwe = new JRadioButton("Poziom łatwy", true);
        średnie = new JRadioButton("Poziom średni");
        trudne = new JRadioButton("Poziom trudny");
        //buttonGroupPoziom.add(samNaSam);
        buttonGroupPoziom.add(łatwe);
        buttonGroupPoziom.add(średnie);
        buttonGroupPoziom.add(trudne);
        //add(samNaSam);
        add(łatwe);
        add(średnie);
        add(trudne);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object źródło = e.getSource();

        if (źródło == b) {
            j++;
            l.setText(t.getText());
            panel1.l2.setText("Wcisniety " + j + " razy");
        }

    }
}

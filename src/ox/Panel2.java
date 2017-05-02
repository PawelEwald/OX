package ox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import lombok.Getter;
import lombok.Setter;
import javax.swing.JRadioButton;

@Setter
@Getter
public class Panel2 extends JPanel implements ActionListener {

    public Panel1 panel1;
    public Panel3 panel3;
    public Naglowek naglowek;
    public Funkcje funkcje;
    public Taktyka taktyka;

    JLabel opis = new JLabel("Wybierz poziom");
    
    public JRadioButton łatwe, średnie, trudne;
    int j = 0;

    public Panel2() {
        opis.setFont(new Font("Serif", Font.CENTER_BASELINE,16));
        setPreferredSize(new Dimension(120, 100));
        //setBackground(Color.YELLOW);
        setLayout(new GridLayout(4, 1,10,10)); 
        setVisible(true);
        System.out.println("Działa Panel2");

        ButtonGroup buttonGroupPoziom = new ButtonGroup();
        łatwe = new JRadioButton("Poziom łatwy", true);
        średnie = new JRadioButton("Poziom średni");
        trudne = new JRadioButton("Poziom trudny");
        buttonGroupPoziom.add(łatwe);
        buttonGroupPoziom.add(średnie);
        buttonGroupPoziom.add(trudne);
        add(opis);
        add(łatwe);
        add(średnie);
        add(trudne);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object źródło = e.getSource();

    }
}

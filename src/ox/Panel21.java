package ox;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Panel21 extends JPanel implements ActionListener {

    public Panel1 panel1;
    public Panel3 panel3;
    public Naglowek naglowek;
    public Funkcje funkcje;
    public Taktyka taktyka;


    public Panel21() {
        setPreferredSize(new Dimension(120, 30));
        
        JLabel label = new JLabel("POWODZENIA");
        label.setFont(new Font("Serif",Font.CENTER_BASELINE,14));
        add(label);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object źródło = e.getSource();

    }
}

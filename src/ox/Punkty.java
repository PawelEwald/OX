package ox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.AncestorListener;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Punkty extends JPanel implements ActionListener {

    public Panel1 panel1;
    public Panel2 panel2;
    public Panel3 panel3;
    public Naglowek naglowek;
    public Funkcje funkcje = new Funkcje();
    public Taktyka taktyka;
    public JLabel wo,wx,wox;

    public Punkty() {
        JLabel naglowek = new JLabel("PUNKTY");
        //add(naglowek);
        //String w = Integer.toString(funkcje.wygraneO);
        setLayout(new GridLayout(4, 2, 0, 0));
        setPreferredSize(new Dimension(80, 80));
        //setBackground(Color.white);
        setVisible(true);

        ImageIcon imgO = new ImageIcon("scr/Om.png");
        JLabel wynikO = new JLabel(imgO);
        
        add(wynikO);
        
        wo = new JLabel("" + funkcje.wygraneO);
        wo.setFont(new Font("Serif",Font.BOLD,21));
        add(wo);

        ImageIcon imgX = new ImageIcon("scr/Xm.png");
        JLabel wynikX = new JLabel(imgX);
        add(wynikX);

        wx = new JLabel("" + funkcje.wygraneX);
        wx.setFont(new Font("Serif",Font.BOLD,21));
        add(wx);

        ImageIcon imgOX = new ImageIcon("scr/OXm.png");
        JLabel wynikOX = new JLabel(imgOX);
        add(wynikOX);

        wox = new JLabel("" + funkcje.remis);
        wox.setFont(new Font("Serif",Font.BOLD,21));
        add(wox);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object źródło = e.getSource();

    }
}

package ox;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ewald
 */
@Setter
@Getter

public class Panel1 extends JPanel implements ActionListener {

    String tekst = "hello man";
    JLabel l2 = new JLabel(tekst);

    int i = 0;
    public Panel2 panel2;
    public Panel3 panel3;
    public Panel4 panel4;
    public Funkcje funkcje = new Funkcje();

    List<Integer> values = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8);
    public JButton[] b = new JButton[9];
    public int[] pomocnicza = new int[9];
    
    //Funkcje funkcje = new Funkcje();
    

    public Panel1() {

        
        setPreferredSize(new Dimension(200, 200));
        setBackground(Color.pink);
        setVisible(true);
        System.out.println("Działa Panel1");
    
        wystawienieTablicyDoGry();
        
        
        add(l2);
    }

    
    
    public void wystawienieTablicyDoGry() {

        for (int j = 0; j < 9; j++) {
            pomocnicza[j] = 9;
            b[j] = new JButton();
            b[j].setName("" + j);
            b[j].setPreferredSize(new Dimension(50, 50));
            b[j].setIcon(new ImageIcon("scr/N.png"));
            b[j].addActionListener(this);
            this.add(b[j]);
        }
    }

    

    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        Object źródło = e.getSource();
        if (źródło == b[2]) {
            l2.setText("zmiana");
        }
        
        
        
        
        
        System.out.print(((JButton) e.getSource()).getName() + " "); // wypisanie numeru przycisku

        pomocnicza[Integer.parseInt(((JButton) e.getSource()).getName())] = funkcje.getKtoTeraz(); // zapisanie tablicy pomocniczej do sprawdzania czy ktos wygral 

        values.forEach(k -> System.out.print(pomocnicza[k] + "-")); //wypisanie tablicy pomocniczej

        b[Integer.parseInt(((JButton) e.getSource()).getName())]
                .setIcon(new ImageIcon("scr/" + funkcje.getKtoTeraz() + ".png"));
        b[Integer.parseInt(((JButton) e.getSource()).getName())]
                .setDisabledIcon(new ImageIcon("scr/" + funkcje.getKtoTeraz() + ".png"));

        
        funkcje.setKtoTeraz(); // zmiana gracza
        b[Integer.parseInt(((JButton) e.getSource()).getName())].setEnabled(false); // blokada przycisku po wciśnięciu
        funkcje.setIleJeszczeRuchowZostalo(); // zmniejszenie ruchow o jeden
        System.out.print(" " + funkcje.getIleJeszczeRuchowZostalo());
        System.out.println("");

        funkcje.sprawdzenieCzyKoniec(pomocnicza, b);
        
        if (funkcje.getIleJeszczeRuchowZostalo()<9 & funkcje.getIleJeszczeRuchowZostalo()>0) //
            panel2.setVisible(false);
        else panel2.setVisible(true);
        
        

        if (funkcje.getIleJeszczeRuchowZostalo() == 0) {
            System.out.print("\nNowa gra");

        }

    }

}

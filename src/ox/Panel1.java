package ox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
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

    
    int i = 0;
    int m;
    public Panel2 panel2;
    public Panel3 panel3;
    public Naglowek naglowek;
    public Taktyka taktyka;
    public Funkcje funkcje = new Funkcje();
    

    List<Integer> values = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8);
    public JButton[] b = new JButton[9];
    public int[] pomocnicza = new int[9];

    
    public Panel1() {
        setPreferredSize(new Dimension(170, 170));
        setBackground(Color.DARK_GRAY);
        setVisible(true);
        System.out.println("Działa Panel1");
        funkcje.wystawienieCzystejTablicyDoGry(pomocnicza, b, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object źródło = e.getSource();
        
        if (funkcje.getKtoTeraz() == 0 & funkcje.getIleJeszczeRuchowZostalo() > 0) {
            funkcje.PodajePoleWKtoreOdbedzieSieRuchGracza(funkcje.getIleJeszczeRuchowZostalo(), b, e, this);
            funkcje.wcisnieciePrzycisku(m, pomocnicza, this);
            funkcje.jakKoniecToZaznaczenieKoncowejLinijkiWygrywającej(pomocnicza,b,this);
            funkcje.setZmniejszenieRuchowOJeden();
            funkcje.sprawdzenieCzyKoniec(pomocnicza, b);
            funkcje.setZmianaGracza();
            funkcje.wypisanieRóżnychParametrów(e, this);
            funkcje.dezaktywacjaIAktywacjaPaneliPoRozpoczeciuGry();
        }
        
        if (funkcje.getKtoTeraz() == 1 & funkcje.getIleJeszczeRuchowZostalo() > 0) {
            funkcje.PodajePoleWKtoreOdbedzieSieRuchKomputera(funkcje.getIleJeszczeRuchowZostalo(), b, this);
            funkcje.wcisnieciePrzycisku(m, pomocnicza, this);
            funkcje.jakKoniecToZaznaczenieKoncowejLinijkiWygrywającej(pomocnicza,b,this);
            funkcje.setZmniejszenieRuchowOJeden();
            funkcje.sprawdzenieCzyKoniec(pomocnicza, b);
            funkcje.setZmianaGracza();
            funkcje.wypisanieRóżnychParametrów(e, this);
            funkcje.dezaktywacjaIAktywacjaPaneliPoRozpoczeciuGry();
        }
    }

}

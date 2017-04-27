package ox;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
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
    int m;
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

        wystawienieCzystejTablicyDoGry(pomocnicza, b);

        add(l2);
    }

    public void wystawienieCzystejTablicyDoGry(int pomocnicza[], JButton b[]) {

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

    public void wypisanieRóżnychParametrów(ActionEvent e) {
        System.out.println();
        System.out.print("teraz: "+funkcje.getKtoTeraz());
        System.out.print(", wcisnieto: "+((JButton) e.getSource()).getName() + " ");
        values.forEach(k -> System.out.print(pomocnicza[k] + "-"));
        System.out.print(", ruchow: " + funkcje.getIleJeszczeRuchowZostalo());
        System.out.println("");
    }

    public void PodajePoleWKtoreOdbedzieSieRuchGracza(int ileJeszczeRuchowZostalo, JButton b[], ActionEvent e) {
        if (funkcje.getKtoTeraz() == 0) {
            m = (Integer.parseInt(((JButton) e.getSource()).getName()));
        }
    }

    public void PodajePoleWKtoreOdbedzieSieRuchKomputera(int ileJeszczeRuchowZostalo, JButton b[]) {

        if (funkcje.getKtoTeraz() == 1 & funkcje.getIleJeszczeRuchowZostalo() > 0) {
            Random generator = new Random();
            if (ileJeszczeRuchowZostalo > 0) {
                do {
                    m = (generator.nextInt(9));
                    System.out.print("losowanie" + m);
                } while (b[m].isEnabled() == false);
            }
        }
    }

    public void wcisnieciePrzycisku(int numerPolaDoWcisniecia, int pomocnicza[]) {

        pomocnicza[numerPolaDoWcisniecia] = funkcje.getKtoTeraz(); // zapisanie tablicy pomocniczej do sprawdzania czy ktos wygral 
        b[numerPolaDoWcisniecia].setIcon(new ImageIcon("scr/" + funkcje.getKtoTeraz() + ".png"));
        b[numerPolaDoWcisniecia].setDisabledIcon(new ImageIcon("scr/" + funkcje.getKtoTeraz() + ".png"));
        b[numerPolaDoWcisniecia].setEnabled(false);
    }

    public void wydarzeniaPoPrzyciśnięciuPrzycisku(ActionEvent e) {

        //System.out.print(((JButton) e.getSource()).getName() + " "); // wypisanie numeru przycisku
        pomocnicza[Integer.parseInt(((JButton) e.getSource()).getName())] = funkcje.getKtoTeraz(); // zapisanie tablicy pomocniczej do sprawdzania czy ktos wygral 

        //values.forEach(k -> System.out.print(pomocnicza[k] + "-")); //wypisanie tablicy pomocniczej
        b[Integer.parseInt(((JButton) e.getSource()).getName())].setIcon(new ImageIcon("scr/" + funkcje.getKtoTeraz() + ".png"));
        b[Integer.parseInt(((JButton) e.getSource()).getName())].setDisabledIcon(new ImageIcon("scr/" + funkcje.getKtoTeraz() + ".png"));

        // zmiana gracza
        b[Integer.parseInt(((JButton) e.getSource()).getName())].setEnabled(false); // blokada przycisku po wciśnięciu

//        System.out.print(" " + funkcje.getIleJeszczeRuchowZostalo());
//        System.out.println("");
    }
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {

        Object źródło = e.getSource();
        
        

        
        if (funkcje.getKtoTeraz() == 0 & funkcje.getIleJeszczeRuchowZostalo() > 0) {
            PodajePoleWKtoreOdbedzieSieRuchGracza(funkcje.getIleJeszczeRuchowZostalo(), b, e);
            wcisnieciePrzycisku(m, pomocnicza);
            funkcje.setZmianaGracza();
            funkcje.setZmniejszenieRuchowOJeden();
            wypisanieRóżnychParametrów(e);
            funkcje.sprawdzenieCzyKoniec(pomocnicza, b);
        }
        
        if (funkcje.getKtoTeraz() == 1 & funkcje.getIleJeszczeRuchowZostalo() > 0) {
            PodajePoleWKtoreOdbedzieSieRuchKomputera(funkcje.getIleJeszczeRuchowZostalo(), b);
            wcisnieciePrzycisku(m, pomocnicza);
            funkcje.setZmianaGracza();
            funkcje.setZmniejszenieRuchowOJeden();
            wypisanieRóżnychParametrów(e);
            funkcje.sprawdzenieCzyKoniec(pomocnicza, b);
        }

//        wydarzeniaPoPrzyciśnięciuPrzycisku(e);
//        wypisanieRóżnychParametrów(e);
//        funkcje.setZmianaGracza();
//        funkcje.sprawdzenieCzyKoniec(pomocnicza, b);
//        funkcje.PodajePoleWKtoreOdbedzieSieRuchKomputera(funkcje.getIleJeszczeRuchowZostalo(), b, pomocnicza);
//        wypisanieRóżnychParametrów(e);
//        funkcje.sprawdzenieCzyKoniec(pomocnicza, b);
//        funkcje.setZmianaGracza();
//        funkcje.dezaktywacjaIAktywacjaPaneliPoRozpoczeciuGry();
//        funkcje.setZmniejszenieRuchowOJeden(); // zmniejszenie ruchow o jeden
    }

}

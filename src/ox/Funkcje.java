/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pawel
 */
@Setter
@Getter
public class Funkcje {

    public Panel1 panel1;
    public Panel2 panel2;
    public Panel3 panel3;
    public Panel4 panel4;

    private static int ktoTeraz = 0;
    private static int ileJeszczeRuchowZostalo = 9;
    
    
    
    public int getKtoTeraz() {
        return ktoTeraz;
    }

    public int getIleJeszczeRuchowZostalo() {
        return ileJeszczeRuchowZostalo;
    }

    public void setKtoTeraz() {
        Funkcje.ktoTeraz = (-1 * (getKtoTeraz() - 1));
    }

    public void setIleJeszczeRuchowZostalo() {
        Funkcje.ileJeszczeRuchowZostalo = ((getIleJeszczeRuchowZostalo() - 1));
    }

    public void setIleJeszczeRuchowZostalo(int liczba) {
        Funkcje.ileJeszczeRuchowZostalo = liczba;
    }

    public void odNowa(int pomocnicza[], JButton b[]) {
        for (int j = 0; j < 9; j++) {
            pomocnicza[j] = 9;
            b[j].setIcon(new ImageIcon("scr/N.png"));
            b[j].setDisabledIcon(new ImageIcon("scr/N.png"));
            b[j].setEnabled(true);
        }
        setIleJeszczeRuchowZostalo(9);
        panel2.setVisible(true);
    }

    public void sprawdzenieCzyKoniec(int a[], JButton b[]) {

        if (       ((a[0] < 9) && (a[0] == a[1]) && (a[1] == a[2]))
                || ((a[3] < 9) && (a[3] == a[4]) && (a[4] == a[5]))
                || ((a[6] < 9) && (a[6] == a[7]) && (a[7] == a[8]))
                || ((a[0] < 9) && (a[0] == a[3]) && (a[3] == a[6]))
                || ((a[1] < 9) && (a[1] == a[4]) && (a[4] == a[7]))
                || ((a[2] < 9) && (a[2] == a[5]) && (a[5] == a[8]))
                || ((a[0] < 9) && (a[0] == a[4]) && (a[4] == a[8]))
                || ((a[2] < 9) && (a[2] == a[4]) && (a[4] == a[6]))) {
            setIleJeszczeRuchowZostalo(0);
            System.out.print("\nKoniec gry");

            for (int i = 0; i < 9; i++) {
                b[i].setEnabled(false);
            }
        } else if (getIleJeszczeRuchowZostalo() == 0) {
            System.out.print("\nNikt nie wygral");
        }
    }
    
    
        public void wystawienieCzystejTablicyDoGry(int pomocnicza[],JButton b[]) {

        for (int j = 0; j < 9; j++) {
            pomocnicza[j] = 9;
            b[j] = new JButton();
            b[j].setName("" + j);
            b[j].setPreferredSize(new Dimension(50, 50));
            b[j].setIcon(new ImageIcon("scr/N.png"));
            //panel1.b[j].addActionListener(this);
            
                this.panel1.add(b[j]);
            
            
        }
    }


    
    
    
        

}

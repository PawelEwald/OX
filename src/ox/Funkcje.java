/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
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
    public Panel21 panel21;
    public Panel3 panel3;
    public Naglowek naglowek;
    public Taktyka taktyka;
    public Punkty punkty;

    public int[] pomocnicza;
    public int m;
    private static int ktoTeraz = 0;
    private static int czyKoniec = 1;
    public static int wygraneO = 0;
    public static int wygraneX = 0;
    public static int remis = 0;

    private static int ileJeszczeRuchowZostalo = 9;

    public int getKtoTeraz() {
        return ktoTeraz;
    }

    public int getIleJeszczeRuchowZostalo() {
        return ileJeszczeRuchowZostalo;
    }

    public void setZmianaGracza() {
        Funkcje.ktoTeraz = (-1 * (getKtoTeraz() - 1));
    }

    public void setZmniejszenieRuchowOJeden() {
        Funkcje.ileJeszczeRuchowZostalo = ((getIleJeszczeRuchowZostalo() - 1));
    }

    public void setIleJeszczeRuchowZostalo(int liczba) {
        Funkcje.ileJeszczeRuchowZostalo = liczba;
    }

    public void odNowa(int pomocnicza[], JButton b[]) {
        for (int j = 0; j < 9; j++) {
            pomocnicza[j] = 9;
            b[j].setIcon(new ImageIcon("scr/N.png"));
            b[j].setDisabledIcon(new ImageIcon(""));
            b[j].setEnabled(true);
        }
        setIleJeszczeRuchowZostalo(9);
        panel2.setVisible(true);
        panel21.setVisible(false);
        if (getKtoTeraz() == 1 & getIleJeszczeRuchowZostalo() > 0) {
            PodajePoleWKtoreOdbedzieSieRuchKomputera(getIleJeszczeRuchowZostalo(), b, panel1);
            wcisnieciePrzycisku(b, m, pomocnicza);
            setZmianaGracza();
            setZmniejszenieRuchowOJeden();
            sprawdzenieCzyKoniec(pomocnicza, b);
        }
    }

    public void jakKoniecToZaznaczenieKoncowejLinijkiWygrywającej(int a[], JButton b[], Panel1 panel1) {
        if ((a[0] < 9) && (a[0] == a[1]) && (a[1] == a[2])) {
            for (int i=0;i<3;i++) panel1.b[i].setDisabledIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + "r.png"));
        } else if ((a[3] < 9) && (a[3] == a[4]) && (a[4] == a[5])) {
            for (int i=3;i<6;i++) panel1.b[i].setDisabledIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + "r.png"));
        } else if ((a[6] < 9) && (a[6] == a[7]) && (a[7] == a[8])) {
            for (int i=6;i<9;i++) panel1.b[i].setDisabledIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + "r.png"));
        } else if ((a[0] < 9) && (a[0] == a[3]) && (a[3] == a[6])) {
            for (int i=0;i<9;i=i+3) panel1.b[i].setDisabledIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + "r.png"));
        } else if ((a[1] < 9) && (a[1] == a[4]) && (a[4] == a[7])) {
            for (int i=1;i<9;i=i+3) panel1.b[i].setDisabledIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + "r.png"));
        } else if ((a[2] < 9) && (a[2] == a[5]) && (a[5] == a[8])) {
            for (int i=2;i<9;i=i+3) panel1.b[i].setDisabledIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + "r.png"));
        } else if ((a[0] < 9) && (a[0] == a[4]) && (a[4] == a[8])) {
            for (int i=0;i<9;i=i+4) panel1.b[i].setDisabledIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + "r.png"));
        } else if ((a[2] < 9) && (a[2] == a[4]) && (a[4] == a[6])) {
            for (int i=2;i<7;i=i+2) panel1.b[i].setDisabledIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + "r.png"));
        }
    }

    public void sprawdzenieCzyKoniec(int a[], JButton b[]) {
        if (((a[0] < 9) && (a[0] == a[1]) && (a[1] == a[2]))
                || ((a[3] < 9) && (a[3] == a[4]) && (a[4] == a[5]))
                || ((a[6] < 9) && (a[6] == a[7]) && (a[7] == a[8]))
                || ((a[0] < 9) && (a[0] == a[3]) && (a[3] == a[6]))
                || ((a[1] < 9) && (a[1] == a[4]) && (a[4] == a[7]))
                || ((a[2] < 9) && (a[2] == a[5]) && (a[5] == a[8]))
                || ((a[0] < 9) && (a[0] == a[4]) && (a[4] == a[8]))
                || ((a[2] < 9) && (a[2] == a[4]) && (a[4] == a[6]))) {
            setIleJeszczeRuchowZostalo(0);
            if (getKtoTeraz() == 0) {
                wygraneO++;
            }
            if (getKtoTeraz() == 1) {
                wygraneX++;
            }
            System.out.print("\nKoniec gry");

            for (int i = 0; i < 9; i++) {
                b[i].setEnabled(false);
                System.out.print(i + " zablokowano ");
            }
        } else if (getIleJeszczeRuchowZostalo() == 0) {
            remis++;
            System.out.print("\nNikt nie wygral");
        }
    }

    public void dezaktywacjaIAktywacjaPaneliPoRozpoczeciuGry() {
        if (getIleJeszczeRuchowZostalo() < 9 & getIleJeszczeRuchowZostalo() > 0) {
            panel2.setVisible(false);
            panel21.setVisible(true);
        } else {
            panel2.setVisible(true);
            panel21.setVisible(false);
        }
    }

    public void wcisnieciePrzycisku(JButton b[], int numerPolaDoWcisniecia, int pomocnicza[]) {
        pomocnicza[numerPolaDoWcisniecia] = getKtoTeraz(); // zapisanie tablicy pomocniczej do sprawdzania czy ktos wygral 
        b[numerPolaDoWcisniecia].setIcon(new ImageIcon("scr/" + getKtoTeraz() + ".png"));
        b[numerPolaDoWcisniecia].setDisabledIcon(new ImageIcon("scr/" + getKtoTeraz() + ".png"));
        b[numerPolaDoWcisniecia].setEnabled(false);
    }

    public void wystawienieCzystejTablicyDoGry(int[] pomocnicza, JButton[] b, Panel1 panel1) {
        for (int j = 0; j < 9; j++) {
            pomocnicza[j] = 9;
            b[j] = new JButton();
            b[j].setName("" + j);
            b[j].setPreferredSize(new Dimension(50, 50));
            b[j].setIcon(new ImageIcon("scr/N.png"));
            b[j].addActionListener(panel1);
            panel1.add(b[j]);
        }
    }

    public void wypisanieRóżnychParametrów(ActionEvent e, Panel1 panel1) {
        System.out.println();
        System.out.println("O: " + wygraneO + ", X: " + wygraneX + " ,remis: " + remis);
        System.out.print("teraz: " + panel1.funkcje.getKtoTeraz());
        System.out.print(", wcisnieto: " + ((JButton) e.getSource()).getName() + " ");
        panel1.values.forEach((Integer k) -> System.out.print(panel1.pomocnicza[k] + "-"));
        System.out.print(", ruchow: " + panel1.funkcje.getIleJeszczeRuchowZostalo());
        System.out.println("");
        punkty.getWo().setText(Integer.toString(wygraneO));
        punkty.getWx().setText(Integer.toString(wygraneX));
        punkty.getWox().setText(Integer.toString(remis));
    }
    


    public void wcisnieciePrzycisku(int numerPolaDoWcisniecia, int[] pomocnicza, Panel1 panel1) {
        pomocnicza[numerPolaDoWcisniecia] = panel1.funkcje.getKtoTeraz(); // zapisanie tablicy pomocniczej do sprawdzania czy ktos wygral
        panel1.b[numerPolaDoWcisniecia].setIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + ".png"));
        panel1.b[numerPolaDoWcisniecia].setDisabledIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + ".png"));
        panel1.b[numerPolaDoWcisniecia].setEnabled(false);
    }

    public void PodajePoleWKtoreOdbedzieSieRuchKomputera(int ileJeszczeRuchowZostalo, JButton[] b, Panel1 panel1) {
        if (panel1.funkcje.getKtoTeraz() == 1 & panel1.funkcje.getIleJeszczeRuchowZostalo() > 0) {

            if (panel2.łatwe.isSelected()) {
                taktyka.poziomLatwy(b, this);
            }

            if (panel2.średnie.isSelected()) {
                taktyka.poziomSredni(panel1.getPomocnicza(), b, this);
            }

            if (panel2.trudne.isSelected()) {
                taktyka.poziomTrudny(panel1.getPomocnicza(), b, this);
            }
        }
    }

    public void PodajePoleWKtoreOdbedzieSieRuchGracza(int ileJeszczeRuchowZostalo, JButton[] b, ActionEvent e, Panel1 panel1) {
        if (panel1.funkcje.getKtoTeraz() == 0) {
            panel1.m = (Integer.parseInt(((JButton) e.getSource()).getName()));
        }
    }

    public void wydarzeniaPoPrzyciśnięciuPrzycisku(ActionEvent e, Panel1 panel1) {
        panel1.pomocnicza[Integer.parseInt(((JButton) e.getSource()).getName())] = panel1.funkcje.getKtoTeraz(); // zapisanie tablicy pomocniczej do sprawdzania czy ktos wygral
        panel1.b[Integer.parseInt(((JButton) e.getSource()).getName())].setIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + ".png"));
        panel1.b[Integer.parseInt(((JButton) e.getSource()).getName())].setDisabledIcon(new ImageIcon("scr/" + panel1.funkcje.getKtoTeraz() + ".png"));
        panel1.b[Integer.parseInt(((JButton) e.getSource()).getName())].setEnabled(false); // blokada przycisku po wciśnięciu
    }

    public void aktualizacjaWynikówGry() {

    }

    public void resetPkt(Panel3 panel3) {
        panel3.funkcje.wygraneO = 0;
        panel3.funkcje.wygraneX = 0;
        panel3.funkcje.remis = 0;
        panel3.punkty.getWo().setText(Integer.toString(panel3.funkcje.wygraneO));
        panel3.punkty.getWx().setText(Integer.toString(panel3.funkcje.wygraneX));
        panel3.punkty.getWox().setText(Integer.toString(panel3.funkcje.remis));
    }

}

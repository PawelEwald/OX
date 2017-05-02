package ox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OX extends JFrame {

    JFrame okno1 = new JFrame("ok");
    FlowLayout layout = new FlowLayout();
    
    
    
    Panel1 p1 = new Panel1();
    Panel2 p2 = new Panel2();
    Panel3 p3 = new Panel3();
    Naglowek naglowek = new Naglowek();
    Funkcje funkcje = new Funkcje();
    Taktyka taktyka = new Taktyka();
    Punkty punkty = new Punkty();


    public OX() {
        okno1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno1.setBackground(Color.BLUE);
        okno1.setSize(430, 500);
        
        okno1.setLayout(layout);
        
        okno1.add(naglowek);
        okno1.add(punkty);
        okno1.add(p1);
        okno1.add(p2);
        okno1.add(p3);
        okno1.setVisible(true);
        okno1.setLocationRelativeTo(null);
        
        
        p1.setPanel2(p2);
        p1.setPanel3(p3);
        p1.setNaglowek(naglowek);
        p1.setFunkcje(funkcje);
        p1.setTaktyka(taktyka);
              
                
        p2.setPanel1(p1);
        p2.setPanel3(p3);
        p2.setNaglowek(naglowek);
        p2.setFunkcje(funkcje);
        p2.setTaktyka(taktyka);
        
        p3.setPanel1(p1);
        p3.setPanel2(p2);
        p3.setNaglowek(naglowek);
        p3.setFunkcje(funkcje);
        
        punkty.setPanel1(p1);
        punkty.setPanel2(p2);
        punkty.setPanel3(p3);
        punkty.setNaglowek(naglowek);
        punkty.setFunkcje(funkcje);
        punkty.setTaktyka(taktyka);
        
        
        naglowek.setPanel1(p1);
        naglowek.setPanel2(p2);
        naglowek.setPanel3(p3);
        naglowek.setFunkcje(funkcje);
        
        
        
        funkcje.setPanel1(p1);
        funkcje.setPanel2(p2);
        funkcje.setPanel3(p3);
        funkcje.setNaglowek(naglowek);
        funkcje.setTaktyka(taktyka);
        funkcje.setPunkty(punkty);
        
        taktyka.setFunkcje(funkcje);
        taktyka.setPanel1(p1);
        taktyka.setPanel2(p2);
        taktyka.setPanel3(p3);
        
               //int a=funkcje.getWygraneO();
    }

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        new OX();
        System.out.println("ok");


    }
}

package ox;

import java.awt.FlowLayout;
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
    Panel4 p4 = new Panel4();
    Funkcje funkcje = new Funkcje();
    Taktyka taktyka = new Taktyka();


    public OX() {
        okno1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno1.setSize(500, 500);
        okno1.setLayout(layout);


        okno1.add(p1);
        okno1.add(p2);
        okno1.add(p3);
        
        
        

        okno1.setVisible(true);
        okno1.setLocationRelativeTo(null);
        
        p1.setPanel2(p2);
        p1.setPanel3(p3);
        p1.setPanel4(p4);
        p1.setFunkcje(funkcje);
        p1.setTaktyka(taktyka);
              
                
        p2.setPanel1(p1);
        p2.setPanel3(p3);
        p2.setPanel4(p4);
        p2.setFunkcje(funkcje);
        p2.setTaktyka(taktyka);
        
        p3.setPanel1(p1);
        p3.setPanel2(p2);
        p3.setPanel4(p4);
        p3.setFunkcje(funkcje);
        
        p4.setPanel1(p1);
        p4.setPanel2(p2);
        p4.setPanel3(p3);
        p4.setFunkcje(funkcje);
        
        
        funkcje.setPanel1(p1);
        funkcje.setPanel2(p2);
        funkcje.setPanel3(p3);
        funkcje.setPanel4(p4);
        funkcje.setTaktyka(taktyka);
        
        taktyka.setFunkcje(funkcje);
        taktyka.setPanel1(p1);
        taktyka.setPanel2(p2);
        taktyka.setPanel3(p3);
        
               
    }

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        new OX();
        System.out.println("ok");


    }
}

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
    

    public OX() {
        okno1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno1.setSize(500, 500);
        okno1.setLayout(layout);


        okno1.add(p1);
        okno1.add(p2);

        okno1.setVisible(true);
        okno1.setLocationRelativeTo(null);
        
        p1.setPanel2(p2);
        p2.setPanel1(p1);
    }

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        new OX();
        System.out.println("ok");

    }
}

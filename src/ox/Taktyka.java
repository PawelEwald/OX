package ox;

import java.util.Random;
import javax.swing.JButton;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pawel
 */

@Getter
@Setter
public class Taktyka {
   public int m; 
   Funkcje funkcje;
   Panel1 panel1;
   Panel2 panel2;
   Panel3 panel3;
   

           Random generator = new Random();
   
    public void poziomLatwy(JButton[] b, Funkcje funkcje) {

        if (funkcje.getIleJeszczeRuchowZostalo() > 0) {
            do {
                funkcje.panel1.m = (generator.nextInt(9));
                System.out.print("losowanie" + funkcje.panel1.m);
            } while (b[funkcje.panel1.m].isEnabled() == false);
        }
    }
    

    
    public void poziomSredni(int a[], JButton b[], Funkcje funkcje){
        
        
        // atak bez taktyki gdy stoją dwa krzyżyki
                if	(a[0]==1 && a[1]==1 && a[2]>2) funkcje.panel1.m=2;
		else if	(a[0]==1 && a[2]==1 && a[1]>2) funkcje.panel1.m=1;
		else if	(a[1]==1 && a[2]==1 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[3]==1 && a[4]==1 && a[5]>2) funkcje.panel1.m=5;
		else if	(a[3]==1 && a[5]==1 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==1 && a[5]==1 && a[3]>2) funkcje.panel1.m=3;
		
                else if (a[6]==1 && a[7]==1 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[6]==1 && a[8]==1 && a[7]>2) funkcje.panel1.m=7;
		else if	(a[7]==1 && a[8]==1 && a[6]>2) funkcje.panel1.m=6;
		
		else if (a[0]==1 && a[3]==1 && a[6]>2) funkcje.panel1.m=6;
		else if	(a[0]==1 && a[6]==1 && a[3]>2) funkcje.panel1.m=3;
		else if	(a[3]==1 && a[6]==1 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[1]==1 && a[4]==1 && a[7]>2) funkcje.panel1.m=7;
		else if	(a[1]==1 && a[7]==1 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==1 && a[7]==1 && a[1]>2) funkcje.panel1.m=1;
		
		else if (a[2]==1 && a[5]==1 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[2]==1 && a[8]==1 && a[5]>2) funkcje.panel1.m=5;
		else if	(a[5]==1 && a[8]==1 && a[2]>2) funkcje.panel1.m=2;
		
		else if (a[0]==1 && a[4]==1 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[0]==1 && a[8]==1 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==1 && a[8]==1 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[2]==1 && a[4]==1 && a[6]>2) funkcje.panel1.m=6;
		else if	(a[2]==1 && a[6]==1 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==1 && a[6]==1 && a[2]>2) funkcje.panel1.m=2;
				
		
		// obrona bez taktyki 
		else if	(a[0]==0 && a[1]==0 && a[2]>2) funkcje.panel1.m=2;
		else if	(a[0]==0 && a[2]==0 && a[1]>2) funkcje.panel1.m=1;
		else if	(a[1]==0 && a[2]==0 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[3]==0 && a[4]==0 && a[5]>2) funkcje.panel1.m=5;
		else if	(a[3]==0 && a[5]==0 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==0 && a[5]==0 && a[3]>2) funkcje.panel1.m=3;
		
		else if (a[6]==0 && a[7]==0 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[6]==0 && a[8]==0 && a[7]>2) funkcje.panel1.m=7;
		else if	(a[7]==0 && a[8]==0 && a[6]>2) funkcje.panel1.m=6;
		
		else if (a[0]==0 && a[3]==0 && a[6]>2) funkcje.panel1.m=6;
		else if	(a[0]==0 && a[6]==0 && a[3]>2) funkcje.panel1.m=3;
		else if	(a[3]==0 && a[6]==0 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[1]==0 && a[4]==0 && a[7]>2) funkcje.panel1.m=7;
		else if	(a[1]==0 && a[7]==0 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==0 && a[7]==0 && a[1]>2) funkcje.panel1.m=1;
		
		else if (a[2]==0 && a[5]==0 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[2]==0 && a[8]==0 && a[5]>2) funkcje.panel1.m=5;
		else if	(a[5]==0 && a[8]==0 && a[2]>2) funkcje.panel1.m=2;
		
		else if (a[0]==0 && a[4]==0 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[0]==0 && a[8]==0 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==0 && a[8]==0 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[2]==0 && a[4]==0 && a[6]>2) funkcje.panel1.m=6;
		else if	(a[2]==0 && a[6]==0 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==0 && a[6]==0 && a[2]>2) funkcje.panel1.m=2;

		// atak gdy stoi jeden krzyżyk
		
		else if	(a[0]==1 && a[1]>2 && a[2]>2) funkcje.panel1.m=2;
		else if	(a[0]==1 && a[3]>2 && a[6]>2) funkcje.panel1.m=6;
		else if	(a[0]==1 && a[4]>2 && a[8]>2) funkcje.panel1.m=8;
        
//                else poziomLatwy(panel1.getB(), this);
        
                else if (funkcje.getIleJeszczeRuchowZostalo() > 0) {
            do {
                funkcje.panel1.m = (generator.nextInt(9));
                System.out.print("losowanie" + funkcje.panel1.m);
            } while (b[funkcje.panel1.m].isEnabled() == false);
        }
        
    }
            
		
		
		
public void poziomTrudny(int a[], JButton b[], Funkcje funkcje){

			//strategia na krzyżyk na środku i kółko na środku krawędzi - 3 linijki.
		if 	(a[0]>2 && a[1]>2 && a[2]>2 && a[3]>2 && a[4]>2 && a[5]>2 && a[6]>2 && a[7]>2 && a[8]>2) funkcje.panel1.m=4;//ruch 1. jak wszystko puste to na środek
		else if	(a[0]>2 && a[1]>2 && a[2]>2 && ((a[3]==0 && a[7]>2)^(a[7]==0 && a[3]>2)) && a[4]==1 && a[5]>2 && a[6]>2 && a[8]>2) funkcje.panel1.m=6;//ruch 2. jeśli gracz wstawi na 3 lub 7 to komp na 6 	
		else if	(a[0]>2 && a[2]>2 && ((a[1]==0 && a[5]>2)^(a[5]==0 && a[1]>2)) && a[3]>2 && a[4]==1 && a[6]>2 && a[7]>2 && a[8]>2) funkcje.panel1.m=2;//ruch 2. jeśli gracz wstawi na 1 lub 5 to komp na 2 
		else if (a[0]>2 && a[1]>2 && a[2]==0 && a[3]>2 && a[4]==1 && a[5]>2 && a[6]==1 && a[7]==0 && a[8]>2) funkcje.panel1.m=3;//ruch 3. wykończenie
		else if (a[0]>2 && a[1]>2 && a[2]==0 && a[3]==0 && a[4]==1 && a[5]>2 && a[6]==1 && a[7]>2 && a[8]>2) funkcje.panel1.m=7;//ruch 3. wykończenie
		else if (a[0]>2 && a[1]==0 && a[2]==1 && a[3]>2 && a[4]==1 && a[5]>2 && a[6]==0 && a[7]>2 && a[8]>2) funkcje.panel1.m=5;//ruch 3. wykończenie
		else if (a[0]>2 && a[1]>2 && a[2]==1 && a[3]>2 && a[4]==1 && a[5]==0 && a[6]==0 && a[7]>2 && a[8]>2) funkcje.panel1.m=1;//ruch 3. wykończenie
		
		//przerwanie strategii na pierwszy ruch na rogu 
		else if (a[0]==0 &&a[1]>2 &&a[2]>2 &&a[3]>2 &&a[4]==1 &&a[5]>2 &&a[6]>2 &&a[7]>2 &&a[8]==0) funkcje.panel1.m=1;
		else if (a[0]>2 &&a[1]>2 &&a[2]==0 &&a[3]>2 &&a[4]==1 &&a[5]>2 &&a[6]==0 &&a[7]>2 &&a[8]>2) funkcje.panel1.m=5;
		
		else if (a[4]>2) funkcje.panel1.m=4;
		else if (a[0]>2 &&a[1]>2 &&a[2]>2 &&a[3]>2 &&a[4]==0 &&a[5]>2 &&a[6]>2 &&a[7]>2 &&a[8]>2) funkcje.panel1.m=8;

		// atak bez taktyki gdy stoją dwa krzyżyki
		
		else if	(a[0]==1 && a[1]==1 && a[2]>2) funkcje.panel1.m=2;
		else if	(a[0]==1 && a[2]==1 && a[1]>2) funkcje.panel1.m=1;
		else if	(a[1]==1 && a[2]==1 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[3]==1 && a[4]==1 && a[5]>2) funkcje.panel1.m=5;
		else if	(a[3]==1 && a[5]==1 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==1 && a[5]==1 && a[3]>2) funkcje.panel1.m=3;
		
		else if (a[6]==1 && a[7]==1 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[6]==1 && a[8]==1 && a[7]>2) funkcje.panel1.m=7;
		else if	(a[7]==1 && a[8]==1 && a[6]>2) funkcje.panel1.m=6;
		
		else if (a[0]==1 && a[3]==1 && a[6]>2) funkcje.panel1.m=6;
		else if	(a[0]==1 && a[6]==1 && a[3]>2) funkcje.panel1.m=3;
		else if	(a[3]==1 && a[6]==1 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[1]==1 && a[4]==1 && a[7]>2) funkcje.panel1.m=7;
		else if	(a[1]==1 && a[7]==1 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==1 && a[7]==1 && a[1]>2) funkcje.panel1.m=1;
		
		else if (a[2]==1 && a[5]==1 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[2]==1 && a[8]==1 && a[5]>2) funkcje.panel1.m=5;
		else if	(a[5]==1 && a[8]==1 && a[2]>2) funkcje.panel1.m=2;
		
		else if (a[0]==1 && a[4]==1 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[0]==1 && a[8]==1 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==1 && a[8]==1 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[2]==1 && a[4]==1 && a[6]>2) funkcje.panel1.m=6;
		else if	(a[2]==1 && a[6]==1 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==1 && a[6]==1 && a[2]>2) funkcje.panel1.m=2;
			
		// obrona bez taktyki 
		else if	(a[0]==0 && a[1]==0 && a[2]>2) funkcje.panel1.m=2;
		else if	(a[0]==0 && a[2]==0 && a[1]>2) funkcje.panel1.m=1;
		else if	(a[1]==0 && a[2]==0 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[3]==0 && a[4]==0 && a[5]>2) funkcje.panel1.m=5;
		else if	(a[3]==0 && a[5]==0 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==0 && a[5]==0 && a[3]>2) funkcje.panel1.m=3;
		
		else if (a[6]==0 && a[7]==0 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[6]==0 && a[8]==0 && a[7]>2) funkcje.panel1.m=7;
		else if	(a[7]==0 && a[8]==0 && a[6]>2) funkcje.panel1.m=6;
		
		else if (a[0]==0 && a[3]==0 && a[6]>2) funkcje.panel1.m=6;
		else if	(a[0]==0 && a[6]==0 && a[3]>2) funkcje.panel1.m=3;
		else if	(a[3]==0 && a[6]==0 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[1]==0 && a[4]==0 && a[7]>2) funkcje.panel1.m=7;
		else if	(a[1]==0 && a[7]==0 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==0 && a[7]==0 && a[1]>2) funkcje.panel1.m=1;
		
		else if (a[2]==0 && a[5]==0 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[2]==0 && a[8]==0 && a[5]>2) funkcje.panel1.m=5;
		else if	(a[5]==0 && a[8]==0 && a[2]>2) funkcje.panel1.m=2;
		
		else if (a[0]==0 && a[4]==0 && a[8]>2) funkcje.panel1.m=8;
		else if	(a[0]==0 && a[8]==0 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==0 && a[8]==0 && a[0]>2) funkcje.panel1.m=0;
		
		else if (a[2]==0 && a[4]==0 && a[6]>2) funkcje.panel1.m=6;
		else if	(a[2]==0 && a[6]==0 && a[4]>2) funkcje.panel1.m=4;
		else if	(a[4]==0 && a[6]==0 && a[2]>2) funkcje.panel1.m=2;

		// atak gdy stoi jeden krzyżyk
		
		else if	(a[0]==1 && a[1]>2 && a[2]>2) funkcje.panel1.m=2;
		else if	(a[0]==1 && a[3]>2 && a[6]>2) funkcje.panel1.m=6;
		else if	(a[0]==1 && a[4]>2 && a[8]>2) funkcje.panel1.m=8;
                
                else if (funkcje.getIleJeszczeRuchowZostalo() > 0) {
            do {
                funkcje.panel1.m = (generator.nextInt(9));
                System.out.print("losowanie" + funkcje.panel1.m);
            } while (b[funkcje.panel1.m].isEnabled() == false);
                }
		
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pawel
 */
public class RuchKomputera {
    
    
    public RuchKomputera{
		////////////////////
		// Ruch komputera //
		////////////////////
		
		JButton[] tablica = {b1,b2,b3,b4,b5,b6,b7,b8,b9};
		Random generator = new Random();
		int m=12;
		if (samNaSam.isSelected())
		{
			
		}
		
		else if (ruchy>2){
		
		
		if (łatwe.isSelected())
		{
		 if (ruchy>2)
		{
			do{
				m=(generator.nextInt(9));
				System.out.println("losowanie");
			}
		while(tablica[m].isEnabled()==false);
		}
		}	
			
		if (średnie.isSelected())
		{
		//if (tablica2[4]>2) m=4;
				
		// atak bez taktyki gdy stoją dwa krzyżyki
		
		     if	(tablica2[0]==0 && tablica2[1]==0 && tablica2[2]>2) m=2;
		else if	(tablica2[0]==0 && tablica2[2]==0 && tablica2[1]>2) m=1;
		else if	(tablica2[1]==0 && tablica2[2]==0 && tablica2[0]>2) m=0;
		
		else if (tablica2[3]==0 && tablica2[4]==0 && tablica2[5]>2) m=5;
		else if	(tablica2[3]==0 && tablica2[5]==0 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==0 && tablica2[5]==0 && tablica2[3]>2) m=3;
		
		else if (tablica2[6]==0 && tablica2[7]==0 && tablica2[8]>2) m=8;
		else if	(tablica2[6]==0 && tablica2[8]==0 && tablica2[7]>2) m=7;
		else if	(tablica2[7]==0 && tablica2[8]==0 && tablica2[6]>2) m=6;
		
		else if (tablica2[0]==0 && tablica2[3]==0 && tablica2[6]>2) m=6;
		else if	(tablica2[0]==0 && tablica2[6]==0 && tablica2[3]>2) m=3;
		else if	(tablica2[3]==0 && tablica2[6]==0 && tablica2[0]>2) m=0;
		
		else if (tablica2[1]==0 && tablica2[4]==0 && tablica2[7]>2) m=7;
		else if	(tablica2[1]==0 && tablica2[7]==0 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==0 && tablica2[7]==0 && tablica2[1]>2) m=1;
		
		else if (tablica2[2]==0 && tablica2[5]==0 && tablica2[8]>2) m=8;
		else if	(tablica2[2]==0 && tablica2[8]==0 && tablica2[5]>2) m=5;
		else if	(tablica2[5]==0 && tablica2[8]==0 && tablica2[2]>2) m=2;
		
		else if (tablica2[0]==0 && tablica2[4]==0 && tablica2[8]>2) m=8;
		else if	(tablica2[0]==0 && tablica2[8]==0 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==0 && tablica2[8]==0 && tablica2[0]>2) m=0;
		
		else if (tablica2[2]==0 && tablica2[4]==0 && tablica2[6]>2) m=6;
		else if	(tablica2[2]==0 && tablica2[6]==0 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==0 && tablica2[6]==0 && tablica2[2]>2) m=2;
				
		
		// obrona bez taktyki 
		else if	(tablica2[0]==1 && tablica2[1]==1 && tablica2[2]>2) m=2;
		else if	(tablica2[0]==1 && tablica2[2]==1 && tablica2[1]>2) m=1;
		else if	(tablica2[1]==1 && tablica2[2]==1 && tablica2[0]>2) m=0;
		
		else if (tablica2[3]==1 && tablica2[4]==1 && tablica2[5]>2) m=5;
		else if	(tablica2[3]==1 && tablica2[5]==1 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==1 && tablica2[5]==1 && tablica2[3]>2) m=3;
		
		else if (tablica2[6]==1 && tablica2[7]==1 && tablica2[8]>2) m=8;
		else if	(tablica2[6]==1 && tablica2[8]==1 && tablica2[7]>2) m=7;
		else if	(tablica2[7]==1 && tablica2[8]==1 && tablica2[6]>2) m=6;
		
		else if (tablica2[0]==1 && tablica2[3]==1 && tablica2[6]>2) m=6;
		else if	(tablica2[0]==1 && tablica2[6]==1 && tablica2[3]>2) m=3;
		else if	(tablica2[3]==1 && tablica2[6]==1 && tablica2[0]>2) m=0;
		
		else if (tablica2[1]==1 && tablica2[4]==1 && tablica2[7]>2) m=7;
		else if	(tablica2[1]==1 && tablica2[7]==1 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==1 && tablica2[7]==1 && tablica2[1]>2) m=1;
		
		else if (tablica2[2]==1 && tablica2[5]==1 && tablica2[8]>2) m=8;
		else if	(tablica2[2]==1 && tablica2[8]==1 && tablica2[5]>2) m=5;
		else if	(tablica2[5]==1 && tablica2[8]==1 && tablica2[2]>2) m=2;
		
		else if (tablica2[0]==1 && tablica2[4]==1 && tablica2[8]>2) m=8;
		else if	(tablica2[0]==1 && tablica2[8]==1 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==1 && tablica2[8]==1 && tablica2[0]>2) m=0;
		
		else if (tablica2[2]==1 && tablica2[4]==1 && tablica2[6]>2) m=6;
		else if	(tablica2[2]==1 && tablica2[6]==1 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==1 && tablica2[6]==1 && tablica2[2]>2) m=2;

		// atak gdy stoi jeden krzyżyk
		
		else if	(tablica2[0]==0 && tablica2[1]>2 && tablica2[2]>2) m=2;
		else if	(tablica2[0]==0 && tablica2[3]>2 && tablica2[6]>2) m=6;
		else if	(tablica2[0]==0 && tablica2[4]>2 && tablica2[8]>2) m=8;
		else if (ruchy>2)
		{
			do{
				m=(generator.nextInt(9));
				System.out.println("losowanie");
			}
		while(tablica[m].isEnabled()==false);
		}}
			
		if (trudne.isSelected())
		{
	
			//strategia na krzyżyk na środku i kółko na środku krawędzi - 3 linijki.
		if 		(tablica2[0]>2 &&tablica2[1]>2 &&tablica2[2]>2 &&tablica2[3]>2 &&tablica2[4]>2 &&tablica2[5]>2 &&tablica2[6]>2 &&tablica2[7]>2 &&tablica2[8]>2) m=4;//ruch 1. jak wszystko puste to na środek
		else if	(tablica2[0]>2 &&tablica2[1]>2 &&tablica2[2]>2 &&((tablica2[3]==1 && tablica2[7]>2)^(tablica2[7]==1 && tablica2[3]>2)) &&tablica2[4]==0 &&tablica2[5]>2 &&tablica2[6]>2 &&tablica2[8]>2) m=6;//ruch 2. jeśli gracz wstawi na 3 lub 7 to komp na 6 	
		else if	(tablica2[0]>2 &&tablica2[2]>2 &&((tablica2[1]==1 && tablica2[5]>2)^(tablica2[5]==1 && tablica2[1]>2)) &&tablica2[3]>2 &&tablica2[4]==0 &&tablica2[6]>2 &&tablica2[7]>2 &&tablica2[8]>2) m=2;//ruch 2. jeśli gracz wstawi na 1 lub 5 to komp na 2 
		else if (tablica2[0]>2 &&tablica2[1]>2 &&tablica2[2]==1 &&tablica2[3]>2 &&tablica2[4]==0 &&tablica2[5]>2 &&tablica2[6]==0 &&tablica2[7]==1 &&tablica2[8]>2) m=3;//ruch 3. wykończenie
		else if (tablica2[0]>2 &&tablica2[1]>2 &&tablica2[2]==1 &&tablica2[3]==1 &&tablica2[4]==0 &&tablica2[5]>2 &&tablica2[6]==0 &&tablica2[7]>2 &&tablica2[8]>2) m=7;//ruch 3. wykończenie
		else if (tablica2[0]>2 &&tablica2[1]==1 &&tablica2[2]==0 &&tablica2[3]>2 &&tablica2[4]==0 &&tablica2[5]>2 &&tablica2[6]==1 &&tablica2[7]>2 &&tablica2[8]>2) m=5;//ruch 3. wykończenie
		else if (tablica2[0]>2 &&tablica2[1]>2 &&tablica2[2]==0 &&tablica2[3]>2 &&tablica2[4]==0 &&tablica2[5]==1 &&tablica2[6]==1 &&tablica2[7]>2 &&tablica2[8]>2) m=1;//ruch 3. wykończenie
		
		//przerwanie strategii na pierwszy ruch na rogu 
		else if (tablica2[0]==1 &&tablica2[1]>2 &&tablica2[2]>2 &&tablica2[3]>2 &&tablica2[4]==0 &&tablica2[5]>2 &&tablica2[6]>2 &&tablica2[7]>2 &&tablica2[8]==1) m=1;
		else if (tablica2[0]>2 &&tablica2[1]>2 &&tablica2[2]==1 &&tablica2[3]>2 &&tablica2[4]==0 &&tablica2[5]>2 &&tablica2[6]==1 &&tablica2[7]>2 &&tablica2[8]>2) m=5;
		
		else if (tablica2[4]>2) m=4;
		else if (tablica2[0]>2 &&tablica2[1]>2 &&tablica2[2]>2 &&tablica2[3]>2 &&tablica2[4]==1 &&tablica2[5]>2 &&tablica2[6]>2 &&tablica2[7]>2 &&tablica2[8]>2) m=8;

		// atak bez taktyki gdy stoją dwa krzyżyki
		
		else if	(tablica2[0]==0 && tablica2[1]==0 && tablica2[2]>2) m=2;
		else if	(tablica2[0]==0 && tablica2[2]==0 && tablica2[1]>2) m=1;
		else if	(tablica2[1]==0 && tablica2[2]==0 && tablica2[0]>2) m=0;
		
		else if (tablica2[3]==0 && tablica2[4]==0 && tablica2[5]>2) m=5;
		else if	(tablica2[3]==0 && tablica2[5]==0 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==0 && tablica2[5]==0 && tablica2[3]>2) m=3;
		
		else if (tablica2[6]==0 && tablica2[7]==0 && tablica2[8]>2) m=8;
		else if	(tablica2[6]==0 && tablica2[8]==0 && tablica2[7]>2) m=7;
		else if	(tablica2[7]==0 && tablica2[8]==0 && tablica2[6]>2) m=6;
		
		else if (tablica2[0]==0 && tablica2[3]==0 && tablica2[6]>2) m=6;
		else if	(tablica2[0]==0 && tablica2[6]==0 && tablica2[3]>2) m=3;
		else if	(tablica2[3]==0 && tablica2[6]==0 && tablica2[0]>2) m=0;
		
		else if (tablica2[1]==0 && tablica2[4]==0 && tablica2[7]>2) m=7;
		else if	(tablica2[1]==0 && tablica2[7]==0 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==0 && tablica2[7]==0 && tablica2[1]>2) m=1;
		
		else if (tablica2[2]==0 && tablica2[5]==0 && tablica2[8]>2) m=8;
		else if	(tablica2[2]==0 && tablica2[8]==0 && tablica2[5]>2) m=5;
		else if	(tablica2[5]==0 && tablica2[8]==0 && tablica2[2]>2) m=2;
		
		else if (tablica2[0]==0 && tablica2[4]==0 && tablica2[8]>2) m=8;
		else if	(tablica2[0]==0 && tablica2[8]==0 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==0 && tablica2[8]==0 && tablica2[0]>2) m=0;
		
		else if (tablica2[2]==0 && tablica2[4]==0 && tablica2[6]>2) m=6;
		else if	(tablica2[2]==0 && tablica2[6]==0 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==0 && tablica2[6]==0 && tablica2[2]>2) m=2;
			
		// obrona bez taktyki 
		else if	(tablica2[0]==1 && tablica2[1]==1 && tablica2[2]>2) m=2;
		else if	(tablica2[0]==1 && tablica2[2]==1 && tablica2[1]>2) m=1;
		else if	(tablica2[1]==1 && tablica2[2]==1 && tablica2[0]>2) m=0;
		
		else if (tablica2[3]==1 && tablica2[4]==1 && tablica2[5]>2) m=5;
		else if	(tablica2[3]==1 && tablica2[5]==1 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==1 && tablica2[5]==1 && tablica2[3]>2) m=3;
		
		else if (tablica2[6]==1 && tablica2[7]==1 && tablica2[8]>2) m=8;
		else if	(tablica2[6]==1 && tablica2[8]==1 && tablica2[7]>2) m=7;
		else if	(tablica2[7]==1 && tablica2[8]==1 && tablica2[6]>2) m=6;
		
		else if (tablica2[0]==1 && tablica2[3]==1 && tablica2[6]>2) m=6;
		else if	(tablica2[0]==1 && tablica2[6]==1 && tablica2[3]>2) m=3;
		else if	(tablica2[3]==1 && tablica2[6]==1 && tablica2[0]>2) m=0;
		
		else if (tablica2[1]==1 && tablica2[4]==1 && tablica2[7]>2) m=7;
		else if	(tablica2[1]==1 && tablica2[7]==1 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==1 && tablica2[7]==1 && tablica2[1]>2) m=1;
		
		else if (tablica2[2]==1 && tablica2[5]==1 && tablica2[8]>2) m=8;
		else if	(tablica2[2]==1 && tablica2[8]==1 && tablica2[5]>2) m=5;
		else if	(tablica2[5]==1 && tablica2[8]==1 && tablica2[2]>2) m=2;
		
		else if (tablica2[0]==1 && tablica2[4]==1 && tablica2[8]>2) m=8;
		else if	(tablica2[0]==1 && tablica2[8]==1 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==1 && tablica2[8]==1 && tablica2[0]>2) m=0;
		
		else if (tablica2[2]==1 && tablica2[4]==1 && tablica2[6]>2) m=6;
		else if	(tablica2[2]==1 && tablica2[6]==1 && tablica2[4]>2) m=4;
		else if	(tablica2[4]==1 && tablica2[6]==1 && tablica2[2]>2) m=2;

		// atak gdy stoi jeden krzyżyk
		
		else if	(tablica2[0]==0 && tablica2[1]>2 && tablica2[2]>2) m=2;
		else if	(tablica2[0]==0 && tablica2[3]>2 && tablica2[6]>2) m=6;
		else if	(tablica2[0]==0 && tablica2[4]>2 && tablica2[8]>2) m=8;
		else if (ruchy>2)
		{
			do{
				m=(generator.nextInt(9));
				System.out.println("losowanie");
			}
		while(tablica[m].isEnabled()==false);
		}}

		if (i0==0)
		{
		tablica[m].setIcon(new ImageIcon("scr/O.png"));
		box.setIcon(new ImageIcon("scr/X.png"));
		tablica[m].setDisabledIcon(imgDO);
		tablica2[m]=i0=1;
		}
	else
		{
		tablica[m].setIcon(new ImageIcon("scr/X.png"));
		box.setIcon(new ImageIcon("scr/O.png"));
		tablica[m].setDisabledIcon(imgDX);
		tablica2[m]=i0=0;
		}
		tablica[m].setEnabled(false);
		SprawdzenieWyniku();
		}
	}
    
    
}

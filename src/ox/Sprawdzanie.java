package ox;

//import ox.Kolejka;
import javax.swing.JButton;

public class Sprawdzanie {

    Kolejka kolejka = new Kolejka();

    public void sprawdzenieCzyKoniec(int a[], JButton b[]) {

        if (((a[0] < 9) && (a[0] == a[1]) && (a[1] == a[2]))
                || ((a[3] < 9) && (a[3] == a[4]) && (a[4] == a[5]))
                || ((a[6] < 9) && (a[6] == a[7]) && (a[7] == a[8]))
                || ((a[0] < 9) && (a[0] == a[3]) && (a[3] == a[6]))
                || ((a[1] < 9) && (a[1] == a[4]) && (a[4] == a[7]))
                || ((a[2] < 9) && (a[2] == a[5]) && (a[5] == a[8]))
                || ((a[0] < 9) && (a[0] == a[4]) && (a[4] == a[8]))
                || ((a[2] < 9) && (a[2] == a[4]) && (a[4] == a[6]))) {
            System.out.print("\nKoniec gry");

            for (int i = 0; i < 9; i++) {
                b[i].setEnabled(false);
            }
        } else if (kolejka.getIleJeszczeRuchowZostalo() == 0) {
            System.out.print("\nNikt nie wygral");

        }

    }

}

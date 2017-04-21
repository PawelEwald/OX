package ox;

public class Kolejka {

	private static int ktoTeraz = 0;
	private static int ileJeszczeRuchowZostalo = 9;
	public int getKtoTeraz() {
		return ktoTeraz;
	}
	public int getIleJeszczeRuchowZostalo() {
		return ileJeszczeRuchowZostalo;
	}
	
	
	public void setKtoTeraz() {
		Kolejka.ktoTeraz = (-1 * (getKtoTeraz() - 1));
	}
	public void setIleJeszczeRuchowZostalo() {
		Kolejka.ileJeszczeRuchowZostalo = ((getIleJeszczeRuchowZostalo() - 1));
	}
	public void setIleJeszczeRuchowZostalo(int liczba) {
		Kolejka.ileJeszczeRuchowZostalo = liczba;
	}

}

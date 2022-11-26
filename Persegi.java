public class Persegi extends BangunDatar {
	float panjang;
	float lebar;

	// Setter
	public Persegi(int panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	// Abstract
	public void gambar() {
		System.out.println("Menggambar Persegi");
	}
	public float luas() {
		return this.panjang * this.lebar;
	}
}
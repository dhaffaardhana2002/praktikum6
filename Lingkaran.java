public class Lingkaran extends BangunDatar {
	int r;

	// Setter
	public Lingkaran(int r) {
		this.r = r;
	}

	// Abstract
	public void gambar() {
		System.out.println("Menggambar Lingkaran");
	}
	public float luas() {
		return (float) 3.14 * this.r * this.r;
	}
}
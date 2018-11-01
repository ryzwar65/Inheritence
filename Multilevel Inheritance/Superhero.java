public class Superhero extends Dc /*Parent implements Interface*/ {
	public String nama;
	public Superhero(){
		System.out.println("Terkena Mutasi");
	}
	public Superhero(String nama){
		this.nama = nama;
		System.out.println("Iam "+nama);
	}
}
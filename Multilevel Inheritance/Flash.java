public class Flash extends Superhero /*Parent implements Interface*/ {
	public Flash(){
		super();
		System.out.println("Iam The Flash");
	}
	public static void main(String[] args) {
		Flash fl = new Flash();
		Superhero sp = new Superhero("Flash");
		Dc dc = new Dc(10);
	}
}
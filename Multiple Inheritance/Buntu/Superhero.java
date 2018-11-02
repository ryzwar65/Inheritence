class Superhero implements Marvel, DcComic{
	public void show(){
			DcComic.super.show();
			Marvel.super.show();
	
	}
		
	// public static void main(String[] args) {
	// 		super("Flash");
	// }
	public static void main(String[] args) {
		Superhero sp = new Superhero();
		sp.show();
	}
}
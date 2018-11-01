public interface Marvel{
	int angka;
	public Marvel(){
			System.out.println("Can Fly");
			System.out.println("Strengt Ability");
	}
	public Marvel(int bilangan){
		angka += bilangan;
		System.out.println("Kemampuan Yang Di Miliki ada "+angka);
	}
}
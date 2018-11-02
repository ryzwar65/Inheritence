// public class Marvel extends Greeter{
// 	int angka;
// 	public Marvel(){
// 			System.out.println("Can Fly");
// 			System.out.println("Strengt Ability");
// 	}
// 	public Marvel(int bilangan){
// 		angka += bilangan;
// 		System.out.println("Kemampuan Yang Di Miliki ada "+angka);
// 	}
// }
interface Marvel { 
    // default method 
    default void show() 
    { 
        System.out.println("Default PI1"); 
    } 
}
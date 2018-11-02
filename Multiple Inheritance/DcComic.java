// public class DcComic extends Greeter{
// 	public DcComic(){
// 			System.out.println("Best hero ");
// 	}
// 	public DcComic(String nama){
// 		System.out.println("Nama Hero : "+nama);
// 	}
// }
interface DcComic 
{ 
    // default method 
    default void show() 
    { 
        System.out.println("Default PI1"); 
    } 
}
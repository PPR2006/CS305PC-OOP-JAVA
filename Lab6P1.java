/* to create an Enumeration we need to use the keyboard
	"enum"
*/
import java.util.Scanner;
 enum Fruits{

 	Apple('a'), Banana('b'), citrus('c'), DragonFruit('d'), Fig('e'), Graphes('f');
 	private char a;
 	Fruits(char a){
 		this.a = a;
 	}
 	public char get(){
 		return a;
 	}
 }
 
 public class Lab6P1{
 	public static void main(String...args){
 		System.out.println("enter value you want");
 		Scanner s = new Scanner(System.in);
 		String st = s.next();
 		char ch = st.charAt(0);
 		ch = Character.toLowerCase(ch);
 		
 		for(Fruits f: Fruits.values()){
 			if (f.get() == ch) {
 				System.out.println(f);	
 			}
 		}
 	}
 }

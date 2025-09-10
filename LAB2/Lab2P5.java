import java.util.Scanner;
class Lab2P5{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the 'a' value");
		System.out.println("enter the 'b' value");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println((a&b)+","+(a|b)+","+(a^b)); 	
	}
}	

import java.util.Scanner;
class Lab2P3{
	public static void main(String...args){
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter the 'a' value");
		 System.out.println("enter the 'b' value");
		 int a = s.nextInt();
		 int b = s.nextInt();
		 String op = s.next();
		 String str = switch(op){
		 	case "++" -> "hello";
		 	case "--", "=" -> "Not good";
		 	default -> "sorry";
		 };
		 System.out.println("result is: "+ str);
	}
}

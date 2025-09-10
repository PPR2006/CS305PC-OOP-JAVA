//write a program to check whether a number is a prime or not 
import java.util.Scanner;
class Lab2P6{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int a = s.nextInt();
		for (int i=2; i<a; i++){
			if (a%i==0){
				System.out.println("given num is not a prime number");
			}
			else {
				System.out.println("given num is a prime number");
			}		
		}
	}
}

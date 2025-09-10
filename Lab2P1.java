import java.util.Scanner;
class Lab2P1{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value");
		int a = s.nextInt();
		String op = s.next();
		switch(op){
			case "++": 
		        	System.out.println("Post: "+ (a++));
		        	System.out.println("Pre: "+ (++a));
		        	break;
		        case "--":  
		        	System.out.println("Post: "+ (a--));
		        	System.out.println("Post: "+ (--a));
		        	break;
		        case "+":
		        	a = +a;
		        	System.out.println("Unary +:"+ (a));
		        	break;
		        case "-":
		        	a = -a;
		        	System.out.println("Unary +:"+ (-a));
		        	break;
		        case "~":
		        	a = a;
		        	System.out.println("Unary +:"+ (a));
		        default:
		        	System.out.println("sorry");		        
			}
	}			
}

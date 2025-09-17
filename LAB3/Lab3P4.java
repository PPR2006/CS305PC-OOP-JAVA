//constructor overloading
import java.util.Scanner;

class Lab3P4 {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        Lab3P4 X = new Lab3P4();                  
        Lab3P4 R = new Lab3P4(5);               
        Lab3P4 P = new Lab3P4("OOO");             
        Lab3P4 U = new Lab3P4(23, "uuu");        

    }

 
    Lab3P4() {
        System.out.println("constructor without params");
    }

   
    Lab3P4(int x) {
        System.out.println("constructor with int param: " + x);
    }

    
    Lab3P4(String s) {
        System.out.println("constructor with String param: " + s);
    }

   
    Lab3P4(int x, String s) {
        System.out.println("constructor with two params: " + x + " " + s);
    }
}


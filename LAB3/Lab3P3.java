//method overloading
class Lab3P3{
	
	public static void main(String...a){
		Lab3P3 l = new Lab3P3();
		l.show();
		l.show(10); 
		l.show("String"); 
		l.show(10, "String");
	}
	
	public void show (){
		System.out.println("Method without params");
	}
	
	public void show (int x){
		System.out.println("Method with int params: "+ x);
	}
	
	public void show (String s){
		System.out.println("Method with String params: "+ s);
	}
	
	public void show (int x, String s){
		System.out.println("Method with two params int and String: "+ x +" "+ s);
	}
	
}

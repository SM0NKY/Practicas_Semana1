public class F_conditionals{
	static void Check (int age){
		if (age > 18){
			System.out.println("Edad suficiente");
		}
		else{
			System.out.println("Edad insuficiente");
		}
	}
	public static void main(String[] args){
		Check(22);
	}
}

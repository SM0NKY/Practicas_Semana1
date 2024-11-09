public class Overloading{
	static int method(int i, int j){
		return i + j;
	}
	static double method(double i, double j){
		return i + j;
	}
	public static void main(String[] args){
		int Numbers = method(3,8);
		double Num = method(5.4,4.2);
		System.out.println(Numbers + Num);
	}
}

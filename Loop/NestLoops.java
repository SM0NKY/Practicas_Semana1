public class NestLoops{
	public static void main(String[] args){
		for (int i = 1; i <= 2; i++){
			System.out.println("Loop n: " + i);
			for(int j = 1; j <= 3;j++){
				System.out.println("Loop 2 " + j);
			}
		}
	}
}


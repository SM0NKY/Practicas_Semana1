public class Example{
	public static void main(String[] args){
		int Ages[] = {20,22,18,35,39,42,23,19};
		float avg, sum = 0;
		int length = Ages.length;
		int lowestA = Ages[0];
		for (int age:Ages){
			if (lowestA > age){
				lowestA = age;
			}
		}
		System.out.println("La edad mas baja en el arreglo es " + lowestA);
	}
}

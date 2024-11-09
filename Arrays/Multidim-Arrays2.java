public class Multidim2{
	public static void main(String[] args){
		int[][] Numbers = {{1,2,3,4},{5,6,7}};
		//Esto es mas facil de interpretar que la version anterior
		for (int[] row : Numbers){
			for(int i: row){
				System.out.println(i);
			}
		}
	}
}


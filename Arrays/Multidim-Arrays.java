public class Multidim{
	public static void main(String[] args){
		int[][] Numbers  = {
		{1,2,3,4},
		{5,6,7}
		};
		// Para modificar  los elementos del arreglo se puede utiliar [i][j], dependiendo de la posicion
		//Ejemplo
		Numbers[0][2] = 9;
		// Se puede imptimir los valores del arreglo con un bucle por ejemplo
		for (int i = 0; i < Numbers.length; i++){
			for (int j = 0; j < Numbers[i].length;j++){
				System.out.println(Numbers[i][j]);
			}
		}
	}
}


public class S_Array{
	public static void main(String[] args){
		//El arreglo de los strings se define de la siguiente manera, String[] 
		String[] cars = {"Volvo","BMW"};
		//Se imprime el arreglo
		System.out.println(cars);
		//Para poder saber la longitud del arreglo, se hace lo siguiente
		System.out.println("La longitud del aeerreglo: " + cars.length);
		//Para poder modificar el arreglo se utiliza -> [], para modificar el valor de la posicion
		cars[1] = "Opel";
		System.out.println(cars);
	}
}



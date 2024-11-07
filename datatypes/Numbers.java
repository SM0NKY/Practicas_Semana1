public class Number{
	public static void main(String[] args){
		//Podemos definir un numero con byte si el numero entero que queremos utilizar esta entre 127 y -128 para ahorrar memoria
		byte NumberBt = 125;
		System.out.println(NumberBt);
		//Tambien podemos gaurdar numero enteros desde -32768 hasta 32767 con short
		short NumberSh = 30502;
		System.out.println(NumberSh);
		//Podemos utilizar int para numeros desde -2147483648 hasta 2147483647
		int NumberInt = 100000;
		System.out.println(NumberInt);
		//Podemos utilizar long para numero mas grandes que int
		long NumberLg = 15000000000L; //Debe de terminar con una L
		System.out.print(NumberLg);
		//Para los numeros cortos se utilizan float para los mas cortos, y para numeros con decimales mas largos y mayor precision se utiiza
		// double
		float NumberFt = 2.99f; //No olvidarse que debe de contener la "f" de float
		double NumberDe = 19.99d; // Como el anterior aqui debe de tener la "d" al final
		System.out.println("El numero float es: " + NumberFt + " y el numero double es: " + NumberDe);
		//Para los numeros exponenciales se definen de la siguiente manera
		float F1 = 35e3f;
		double D1 = 12E4D;
		System.out.println("El numero con exponente float es: " + F1 + " El numero con exponente double es: " + D1);
	}
}

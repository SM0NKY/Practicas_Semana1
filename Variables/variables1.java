public class Tipos_de_Variables{
	public static void main(String[] args){
		/* 
		Las  variables se escriben de la siguiente manera,  type variableName = value;
		Example:
		*/
		int Numero_entero;
		Numero_entero = 10; // Se puede hacer como en c++ de primero definir la variable pero no darle un valor
		System.out.println(Numero_entero);
		//A continuacion un valor en string, que es un arreglo de caracteres
		String Nombre;
		Nombre = "Jose";
		System.out.println(Nombre);
		// Cambiar el valor de una variable
		Numero_entero = 15;
		System.out.println(Numero_entero);
		// Se pueden declarar variables finales para que no se cambie el valor o parametros o atributos
		final int Numero_aleatorio = 10;
		System.out.println(Numero_aleatorio);
		//Otro tipo de variables son 
		int Number = 2; 
		float Number2 = 5.99f;
		char caracter = 'D';
		boolean Bool = true;
		String text= "Hello";
	}
}

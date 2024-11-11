import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner objeto = new Scanner(System.in);

		String texto_ingresado = objeto.nextLine();
		System.out.println(texto_ingresado);
		if (texto_ingresado.equals("si")){
			System.out.println("Opcion si");
		}
	}
}




public class Methods1{
	static void StatMeth(){
		// En este metodo no es necesario crear un objeto para llamar al metodo
		System.out.println("Metodo static");
	}
	public void PubMeth(){
		//En este metodo es necesario crear un objeto para llamar al metodo
		System.out.println("Metodo public");
	}
	public static void main(String[] args){
		StatMeth();
		Methods1 objeto = new Methods1();
		objeto.PubMeth();
	}
}

public class Constructor{
	int year;
	String Carname;
	public Constructor(int y, String Carn){
		year = y;
		Carname = Carn;
	}
	public static void main(String[] args){
		Constructor objeto = new Constructor(2010,"Mustang");
		System.out.println(objeto.year + " " + objeto.Carname);
	}
}

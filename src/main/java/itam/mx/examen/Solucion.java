package itam.mx.examen;

	public class Solucion {
		public boolean solucion(String unString){
			String auxiliar = "";
			int size = unString.length();
				for(int i=0;i<unString.length()/2;i++){
					String subString = unString.substring(0,i);
					auxiliar = unString.replaceAll(subString,"");
					if(auxiliar.equals("")){
						System.out.println(subString);
						return true;
					}
				}
				return false;
}
public static void main(String[] args) {
System.out.println(solucion("gustavogustavogustavo"));
System.out.println(solucion("aba"));
System.out.println(solucion("abab"));
System.out.println(solucion("1231231231231234"));
}
}
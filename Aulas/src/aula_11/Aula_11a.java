package aula_11;

public class Aula_11a {
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		// tolowerSase() Deixas toda string em minusculo.
		String s01 = original.toLowerCase();
		//toUpperCase() Deixa toda a string em maiusculo
		String s02 = original.toUpperCase();
		//trim() Elimina os espaços em brenco no inicio e no fim da String
		String s03 = original.trim();
		//substring() Corta a string a parti do caractere selecionado
		String s04 = original.substring(2);
		//substring() Corta a string a parti do caractere selecionado e termina no caractere selecionado
		String s05 = original.substring(2, 10);
		
		System.out.println("Original: " + "-" + original + "-");
		System.out.println("toLowerCase() :" + "-" + s01 + "-");
		System.out.println("toUpperCase() :" + "-" + s02 + "-");
		System.out.println("trim() :" + "-" + s03 + "-");
		System.out.println("substring(2) :" + "-" + s04 + "-");
		System.out.println("substring(2, 10) :" + "-" + s05 + "-");
	}
}

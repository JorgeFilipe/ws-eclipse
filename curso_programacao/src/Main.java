import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	  
		
		/*/ '\u0061' corresponde a letra 'a' na tabela unicode
		int \u0061=5,b=10;
		System.out.println("Operadores Aritm�ticos");
		System.out.println("Soma: "+ (a+b));
		System.out.println("Subtra��o: "+ (a-b));
		System.out.println("Multiplica��o: "+ (a*b));
		System.out.println("Divis�o: "+ (a/b));
		System.out.println("M�dulo: "+ (a%b));
		*/
			
		// <PF> Ponto Flutuante
		// importa��o necess�ria java.util.Locale
		
			double x = 10.35784;
			System.out.printf("%.2f%n", x);
			System.out.printf("%.4f%n", x);// O n�mero exibido est� com v�rgula por causa do idioma, no Portugues o separador de decimais � a v�rgula (,).
			
			Locale.setDefault(Locale.US); // Altera para o separador de decimais do idioma Ingl�s que � o ponto (.)
			System.out.printf("%.4f%n", x);
		//</PF>
	}

}

import java.util.Locale; /// importa��o para utilizar o Locale.setDefault

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
		
			
		// <PF> Ponto Flutuante
		// importa��o necess�ria java.util.Locale
		
			double x = 10.35784;
			double pi= 3.14159265;
			System.out.printf("Valor de PI: %.2f%n", pi);
			System.out.printf("Valor de PI: %.4f%n", pi);
			System.out.printf("Valor de PI: %.6f%n", pi);
			
			System.out.printf("Separador de decimais Brasil: %.4f%n", x);// O n�mero exibido est� com v�rgula por causa do idioma, no Portugues o separador de decimais � a v�rgula (,).
			
			Locale.setDefault(Locale.US); // Altera para o separador de decimais do idioma Ingl�s que � o ponto (.)
			System.out.printf("Separador de decimais dos Unite States: %.4f%n", x);
		//</PF>
		*/	
		
		
		/// Concatenando v�rios elementos em um mesmo comando de escrita:
		String nome = "Maria";
		int idade = 25;
		double salario = 4655.83;
		
		System.out.printf("%s tem %d anos e ganha R$ %.1f reais%n",nome,idade,salario);
		//*
	}

}

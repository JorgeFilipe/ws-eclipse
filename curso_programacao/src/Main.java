import java.util.Locale; /// importa��o para utilizar o Locale.setDefault

public class Main {

	/// AULA: 4. ESTRUTURA SEQUENCIAL
	
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
			
		
		
		/// Concatenando v�rios elementos em um mesmo comando de escrita:
		String nome = "Maria";
		int idade = 25;
		double salario = 4655.83;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,salario);
	
		
		
		
		/// Exerc�cio de fixa��o
		Locale.setDefault(Locale.US);
		String product1 = "Computer";
		String product2 = "Office Desk";
		int age = 22;
		int code = 7030;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 999.90;
		double measure = 53.234567;
		// Scenery
			System.out.printf("Products: %n"
			+ "%s, pay just U$%.2f "
			+ "%n %s, today for U$%.2f"
			+ "%n for women's clients with %d years present the code: %d in the market box for discount"
			+ "%n %n Measure: %f"
			+ "%n Rouded:%.3f",product1,price1,product2,price2,age,code,measure,measure);
		
		
		float area,b=6f,B=8f,h=5f;
		area=(((b+B)/2f)*h);
		System.out.print("Area = "+area);
		
		
		
		// CASTING = Convers�o expl�cita dos valores;
			int a,b;
			double resultado;
			a=5;
			b=2;
			resultado = (double) a/b; // CASTING aplicado aqui sem o (double) ir� retornar apenas 2.0 e n�o o valor decimal.
			System.out.println(resultado);
			double c;
			int d;
			c = 5.0;
			d = (int) c; // CASTING aplicado aqui convertendo double para inteiro n�o se importando com a poss�vel perda de informa��o
		
		*/	
		
	}

}

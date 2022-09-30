import java.util.Locale; /// importa��o para utilizar o Locale.setDefault
import java.util.Scanner;
import javax.swing.JOptionPane;

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
		
		/*Scanner sc = new Scanner(System.in);
		String nome;
		System.out.print("Informe um nome: ");
		nome = sc.next();
		System.out.println("Voc� digitou: "+ nome);
		sc.close();*/
		
		/*Scanner ler = new Scanner(System.in);
		int a,b;
		String login, senha, confLogin, confSenha;
		System.out.print("LOGIN: ");
		login = ler.next();
		System.out.print("SENHA: ");
		senha = ler.next();
		System.out.print("confirme o LOGIN: ");
		confLogin = ler.next();
		System.out.print("confirme a SENHA: ");
		confSenha = ler.next();
		ler.close();
		//System.out.println("L-"+login+" S-"+senha+" || "+"CL-"+confLogin+" CS-"+confSenha);
		
		if(login.equals(confLogin) && senha.equals(confSenha)) {
			// variavel.equals(variavel alvo da compara��o) --> como comparar String c/ String
			//System.out.println("Good job you are logged");
			JOptionPane.showMessageDialog(null,"Good job you are logged");
			System.out.print("Digite um valor para A: ");
			a = ler.nextInt();
			System.out.print("Digite um valor para B: ");
			b = ler.nextInt();
			ler.close();
			System.out.println("Soma: "+ (a+b) );
		}else {
			System.out.println("wrong");
		}*/
		
		
		/*Scanner ler = new Scanner(System.in);
		double a=10,b=5,x=2,y=6,raizquadrada,potenciacao, absoluto;
		raizquadrada = Math.sqrt(25);
		potenciacao = Math.pow(x, a);
		y=(y-a);
		absoluto = Math.abs(y);
		System.out.println(raizquadrada);
		System.out.println(potenciacao);
		System.out.println(absoluto);// Deixa positivo o valor de um c�lculo negativo
		*/
		
		// <> EXERC�CIOS DO M�DULO "ESTRUTURA SEQUENCIAL"
		//
		// Exerc�cio 01: Fa�a um programa para ler 2 valores inteiros, e 
		//               depois mostrar na tela a soma desses n�meros com
		//               uma mensagem explicativa, conforme exemplo:
		// _____________________________
		// |Entrada:      | Sa�da:      | 
		// |--------------|-------------|
		// |10			  |Soma = 40	|
		// |30			  |				|
		// |______________|_____________|
		//  ____________________________
		// |Entrada:      | Sa�da:      | 
		// |--------------|-------------|
		// |(-30)		  |Soma = (-20)	|
		// |10			  |				|
		// |______________|_____________|
		//
		// RESOLU��O:
		Scanner ler = new Scanner(System.in);	
		int a=0,b=0;
		a = ler.nextInt();
		b = ler.nextInt();
		
		// </> FIM "ESTRUTURA SEQUENCIAL"
		
	}

}

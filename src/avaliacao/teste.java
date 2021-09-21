package avaliacao;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int escolha;
		
		do {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("\n\nEscolha a quest�o:");
			System.out.println("1 - Quest�o 1: ");
			System.out.println("2 - Quest�o 2: ");
			System.out.println("3 - Quest�o 3: ");
			System.out.println("4 - Quest�o 4: ");
			System.out.println("5 - Quest�o 5: ");
			System.out.println("6 - Sair: ");
			
			escolha = scan.nextInt();
			
			switch (escolha) {
				case 1: {
					questao1();
					break;
				}
				case 2: {
					questao2();
					break;
				}
				case 3: {
					questao3();
					break;
				}
				case 4: {
					questao4();
					break;
				}
				case 5: {
					questao5();
					break;
				}
			}	

		} while (escolha != 6);	
		
	}
	
	public static void questao1() {
		
		Scanner scan = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		pessoa1.setNome(scan.next());
		
		System.out.print("Idade: ");
		pessoa1.setIdade(scan.nextInt());
		
		Pessoa pessoa2 = new Pessoa();
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		pessoa2.setNome(scan.next());
		
		System.out.print("Idade: ");
		pessoa2.setIdade(scan.nextInt());
		
		System.out.print("\n");
		
		System.out.print(Pessoa.idoso(pessoa1, pessoa2));	
	}
	
	public static void questao2() {
		
		Scanner scan = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		System.out.println("Dados do primeiro funcion�rio:");
		System.out.print("Nome: ");
		funcionario1.setNome(scan.next());
		
		System.out.print("Sal�rio: ");
		funcionario1.setSalario(scan.nextDouble());
		
		Funcionario funcionario2 = new Funcionario();
		System.out.println("Dados do segundo funcion�rio:");
		System.out.print("Nome: ");
		funcionario2.setNome(scan.next());
		
		System.out.print("Sal�rio: ");
		funcionario2.setSalario(scan.nextDouble());
		
		System.out.print("\n");
		
		System.out.print("Sal�rio m�dio: ");
		System.out.print(Funcionario.media(funcionario1.getSalario(), funcionario2.getSalario()));
	}
	
	public static void questao3() {
		Scanner scan = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Entre com a largura do ret�ngulo: ");
		retangulo.setLargura(scan.nextDouble());
		System.out.println("Entre com a altura do ret�ngulo: ");
		retangulo.setAltura(scan.nextDouble());
		
		System.out.printf("�REA: %.2f \n", retangulo.area());
		System.out.printf("PER�METRO: %.2f \n", retangulo.perimetro());
		System.out.printf("DIAGONAL: %.2f \n", retangulo.diagonal());
	}
	
	public static void questao4() {
		Scanner scan = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.print("Nome: ");
		funcionario.setNome(scan.next());	
		
		
		System.out.print("Sal�rio bruto: ");
		funcionario.setSalarioBruto(scan.nextDouble());
		
		System.out.print("Imposto: ");
		funcionario.setImposto(scan.nextDouble());		
		
		
		System.out.printf("\nFuncion�rio: %s, R$ %.2f\n", funcionario.getNome(), funcionario.salarioLiquido());
		
		System.out.print("Digite a porcentagem para aumentar o sal�rio: ");
		funcionario.aumentarSalario(scan.nextDouble());
		
		System.out.print("\n");
		
		System.out.printf("Dados atualizados: %s, R$ %.2f",funcionario.getNome(), funcionario.salarioLiquido());				
	}
	
	public static void questao5() {
		double alvo = 60;
		double nota;
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.print("Nome do Aluno: ");
		aluno.setNome(scan.next());	
		
		
		do {
			System.out.print("Nota do primeiro trimestre (at� 30 pts): ");
				nota = scan.nextDouble();
		} while (nota > 30);
		aluno.setNota1(nota);
		
		System.out.print("Nota do segundo trimestre: ");
		aluno.setNota2(scan.nextDouble());
		
		System.out.print("Nota do terceiro trimestre: ");
		aluno.setNota3(scan.nextDouble());
		
		double notaFinal = aluno.notaFinal();
		
		System.out.printf("\n", notaFinal);
		
		
		System.out.printf("NOTA FINAL = %.2f\n", notaFinal);
		aluno.setStatus();
		
		System.out.print("\n");
		
		System.out.print(aluno.getStatus());
		
		System.out.print("\n");
		
		if(notaFinal < alvo ) {
			System.out.printf("\nFALTARAM %.2f PONTOS", aluno.notaFaltante(notaFinal));
		}
	}
	
	

}

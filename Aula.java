import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		Scanner ruan = new Scanner(System.in);
		
		System.out.println("Digite o seu nome completo: ");
		String nome = ruan.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = ruan.nextInt();
		
		System.out.println("Nome: " +nome+ " Idade: " +idade);
				

	}

}
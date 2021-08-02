import java.util.Random;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Random random = new Random();
		int x = 0;
		int j = -1;
		
		while(x != j) {
			x = random.nextInt(8);
			System.out.println("Digite um número ");
			j = sc.nextInt();
			if(x != j) System.out.println("Você errou! Tente novamente!");
		}
		
		System.out.println("Parabéns! Você acertou!");
		

	}

}

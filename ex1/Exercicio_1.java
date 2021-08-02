import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;




public class Exercicio_1 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		List<Atleta> listaDeAtletas = new ArrayList<Atleta>();
		
		for(int i = 0; i < 10; i++) {
			Atleta a = new Atleta();
			System.out.printf("Digite o nome do atleta %d:", i+1);
			a.nome = sc.nextLine();
			System.out.printf("Digite o país do atleta %d:", i+1);
			a.pais = sc.nextLine();
			System.out.printf("Digite o resultado (em metros) do Atleta %d:",i+1);
			a.distancia = sc.nextInt();
			listaDeAtletas.add(a);
			sc.nextLine();
		}
		
		Collections.sort(listaDeAtletas, new ComparatorDistancia());
		
		System.out.println("Ouro: " + listaDeAtletas.get(0));
		System.out.println("Prata: " + listaDeAtletas.get(1));
		System.out.println("Bronze: " + listaDeAtletas.get(2));
	}
}

class ComparatorDistancia implements Comparator<Atleta> {
	@Override
	public int compare(Atleta a1, Atleta a2) {
		return Integer.compare(a1.getDistancia(), a2.getDistancia());
	}
}

package VendasCachorroQuente;

public class main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Caio", 553853);
		Proteina proteina1 = new Proteina("bacon");
		Queijo queijo1 = new Queijo("prato");
		Adicionais[] adicionais1 = new Adicionais[] {
				new Adicionais("Maionese"),
			    new Adicionais("Ketchup")
		};
		Bebida bebida1 = new Bebida("Suco do Chaves");
		CachorroQuente cachorroQuente1 = new CachorroQuente(proteina1, queijo1, adicionais1, bebida1);
		
		Vendas venda1 = new Vendas(aluno1, cachorroQuente1);
		
		
		Aluno aluno2 = new Aluno("Amanda", 554842);
		Proteina proteina2 = new Proteina("salsicha");
		Queijo queijo2 = new Queijo("mussarela");
		Adicionais[] adicionais2 = new Adicionais[] {
				new Adicionais("Maionese"),
				new Adicionais("Ketchup"),
				new Adicionais("Ovo"),
				new Adicionais("Batata Palha")
		};
		Bebida bebida2 = new Bebida("Coca-Cola");
		CachorroQuente cachorroQuente2 = new CachorroQuente(proteina2, queijo2, adicionais2, bebida2);

		
		Vendas venda2 = new Vendas(aluno2, cachorroQuente2);
		
		
		System.out.println("**Venda 1**" + "\nNome do aluno: " + aluno1.getNome() + "\nMatricula do aluno: " + aluno1.getMatricula());
		System.out.println("*Cachorro Quente* "+"\n" + proteina1.getNome() + "\n" + queijo1.getNome());
		for (Adicionais adicional : adicionais1) {
		    System.out.println(adicional.getNome());
		}
		System.out.println(bebida1.getNome());
		
		System.out.println("**Venda 2**" + "\nNome do aluno: " + aluno2.getNome() + "\nMatricula do aluno: " + aluno2.getMatricula());
		System.out.println("*Cachorro Quente* "+"\n" + proteina2.getNome() + "\n" + queijo2.getNome());
		for (Adicionais adicional : adicionais2) {
		    System.out.println(adicional.getNome());
		}
		System.out.println(bebida2.getNome());
	}
}

package VendasCachorroQuente;

public class Vendas {
	private Aluno aluno;
	private CachorroQuente cachorroQuente;
	
	public Vendas(Aluno aluno, CachorroQuente cachorroQuente) {
		this.aluno = aluno;
		this.cachorroQuente = cachorroQuente;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public CachorroQuente getCachorroQuente() {
		return cachorroQuente;
	}

	public void setCachorroQuente(CachorroQuente cachorroQuente) {
		this.cachorroQuente = cachorroQuente;
	}
	
	
}

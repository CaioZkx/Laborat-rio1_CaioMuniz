package VendasCachorroQuente;

public class CachorroQuente {
	private Proteina proteina;
	private Queijo queijo;
	private Adicionais[] adicionais;  
	private Bebida bebida;
	
	public CachorroQuente(Proteina proteina, Queijo queijo, Adicionais[] adicionais , Bebida bebida) {
		this.proteina = proteina;
		this.queijo = queijo;
		this.adicionais = adicionais;
		this.bebida = bebida;
	}
	
	public Proteina getProteina() {
		return proteina;
	}
	public void setProteina(Proteina proteina) {
		this.proteina = proteina;
	}
	public Queijo getQueijo() {
		return queijo;
	}
	public void setQueijo(Queijo queijo) {
		this.queijo = queijo;
	}

	public Adicionais[] getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(Adicionais[] adicionais) {
		this.adicionais = adicionais;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	
	
	
	
}

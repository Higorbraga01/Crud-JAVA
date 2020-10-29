import java.util.List;

public class Unidade {

	public Unidade() {
		super();
	}

	private String nome;
	private String endere�o;
	private List<Informacao> aeronaves;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public List<Informacao> getAeronaves() {

		if (this.aeronaves != null && !this.aeronaves.isEmpty()) {
			System.out.println(" - Aeronaves -");
			for (Informacao unidade : aeronaves) {
				unidade.exibirDados();
			}
		} else {
			System.out.println("sem aronaves para esta unidade");

		}
		return aeronaves;
	}

	public void setAeronaves(List<Informacao> aeronaves) {
		 this.aeronaves = aeronaves;
	}

	public void exibirDadosUnidade() {
		System.out.println("Dados da unidade ");
		System.out.println(" - Nome: " + this.nome);
		System.out.println(" - Endere�o: " + this.endere�o);
		System.out.println("-----------------------");
		this.getAeronaves();
	}

	public void exibirAeronavesDaunidade() {

	}

	@Override
	public String toString() {
		return this.getNome();
	}
}

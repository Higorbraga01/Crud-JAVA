import java.util.Date;
import java.util.List;

public class Aeronave {
	private String nome;
	private String modelo;
	private Date fabricacao;
	private List<Peca> pecas;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}

	public List<Peca> getPecas() {
		return pecas;
	}

	public void setPecas(List<Peca> pecas) {
		this.pecas = pecas;
	}

	public void exibirDadosPecas() {
		if (this.pecas != null && !this.pecas.isEmpty()) {
			System.out.println(" - Pecas: ");
			for (Peca peca : this.pecas) {
				System.out.println("	* Nome: " + peca.getNome() + " - Descriçao: " + peca.getDescricao());
			}
		}
	}

	public void exibirDadosPrincipais() {
		System.out.println(" - Nome: " + this.nome);
		System.out.println(" - Modelo: " + this.modelo);
		System.out.println(" - Fabricao: " + this.fabricacao);
	}

	@Override
	public String toString() {
		return this.getNome();
	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Aeronave other = (Aeronave) obj;
//		if (nome == null) {
//			if (other.nome != null)
//				return false;
//		} else if (!nome.equals(other.nome))
//			return false;
//		return true;
//	}
//	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
//		return result;
//	}
//	

}
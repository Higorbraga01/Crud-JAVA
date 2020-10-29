
public class Hercules extends Aeronave implements Informacao {
	private String capacidadeCarga;

	public Hercules() {
		super();
	}

	public String getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(String capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public void exibirDados() {
		System.out.println("Dados Hércules: ");
		this.exibirDadosPrincipais();
		System.out.println(" - Capacidade de Carga: " + this.capacidadeCarga);
		this.exibirDadosPecas();
	}
}
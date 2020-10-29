
public class Tucano extends Aeronave implements Informacao {
	private String velocidadeMaxima;

	public Tucano() {
		super();
	}

	public String getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(String velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public void exibirDados() {
		System.out.println("Dados Tucano: ");
		this.exibirDadosPrincipais();
		System.out.println(" - Velocidade Máxima: " + this.velocidadeMaxima);
		this.exibirDadosPecas();
	}
}
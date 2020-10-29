
public class Caravan extends Aeronave implements Informacao {
	private String modeloMotor;

	public Caravan() {
		super();
	}

	public String getModeloMotor() {
		return modeloMotor;
	}

	public void setModeloMotor(String modeloMotor) {
		this.modeloMotor = modeloMotor;
	}

	@Override
	public void exibirDados() {
		System.out.println("Dados Caravan: ");
		this.exibirDadosPrincipais();
		System.out.println(" - Modelo Motor: " + this.modeloMotor);
		this.exibirDadosPecas();
	}
}
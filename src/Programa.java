import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		Peca ph1 = new Peca();
		ph1.setNome("Motor 1");
		ph1.setDescricao("Motor Completo Full");
		
		Peca ph2 = new Peca();
		ph2.setNome("Motor 2");
		ph2.setDescricao("Motor Completo Full");
		List<Peca> pecasHercules = new ArrayList<>();
		pecasHercules.add(ph1);
		pecasHercules.add(ph2);
		
		Hercules h1 = new Hercules();
		h1.setNome("Lockheed Hércules C - 130");
		h1.setModelo("C - 130 H");
		h1.setCapacidadeCarga("50 T");
		h1.setFabricacao(new Date());
		h1.setPecas(pecasHercules);
		
		//===========================================
		
		Peca pc1 = new Peca();
		pc1.setNome("Motor");
		pc1.setDescricao("Motor Completo Full");
		List<Peca> pecasCaravan = new ArrayList<>();
		pecasCaravan.add(pc1);
		
		Caravan c1 = new Caravan();
		c1.setNome("Cesna Caravan");
		c1.setModelo("CHLDN");
		c1.setModeloMotor("Pratt & Whitney CJY1010");
		c1.setFabricacao(new Date());
		c1.setPecas(pecasCaravan);
		
		//===========================================
		
		Peca pt1 = new Peca();
		pt1.setNome("Motor");
		pt1.setDescricao("Motor Completo Full");
		List<Peca> pecasTucano = new ArrayList<>();
		pecasTucano.add(pt1);
		
		Tucano t1 = new Tucano();
		t1.setNome("Embraer Tucano");
		t1.setModelo("T-27");
		t1.setVelocidadeMaxima("800 Km/h");
		t1.setFabricacao(new Date());
		t1.setPecas(pecasTucano);
		
		//========= Painel p1 = h1   Painel p2 = c1   Painel p3 = t1  
		List<Informacao> lista = new ArrayList<>();
		lista.add(h1); //p1
		lista.add(c1); //p2
		lista.add(t1); //p3
		
		for (Informacao painel : lista) {
			painel.exibirDados();
			System.out.println(" ------------------------------------------------- ");
		}
	}
}
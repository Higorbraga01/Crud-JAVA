import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestaCadastro {

	// listas
	static List<Informacao> listaAeronaves = new ArrayList<>();
	static List<Unidade> listaUnidades = new ArrayList<>();
	static List<Informacao> aeronavesDaUnidade = new ArrayList<>();

	// obejetos
	
	
	// variaveis globais
	
	static Scanner leitura = new Scanner(System.in);
	static int menuCadastro;
	static int valorEscolhido;

	public static void main(String[] args) {
		
		int opcao;
		

		do {
			System.out.println("-          MENU INICIAL       -\n");
			System.out.println("-----------------------------------------------\n");
			System.out.println("1  - Cadastrar uma Aeronave\n");
			System.out.println("2  - Exibir Dados de Aeronaves Cadastradas\n");
			System.out.println("3  - Remover uma Aeronave Cadastrada\n");
			System.out.println("4  - Alterar dados de uma Aeronave Cadastrada\n");
			System.out.println("5  - Pesquisar uma Aeronave\n");
			System.out.println("6  - Cadastrar uma Unidade no Sistema\n");
			System.out.println("7  - Exibir Unidades cadastradas no Sistema\n");
			System.out.println("8  - Remover uma Unidade\n");
			System.out.println("9  - Alterar dados de uma unidade\n");
			System.out.println("10 - Cadastrar Aeronave em uma unidade\n");
			System.out.println("11 - exibir Aeronave em uma unidade\n");
			System.out.println("12 - Sair\n");

			System.out.print("Informe a opção: ");
			opcao = leitura.nextInt();
			System.out.println("-----------------------------------------------");
			if (opcao == 1) {
				menuCadastro();
			}
			if (opcao == 2) {
				System.out.println("      Aeronaves Cadastradas no sistema          \n");
				exibirAeronave();
			}
			if (opcao == 3) {
				System.out.println("      Aeronaves Cadastradas no sistema          \n");
				remover();

			}
			if (opcao == 4) {
				alterarDadosAeronave();
			}
			if (opcao == 5) {
				pesquisarAeronaves();
			}
			if (opcao == 6) {
				cadastrarUnidade();
			}
			if (opcao == 7) {
				exibirUnidades();
			}
			if (opcao == 8) {
				removerUnidade();
			}
			if (opcao == 9) {
				alterarDadosUnidade();
			}
			if(opcao == 10) {
				cadastrarAeronaveNaUnidade();
			}
			if(opcao == 11) {
				cadastrarAeronaveNaUnidade();
			}

		} while (opcao != 12);
		System.out.println("-        Encerrando Aplicação!       -");
		leitura.close();

	}

	public static void menuCadastro() {
		System.out.println("Escolha o tipo de Aeronave ");
		System.out.println("1 - Hercules | 2 - Caravan | 3 - Tucano");

		System.out.print("Informe a opção: ");
		menuCadastro = leitura.nextInt();

		if (menuCadastro == 1) {
			menuHercules();
		}
		if (menuCadastro == 2) {
			menuCaravan();
		}
		if (menuCadastro == 3) {
			menuTucano();
		}
	}

	public static void menuHercules() {
		System.out.print("Menu de Cadastro Hercules\n");
		Hercules h1 = new Hercules();
		System.out.print("Nome: ");
		h1.setNome(leitura.next());
		System.out.print("Modelo: ");
		h1.setModelo(leitura.next());
		h1.setFabricacao(new Date());
		System.out.print("Capacidade de Carga: ");
		h1.setCapacidadeCarga(leitura.next());
		listaAeronaves.add(h1);
		System.out.println("Cadastro Finalizado\n");
//		System.out.println("Deseja cadastrar esta Aeronave em uma unidade? 1 p/sim 2 p/não");
//		valorEscolhido = leitura.nextInt();
//		if (valorEscolhido == 1) {
//			cadastrarAeronaveNaUnidade();
//		}
//		if (valorEscolhido == 2) {
//			return;
//		}
	}

	public static void menuCaravan() {
		System.out.print("Menu de Cadastro Caravan\n");
		Caravan c1 = new Caravan();
		System.out.print("Nome: ");
		c1.setNome(leitura.next());
		System.out.print("Modelo: ");
		c1.setModelo(leitura.next());
		c1.setFabricacao(new Date());
		System.out.print("Modelo motor: ");
		c1.setModeloMotor(leitura.next());
		listaAeronaves.add(c1);
		System.out.println("Cadastro Finalizado\n");
	}

	public static void menuTucano() {
		System.out.print("Menu de Cadastro Tucano\n");
		Tucano t1 = new Tucano();
		System.out.print("Nome: ");
		t1.setNome(leitura.next());
		System.out.print("Modelo: ");
		t1.setModelo(leitura.next());
		t1.setFabricacao(new Date());
		System.out.print("Velocidade Maxima: ");
		t1.setVelocidadeMaxima(leitura.next());
		listaAeronaves.add(t1);
		System.out.println("Cadastro Finalizado\n");
	}

	public static void pegaPosicao() {
		int posicao = 0;
		if (listaAeronaves.isEmpty()) {
			System.out.println("- Nao existem Aeronaves a serem removidas! \n");
		}
		for (int i = 0; i < listaAeronaves.size(); i++) {
			System.out.println(posicao++ + " - " + listaAeronaves.get(i));
		}
	}

	public static void exibirAeronave() {
		if (listaAeronaves.isEmpty()) {
			System.out.println("- Nao existem Aeronaves Cadastradas no momento \n");
		}
		for (Informacao painel : listaAeronaves) {
			painel.exibirDados();

			System.out.println(" ------------------------------------------------- \n");
		}
	}

	public static void remover() {
		pegaPosicao();
		if (listaAeronaves.isEmpty() == false) {
			System.out.print("Informe o numero da aeronave a ser removida: ");
			listaAeronaves.remove(leitura.nextInt());
			System.out.println("Aeronave Removida com sucesso!! \n");
			return;
		}

	}

	public static void alterarDadosAeronave() {
		pegaPosicao();
		System.out.print("Informe o NUMERO da Aeronave que deseja alterar: ");
		Informacao aero = listaAeronaves.get(leitura.nextInt());

		if (aero instanceof Hercules) {
			Hercules h1 = (Hercules) aero;
			System.out.print("Digite o nome: ");
			h1.setNome(leitura.next());
			System.out.print("Digite o modelo: ");
			h1.setModelo(leitura.next());
			System.out.print("Digite a Capacidade de Carga: ");
			h1.setCapacidadeCarga(leitura.next());

		}
		if (aero instanceof Caravan) {
			Caravan c1 = (Caravan) aero;
			System.out.print("Nome: ");
			c1.setNome(leitura.next());
			System.out.print("Modelo: ");
			c1.setModelo(leitura.next());
			System.out.print("Modelo motor: ");
			c1.setModeloMotor(leitura.next());

		}
		if (aero instanceof Tucano) {
			Tucano t1 = (Tucano) aero;
			System.out.print("Nome: ");
			t1.setNome(leitura.next());
			System.out.print("Modelo: ");
			t1.setModelo(leitura.next());
			System.out.print("Velocidade Maxima: ");
			t1.setVelocidadeMaxima(leitura.next());
		}
	}

	public static void pesquisarAeronaves() {
		String valorProcurado;
		System.out.println("Digite o Nome ou Modelo da Aeronave que deseja procurar: ");
		valorProcurado = leitura.next();

		for (Informacao pesquisa : listaAeronaves) {
			if (pesquisa.getNome().toLowerCase().contains(valorProcurado)
					|| pesquisa.getModelo().toLowerCase().contains(valorProcurado)) {
				pesquisa.exibirDados();
			} else
				System.out.println("Aeronave nao encontrada!!");
			return;

		}
	}

	public static void cadastrarAeronaveNaUnidade() {
		pegaPosicaoUnidade();
		System.out.println("Escolha em qual unidade deseja cadstrar esta aeronve: ");
		Unidade uni = listaUnidades.get(leitura.nextInt());

		pegaPosicao();
		System.out.println("Escolha o NUMERO  da Aeronave que deseja cadastrar: ");
		Informacao aero = listaAeronaves.get(leitura.nextInt());
	 
	   
		List<Informacao> aeronaveUnidade = new ArrayList<>();
		aeronaveUnidade.add(aero);
		uni.setAeronaves(aeronaveUnidade);
//		if (aero instanceof Hercules) {1
//			Hercules h1 = (Hercules) aero;
//			
//			aeronavesDaUnidade.add(h1);
//			uni.setAeronaves(aeronavesDaUnidade);
//
//		}
//		if (aero instanceof Caravan) {
//			Caravan c1 = (Caravan) aero;
//			
//			aeronavesDaUnidade.add(c1);
//			uni.setAeronaves(aeronavesDaUnidade);
//		}
//		if (aero instanceof Tucano) {
//			Tucano t1 = (Tucano) aero;
//		
//			aeronavesDaUnidade.add(t1);
//			uni.setAeronaves(aeronavesDaUnidade);
//		}
		System.out.println("Cadastro Finalizado!! ");
	}

	public static  void cadastrarUnidade() {
		Unidade uni = new Unidade();
		System.out.print("Nome: ");
		uni.setNome(leitura.next());
		System.out.print("Endereço: ");
		uni.setEndereço(leitura.next());
		listaUnidades.add(uni);
		System.out.println("Cadastro Finalizado! ");
//		System.out.print("Menu de Cadastro Caravan\n");
//		Caravan c1 = new Caravan();
//		System.out.print("Nome: ");
//		c1.setNome(leitura.next());
//		System.out.print("Modelo: ");
//		c1.setModelo(leitura.next());
//		c1.setFabricacao(new Date()); 
//		System.out.print("Modelo motor: ");
//		c1.setModeloMotor(leitura.next());
//		
//		aeronavesDaUnidade.add(c1);
//		System.out.println("Cadastro Finalizado\n");
//		uni.setAeronaves(aeronavesDaUnidade);

	}

	public static void exibirUnidades() {
		if (listaUnidades.isEmpty()) {
			System.out.println("Não há Unidade cadastrada no momento! ");
		}
		for (Unidade unidade : listaUnidades) {
			unidade.exibirDadosUnidade();
		}
	}

	public static void pegaPosicaoUnidade() {
		int posicao = 0;
		if (listaUnidades.isEmpty()) {
			System.out.println("- Nao existem Unidades cadastradas no momento! \n");
			return;
		} else {
			for (int i = 0; i < listaUnidades.size(); i++) {
				System.out.println(posicao++ + " - " + listaUnidades.get(i));
			}
		}
	}

	public static void removerUnidade() {
		pegaPosicaoUnidade();
		if (listaUnidades.isEmpty() == false) {
			System.out.print("Informe o numero da Unidade a ser removida: ");
			listaUnidades.remove(leitura.nextInt());
			System.out.println("Unidade Removida com sucesso!! \n");
			return;
		}

	}

	public static void alterarDadosUnidade() {
		pegaPosicaoUnidade();
		if (listaUnidades.isEmpty() == false) {
			System.out.print("Informe o NUMERO da Aeronave que deseja alterar: ");

			Unidade uni = listaUnidades.get(leitura.nextInt());

			if (uni instanceof Unidade) {
				Unidade unidade = (Unidade) uni;
				System.out.print("Digite o nome: ");
				unidade.setNome(leitura.next());
				System.out.print("Digite o endereço: ");
				unidade.setEndereço(leitura.next());
				System.out.println("Dados alterados com sucesso ! ! !");

			}
		} else {
			return;
		}
	}

}

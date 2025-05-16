package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
//import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	
	public static void main(String[] args) {
		
		Cozinheiro cozinheiro = new Cozinheiro();
		
		// ações que não precicam estar disponiveis para toda aplicação
		// cozinheiro.lavarIngredientes();
		// cozinheiro.baterVitaminaLiquidificador();
		// cozinheiro.selecionarIngredientesVitamina();
		// cozinheiro.prepararLanche();
		// cozinheiro.prepararVitamina();
		
		// ações que estabelecimiento precisa ter ciência.
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		//Almoxarife almoxarife = new Almoxarife();
		
		// ações que não precicam estar disponiveis para toda aplicação
		// almoxarife.controlarEntrada();
		// almoxarife.controlarSaida();
		
		// ações que somente o seu pacote cozinha precisa conheer (Default)
		// almoxarife.entregarIngredientes();
		// almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		
		// atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		// ações que somente o seu pacote cozinha precisa conhecer (Default)
		// atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		// Não deveria, mas o estabelecimiento
		// ainda não definiu normas de atendimiento
		// cliente.pegarPedidoBalcao();
		
		//Está ação é muito sigilosa, que tal ser privada?
		// cliente.consultarSaldoAplicativo();
		
		// Já pensou os clientes ouvindo que o gás acabou?
		// cozinheiro.pedirParaTrocarGas(atendente);
		// cozinheiro.pedirParaTrocarGas(almoxarife);
			
	}

}

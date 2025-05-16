package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	
	// Pode ser Default
	public void adicionarLancheNoBalcao() {		
		System.out.println("ADICIONNDO LANCHE NATURAL HANBURGER NO BALCÂO");		
	}

	// Pode ser Default
	public void adicionarSucoNoBalcao() {		
		System.out.println("ADICIONNDO SUCO NO BALCÂO");		
	}
	
	// Pode ser Default
	public void adicionarComboNoBalcao() {		
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	// Pode ser Default
	private void prepararLanche() {		
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");		
	}
	
	// Pode ser Default
	private void prepararVitamina() {		
		System.out.println("PREPARANDO SUCO");		
	}
	
	private void prepararCombo() {		
		prepararLanche();
		prepararVitamina();
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÂO, SALADA, OVO E CARNE");		
	}
	
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");		

	}
	
	// Pode ser Default
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");		
	}
	
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");		
	}
	
	
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGUER");		
	}
	
	// public void pedirParaTrocarGas(Atendente meuAmigo) {
	//	meuAmigo.trocarGas();				
	// }
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();				
	}
	
	private void pedirIngredientess(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();				
	}
		
}

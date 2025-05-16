
public class SistemaCadastro {
	
	public static void main(String[] args) {
		
		// Criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("12345", "MARCOS");
		
		// definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		// e como definir o nome e cpf do marcos?
		
		// imprimindo o marsco sem o ome e cpf
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
		
	}

}

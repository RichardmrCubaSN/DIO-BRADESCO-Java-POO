
public class Pessoa {
	
	private String nome;
	private String cpf;
	private String endereco;
	
	// método costrutor
	// o nome deverá ser igual ao nome classe
	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome =nome;		
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public String getCpf() {
		return cpf;
	
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String newEndereco) {
		endereco = newEndereco;
	}
	
	

}

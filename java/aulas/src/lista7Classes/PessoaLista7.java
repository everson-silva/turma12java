package lista7Classes;

public class PessoaLista7 {
	
	private String nome; 
	private String endereço;
	private String telefone;
	
	public PessoaLista7() 
	{
	}
	
	

	public PessoaLista7(String nome) {
		super();
		this.nome = nome;
	}



	public PessoaLista7(String nome, String endereço) 
	{
		this.nome = nome;
		this.endereço = endereço;
	}

	public PessoaLista7(String nome, String endereço, String telefone) 
	{
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	


}

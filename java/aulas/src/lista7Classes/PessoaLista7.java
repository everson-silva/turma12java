package lista7Classes;

public class PessoaLista7 {
	
	private String nome; 
	private String enderešo;
	private String telefone;
	
	public PessoaLista7() 
	{
	}
	
	

	public PessoaLista7(String nome) {
		super();
		this.nome = nome;
	}



	public PessoaLista7(String nome, String enderešo) 
	{
		this.nome = nome;
		this.enderešo = enderešo;
	}

	public PessoaLista7(String nome, String enderešo, String telefone) 
	{
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	


}

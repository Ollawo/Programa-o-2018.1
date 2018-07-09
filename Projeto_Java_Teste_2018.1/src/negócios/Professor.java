package negócios;

public class Professor extends Usuario
{
	private String nome;
	private String matricula;
	private String senha;
	
	 
	public Professor(String Nome, String Matricula, String Senha)
	{
		this.nome = Nome;
		this.matricula = Matricula;
		this.senha = Senha;	
	}
	

	public String getNome() 
	{
		return nome;
	}


	public void setNome(String nome) 
	{
		this.nome = nome;
	}


	public String getMatricula() 
	{
		return matricula;
	}



	public String getSenha() 
	{
		return senha;
	}

	@Override
	public String toString() {
		return "Usuario_Professor [" + getNome() + ", Matricula = " + getMatricula() + ", Senha = " + getSenha() + "]";
	}
	
}
package negócios;

public class Usuario 
{
	private String nome;
	private String matricula;
	private String login;
	private String senha;
	
	public Usuario()
	{
	
	}
		
	public void Cadastro(String Nome, String Matricula, String Login,String Senha)
	{
		this.nome = Nome;
		this.matricula = Matricula;
		this.login = Login;
		this.senha = Senha;
	}
	
	public String getLogin() 
	{
		return login;
	}
	
	public String getSenha() 
	{
		return senha;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", matricula=" + matricula + ", login=" + login + ", senha=" + senha + "]";
	}
	
}

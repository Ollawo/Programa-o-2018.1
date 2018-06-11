package negócios;

public class Login 
{
	private String login;
	private String senha;
	
	public Login()
	{
		
	}

	public  void efetuarLogin(String login,String senha, Usuario usuario)
	{
		if(login.equals(usuario.getLogin()) && senha.equals(usuario.getSenha()))
		{
			System.out.println("Login efeturado com Sucesso!");
		}
		else
		{
			System.out.println("Usuario Invalido");
		}
	}
	
	
	public String getLogin() 
	{
		return login;
	}

	public String getSenha() 
	{
		return senha;
	}

	
}

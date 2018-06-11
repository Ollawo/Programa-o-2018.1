package negócios;

public class Fachada 
{
	private Controller_Fachada controller;
	private static Fachada instance;
	
	public Fachada() 
	{
		controller = new Controller_Fachada();
	}
	
	public static Fachada getInstance()
	{
		if (Fachada.instance == null)
		{
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	public void Cadastro(Usuario usuario) 
	{
		controller.Cadastro(usuario);
	}
	
	public void Login(Login login)
	{
		controller.EfetuarLogin(login);
	}
	
	public void Teste(Usuario usuario, int numeroTentativas, int numeroAcertos, double nota)
	{
		controller.gerarTeste(usuario, numeroTentativas, numeroAcertos, nota);
	}
}

package neg�cios;

import nego�cos_dados.Interface_Reposit�iro_Teste;
import repositorio.Implementa��o_Reposit�rio_Teste;

public class Controller_Fachada 
{
	Interface_Reposit�iro_Teste controller = new Implementa��o_Reposit�rio_Teste();
	
	public void Cadastro(Usuario usuario) 
	{
		controller.inserirPessoa(usuario);
		
	}
	public void EfetuarLogin(Login login) 
	{
		controller.verificarLogin(login);
	}
	
	public void gerarTeste(Usuario usuario, int numeroTentativas, int numeroAcertos, double nota) 
	{
		controller.iniciarTeste(usuario, numeroTentativas, numeroAcertos, nota);
	}
}

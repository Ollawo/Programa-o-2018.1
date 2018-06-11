package negócios;

import negoócos_dados.Interface_Repositóiro_Teste;
import repositorio.Implementação_Repositório_Teste;

public class Controller_Fachada 
{
	Interface_Repositóiro_Teste controller = new Implementação_Repositório_Teste();
	
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

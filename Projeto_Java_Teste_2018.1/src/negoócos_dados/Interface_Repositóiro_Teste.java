package nego�cos_dados;

import neg�cios.Login;
import neg�cios.Usuario;

public interface Interface_Reposit�iro_Teste 
{
	public void inserirPessoa(Usuario usuario);
	public void verificarLogin(Login login);
	public void iniciarTeste(Usuario pessoa, int numeroTentativas, int numeroAcertos, double nota);
}

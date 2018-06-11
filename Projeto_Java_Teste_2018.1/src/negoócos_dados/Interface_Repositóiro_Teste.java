package negoócos_dados;

import negócios.Login;
import negócios.Usuario;

public interface Interface_Repositóiro_Teste 
{
	public void inserirPessoa(Usuario usuario);
	public void verificarLogin(Login login);
	public void iniciarTeste(Usuario pessoa, int numeroTentativas, int numeroAcertos, double nota);
}

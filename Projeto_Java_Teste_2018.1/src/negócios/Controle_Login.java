package neg�cios;

import neg�cios_dados.Reposit�rio_Login;
import repositorio.Reposit�rioLoginArray;

public class Controle_Login 
{
	Reposit�rio_Login loginc = new Reposit�rioLoginArray();
	
	public Aluno efetuarLogin(Login login, Aluno[] alunos) 
	{
		return loginc.efetuarLogin(login, alunos);
	}
	
	public Aluno procurar(Login login) 
	{
		return loginc.procurar(login);
	}
	
	public Professor efetuarLogin(Login login, Professor[] professores)
	{
		return loginc.efetuarLogin(login, professores);
	}

	public Professor procurarProfessor(Login login)
	{
		return loginc.procurarProfessor(login);
	}
}

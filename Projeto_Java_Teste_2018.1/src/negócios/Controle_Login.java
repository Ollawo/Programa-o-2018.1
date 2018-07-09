package negócios;

import negócios_dados.Repositório_Login;
import repositorio.RepositórioLoginArray;

public class Controle_Login 
{
	Repositório_Login loginc = new RepositórioLoginArray();
	
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

package neg�cios_dados;

import neg�cios.Aluno;
import neg�cios.Login;
import neg�cios.Professor;


public interface Reposit�rio_Login 
{
	public Aluno efetuarLogin(Login login, Aluno[] alunos);
	public Aluno procurar(Login login);
	public Professor efetuarLogin(Login login, Professor[] professores);
	public Professor procurarProfessor(Login login);
}

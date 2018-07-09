package negócios_dados;

import negócios.Aluno;
import negócios.Login;
import negócios.Professor;


public interface Repositório_Login 
{
	public Aluno efetuarLogin(Login login, Aluno[] alunos);
	public Aluno procurar(Login login);
	public Professor efetuarLogin(Login login, Professor[] professores);
	public Professor procurarProfessor(Login login);
}

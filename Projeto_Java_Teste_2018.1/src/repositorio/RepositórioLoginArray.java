package repositorio;

import neg�cios.Login;
import neg�cios.Usuario;
import neg�ciosdados.Reposit�rioLogin;

import java.util.Arrays;

import neg�cios.Aluno;
import neg�cios.Fachada;
import neg�cios.Professor;


public class Reposit�rioLoginArray implements Reposit�rioLogin
{
	private Aluno[] alunos;
	private Professor[] professores;
	
	public Aluno efetuarLogin(Login login, Aluno[] alunos) 
	{
		this.alunos = alunos;
		Aluno alunoRetorno = procurar(login);
		
		if(alunoRetorno instanceof Aluno )
		{
			if((login.getLogin().equals(((Aluno) alunoRetorno).getMatricula()) && login.getSenha().equals(((Aluno) alunoRetorno).getSenha())))
			{
				System.out.println("1 Login Aluno efeturado com Sucesso!-> chamada tela TESTE");
				System.out.println();
				return alunoRetorno;
			}
			
		}
		return null;
	}
	
	public Aluno procurar(Login login) 
	{
		Aluno alunoRetorno = null;
        for (Aluno aluno :alunos) 
        {
            if (aluno.getMatricula().equals(login.getLogin())) 
            {
                alunoRetorno = aluno;
            }
        }
        return alunoRetorno;
    } 
	
	public Professor efetuarLogin(Login login, Professor[] professores) 
	{
		this.professores= professores;
		Professor professorRetorno = procurarProfessor(login);
		
		if( professorRetorno instanceof Professor)		
		{
			if((login.getLogin().equals(((Professor) professorRetorno).getMatricula()) && login.getSenha().equals(((Professor) professorRetorno).getSenha())))
			{
				System.out.println("2 Login Professor efeturado com Sucesso!-> chamada tela Relatorio");
				
				return professorRetorno;
				
			}
		}
		return null;
	}
	
	public Professor procurarProfessor(Login login) 
	{
		Professor professorRetorno = null;
        for (Professor professor :professores) 
        {
            if (professor.getMatricula().equals(login.getLogin())) 
            {
                professorRetorno = professor;
            }
        }
        return professorRetorno;
    } 
}

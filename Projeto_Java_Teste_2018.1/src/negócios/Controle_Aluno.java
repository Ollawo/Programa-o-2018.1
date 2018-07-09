package negócios;

import negócios_dados.Repositório_Aluno;
import repositorio.RepositórioAlunoArray;


public class Controle_Aluno 
{
	Repositório_Aluno aluno = new RepositórioAlunoArray();
	
	
	public void cadastrar(Aluno usuario) 
	{
		aluno.inserir(usuario);		
	}
	
	public Aluno procurar(Aluno usuario)
	{
		return aluno.procurar(usuario);
	}
	
	public void atualizar (Aluno usuario1,Aluno usuario2)
	{
		aluno.atualizar(usuario1, usuario2);
	}
	public void remover (Aluno usuario) 
	{
		aluno.remover(usuario);
	}
	public Aluno[] getArray()
	{
		return aluno.getArray();
	}
	
	
}

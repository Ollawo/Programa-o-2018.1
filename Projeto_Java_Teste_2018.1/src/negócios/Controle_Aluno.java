package neg�cios;

import neg�cios_dados.Reposit�rio_Aluno;
import repositorio.Reposit�rioAlunoArray;


public class Controle_Aluno 
{
	Reposit�rio_Aluno aluno = new Reposit�rioAlunoArray();
	
	
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

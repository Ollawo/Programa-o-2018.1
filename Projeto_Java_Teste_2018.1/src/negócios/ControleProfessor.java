package neg�cios;

import neg�cios_dados.Reposit�rio_Professor;
import repositorio.Reposit�rioProfessorArray;

public class Controle_Professor 
{
	Reposit�rio_Professor professor = new Reposit�rioProfessorArray();
	
	
	public void cadastrar(Professor usuario) 
	{
		professor.inserir(usuario);		
	}
	
	public Professor procurar(Professor usuario)
	{
		return professor.procurar(usuario);
	}
	
	public void atualizar (Professor usuario1,Professor usuario2)
	{
		professor.atualizar(usuario1, usuario2);
	}
	public void remover (Professor usuario) 
	{
		professor.remover(usuario);
	}
	
	public Professor[] getArrayP()
	{
		return professor.getArrayP();
	}
}

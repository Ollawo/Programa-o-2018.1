package neg�ciosdados;

import neg�cios.Professor;

public interface Reposit�rioProfessor 
{
	public void inserir(Professor usuario);
	public Professor procurar(Professor usuario);
	public void atualizar(Professor usuario1,Professor usuario2);
	public void remover(Professor usuario);
	public Professor[] getArrayP();
}

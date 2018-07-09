package negócios_dados;

import negócios.Professor;

public interface Repositório_Professor 
{
	public void inserir(Professor usuario);
	public Professor procurar(Professor usuario);
	public void atualizar(Professor usuario1,Professor usuario2);
	public void remover(Professor usuario);
	public Professor[] getArrayP();
}

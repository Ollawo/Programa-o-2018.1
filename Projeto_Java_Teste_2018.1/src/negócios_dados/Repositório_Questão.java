package neg�cios_dados;

import neg�cios.Quest�o;

public interface Reposit�rio_Quest�o 
{
	public void inserir(Quest�o Questao);
	public Quest�o procurar(Quest�o Questao);
	public void atualizar(Quest�o Questao1,Quest�o Questao);
	public void remover(Quest�o Questao);
	public Quest�o[] getArray();
}

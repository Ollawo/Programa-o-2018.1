package neg�ciosdados;

import neg�cios.Quest�o;

public interface Reposit�rioQuest�o 
{
	public void inserir(Quest�o Questao);
	public Quest�o procurar(Quest�o Questao);
	public void atualizar(Quest�o Questao1,Quest�o Questao);
	public void remover(Quest�o Questao);
	public Quest�o[] getArray();
}

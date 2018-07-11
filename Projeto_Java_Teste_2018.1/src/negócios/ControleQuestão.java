package neg�cios;

import neg�ciosdados.Reposit�rioQuest�o;
import repositorio.Reposit�rioQuest�oArray;

public class ControleQuest�o 
{
	Reposit�rioQuest�o questao = new Reposit�rioQuest�oArray();
	
	public void cadastrar(Quest�o Questao) 
	{
		questao.inserir(Questao);
	}
	
	public Quest�o procurar(Quest�o Questao)
	{
		return questao.procurar(Questao);
	}
	
	public void atualizar(Quest�o Questao1,Quest�o Questao2)
	{
		questao.atualizar(Questao1, Questao2);
	}
	
	public void remover(Quest�o Questao)
	{
		questao.remover(Questao);
	}
	
	public Quest�o[] getArray()
	{
		return questao.getArray();
	}
}

package negócios;

import negóciosdados.RepositórioQuestão;
import repositorio.RepositórioQuestãoArray;

public class ControleQuestão 
{
	RepositórioQuestão questao = new RepositórioQuestãoArray();
	
	public void cadastrar(Questão Questao) 
	{
		questao.inserir(Questao);
	}
	
	public Questão procurar(Questão Questao)
	{
		return questao.procurar(Questao);
	}
	
	public void atualizar(Questão Questao1,Questão Questao2)
	{
		questao.atualizar(Questao1, Questao2);
	}
	
	public void remover(Questão Questao)
	{
		questao.remover(Questao);
	}
	
	public Questão[] getArray()
	{
		return questao.getArray();
	}
}

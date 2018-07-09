package negócios;

import negócios_dados.Repositório_Questão;
import repositorio.RepositórioQuestãoArray;

public class Controle_Questão 
{
	Repositório_Questão questao = new RepositórioQuestãoArray();
	
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

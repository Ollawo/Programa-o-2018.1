package negóciosdados;

import negócios.Questão;

public interface RepositórioQuestão 
{
	public void inserir(Questão Questao);
	public Questão procurar(Questão Questao);
	public void atualizar(Questão Questao1,Questão Questao);
	public void remover(Questão Questao);
	public Questão[] getArray();
}

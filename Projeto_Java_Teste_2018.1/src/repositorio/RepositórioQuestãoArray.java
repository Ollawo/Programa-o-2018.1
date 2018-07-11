package repositorio;

import negócios.Questão;
import negóciosdados.RepositórioQuestão;

public class RepositórioQuestãoArray implements RepositórioQuestão
{
	private Questão[] questoes;
	private String perguntaPadrao = "vazio"; // texto da pergunta
	private String[] opcoesPadrao = {"vazio","vazio","vazio","vazio","vazio"} ; // opções de resposta
	private String respostaPadrao ="vazio" ; // texto da resposta
	
	private int indice;
	
	private final static int TAMANHO=5;
	
	public RepositórioQuestãoArray() 
	{
		this.questoes = new Questão[TAMANHO];
		this.indice = 0;
		
		Questão questaoPadrao = new Questão(this.perguntaPadrao, this.opcoesPadrao, this.respostaPadrao);
        
		for (int i = 0 ; i<questoes.length; i++) 
        {
        	this.questoes[i] = questaoPadrao;
        }
	}
	public void inserir(Questão Questao) 
	{
		if(indice==0)
		{
			this.questoes[indice] = Questao;
			this.indice = this.indice + 1;
			System.out.println("Sucesso!");
		}
		
		else
		{
			Questão questaoTemp = procurar(Questao);
			
			if(questaoTemp != null)
			{
				System.out.println("Erro!");
				//retorno deve ser um boolean true or false para dizer se cadastrou ou nao
			}
			
			else
			{
				this.questoes[indice] = Questao;
				this.indice = this.indice + 1;
				System.out.println("Sucesso!");
			}
		}			
	}

	public Questão procurar(Questão Questao) 
	{
		Questão questaoRetorno = null;
		for(Questão questao: questoes)
		{
			if(questao.getPergunta().equals(Questao.getPergunta()))
			{
				questaoRetorno = questao;
			}
		}
		return questaoRetorno;
	}

	public void atualizar(Questão Questao1, Questão Questao2) 
	{
		Questão questaoRetorno = procurar(Questao1);
		
		for (int i = 0 ; i<questoes.length; i++) 
        {
        	if(questaoRetorno.equals(questoes[i]))
    		{
        		this.questoes[i] = Questao2;
    		}
        }		
	}

	@Override
	public void remover(Questão Questao) 
	{
		Questão questaoPadrao = new Questão(this.perguntaPadrao, this.opcoesPadrao, this.respostaPadrao);
		
		Questão questaoRemovida = procurar(Questao);
		
		for (int i = 0 ; i<questoes.length; i++) 
        {
        	if(questaoRemovida.equals(questoes[i]))
    		{
        		this.questoes[i] = questaoPadrao;
    		}
        }
	}
	public Questão[] getArray()
	{
		return this.questoes;
	}

}

package repositorio;

import neg�cios.Quest�o;
import neg�ciosdados.Reposit�rioQuest�o;

public class Reposit�rioQuest�oArray implements Reposit�rioQuest�o
{
	private Quest�o[] questoes;
	private String perguntaPadrao = "vazio"; // texto da pergunta
	private String[] opcoesPadrao = {"vazio","vazio","vazio","vazio","vazio"} ; // op��es de resposta
	private String respostaPadrao ="vazio" ; // texto da resposta
	
	private int indice;
	
	private final static int TAMANHO=5;
	
	public Reposit�rioQuest�oArray() 
	{
		this.questoes = new Quest�o[TAMANHO];
		this.indice = 0;
		
		Quest�o questaoPadrao = new Quest�o(this.perguntaPadrao, this.opcoesPadrao, this.respostaPadrao);
        
		for (int i = 0 ; i<questoes.length; i++) 
        {
        	this.questoes[i] = questaoPadrao;
        }
	}
	public void inserir(Quest�o Questao) 
	{
		if(indice==0)
		{
			this.questoes[indice] = Questao;
			this.indice = this.indice + 1;
			System.out.println("Sucesso!");
		}
		
		else
		{
			Quest�o questaoTemp = procurar(Questao);
			
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

	public Quest�o procurar(Quest�o Questao) 
	{
		Quest�o questaoRetorno = null;
		for(Quest�o questao: questoes)
		{
			if(questao.getPergunta().equals(Questao.getPergunta()))
			{
				questaoRetorno = questao;
			}
		}
		return questaoRetorno;
	}

	public void atualizar(Quest�o Questao1, Quest�o Questao2) 
	{
		Quest�o questaoRetorno = procurar(Questao1);
		
		for (int i = 0 ; i<questoes.length; i++) 
        {
        	if(questaoRetorno.equals(questoes[i]))
    		{
        		this.questoes[i] = Questao2;
    		}
        }		
	}

	@Override
	public void remover(Quest�o Questao) 
	{
		Quest�o questaoPadrao = new Quest�o(this.perguntaPadrao, this.opcoesPadrao, this.respostaPadrao);
		
		Quest�o questaoRemovida = procurar(Questao);
		
		for (int i = 0 ; i<questoes.length; i++) 
        {
        	if(questaoRemovida.equals(questoes[i]))
    		{
        		this.questoes[i] = questaoPadrao;
    		}
        }
	}
	public Quest�o[] getArray()
	{
		return this.questoes;
	}

}

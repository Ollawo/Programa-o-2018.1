package negócios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner; 

public class Questão 
{	
	private String pergunta; // texto da pergunta
	private String[] opcoes; // opções de resposta
	private String resposta; // texto da resposta
	private Questão[] questao;
	
	
	  
	public Questão()
	{
		
	}
	public void gerarQuestao(String pergunta, String[] opcoes, String resposta)
	{
		this.pergunta = pergunta;
		this.opcoes = opcoes;
		this.resposta = resposta;
	}
	
	@Override
	public String toString() 
	{
		return pergunta +"\n" + Arrays.toString(opcoes) + "\n"+ resposta+"\n"+"\n";
	}
	public String getQuestao() 
	{
		return Arrays.toString(questao);
	}
	public void setQuestao(Questão[] questao) 
	{
		this.questao = questao;
	}
	public String getPergunta()
	{
		return pergunta;
	}

	public String[] getOpcoes() 
	{
		return opcoes;
	}

	public String getResposta() 
	{
		return resposta;
	}
	


}


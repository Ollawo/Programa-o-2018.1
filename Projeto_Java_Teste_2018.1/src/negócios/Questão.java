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
	
	
	  
	public Questão(String pergunta, String[] opcoes, String resposta)
	{
		this.pergunta = pergunta;
		this.opcoes = opcoes;
		this.resposta = resposta;
	}

	public String getPergunta() 
	{
		return pergunta;
	}

	public void setPergunta(String pergunta) 
	{
		this.pergunta = pergunta;
	}

	public String[] getOpcoes() 
	{
		return opcoes;
	}

	public void setOpcoes(String[] opcoes) 
	{
		this.opcoes = opcoes;
	}

	public String getResposta() 
	{
		return resposta;
	}

	public void setResposta(String resposta) 
	{
		this.resposta = resposta;
	}

	@Override
	public String toString() 
	{
		return pergunta +"\n" + Arrays.toString(opcoes) + "\n"+ resposta+"\n"+"\n";
	}
	
}


package repositorio;

import neg�cios.Quest�o;
import neg�cios.Teste;
import neg�ciosdados.Reposit�rioTeste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import neg�cios.Aluno;

public class Reposit�rioTesteArray implements Reposit�rioTeste
{
	private Teste[] testes;
	private int indice;
	
	private final static int TAMANHO=5;
	
	Scanner input = new Scanner(System.in);
	
	public Reposit�rioTesteArray() 
	{
		this.testes = new Teste[TAMANHO];
		this.indice = 0;
		
		Aluno alunoPadrao = new Aluno("vazio","vazio","vazio");
        Teste TestePadrao = new Teste(alunoPadrao);
	
		for (int i = 0 ; i<testes.length; i++) 
        {
        	this.testes[i] = TestePadrao;
        }
	}
	public void cadastrar(Teste prova) 
	{
	
		Teste testeTemp = procurar(prova);
		
		if(testeTemp != null)
		{
			for(int i = 0; i<testes.length;i++)
			{
				if(testes[i].getAluno().getMatricula().equals(testeTemp.getAluno().getMatricula()))
				{
					prova.setNumeroTentativas(prova.getNumeroTentativas()+1);
					this.testes[i] = prova;
					System.out.println("Sucesso!");
				}
			}	
		}
		else
		{
			
			this.testes[indice] = prova;
			this.indice = this.indice + 1;
			System.out.println("Sucesso!");
		}
	
	}
	public Teste procurar(Teste prova) 
	{
		Teste testeRetorno = null;
        for (Teste teste : testes) 
        {
        	if (teste.getAluno().getMatricula().equals(prova.getAluno().getMatricula())) 
            {
                testeRetorno = prova;
            }
        }
        return testeRetorno;
    } 
	
	public Teste gerarTeste(Aluno usuario,Quest�o[] Questoes)
	{
	
		Teste testeTemp = new Teste(usuario);
		
		List lista = Arrays.asList(Questoes);
		List listaQuestoes = new ArrayList (lista) ;
		Collections.shuffle(listaQuestoes);
		
		Quest�o[] questoesRetorno = new Quest�o[3];
		for(int i=0 ; i<questoesRetorno.length;i++)
		{
			Collections.shuffle(listaQuestoes);
			questoesRetorno [i]= (Quest�o) listaQuestoes.get(0);
		}
		
		for(int i=0; i<questoesRetorno.length;i++)
		{	
			System.out.println(questoesRetorno[i].getPergunta());		
			String op�oes[] = questoesRetorno[i].getOpcoes();
			
			for(int j = 0; j< op�oes.length; j++)
			{
				System.out.println(op�oes[j]);
			}	
			
			System.out.println();
			String Resposta = input.nextLine();

			if(Resposta.equalsIgnoreCase(questoesRetorno[i].getResposta()))
			{
				testeTemp.setNumeroAcertos(testeTemp.getNumeroAcertos()+1);
				testeTemp.setNota((testeTemp.gerarNota()+1));
			}
			else
			{
				System.out.println("Alternativa incorreta!");
			}
			
		}
		System.out.println("fimm do testec");
		int tentativas  = testeTemp.getNumeroTentativas();
		testeTemp.setNumeroTentativas(tentativas+1);
		return testeTemp;
	}
	public Teste[] getArrayT()
	{
		return testes;
	}
	
}

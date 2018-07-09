package negócios;

import negócios_dados.Repositório_Teste;
import repositorio.RepositórioTesteArray;

public class Controle_Teste 
{
	Repositório_Teste teste = new RepositórioTesteArray();
	
	public Teste gerarTeste(Aluno usuario,Questão[] Questoes) 
	{ 
		return teste.gerarTeste(usuario, Questoes);
	}
	
	public void cadastrar(Teste prova) 
	{
		teste.cadastrar(prova);
	}
	public Teste procurar(Teste prova) 
	{
		return teste.procurar(prova);
	}
	public Teste[] getArrayT()
	{
		return teste.getArrayT();
	}
}

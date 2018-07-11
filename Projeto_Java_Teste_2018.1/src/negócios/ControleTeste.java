package negócios;

import negóciosdados.RepositórioTeste;
import repositorio.RepositórioTesteArray;

public class ControleTeste 
{
	RepositórioTeste teste = new RepositórioTesteArray();
	
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

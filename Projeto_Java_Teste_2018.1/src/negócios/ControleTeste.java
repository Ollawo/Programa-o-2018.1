package neg�cios;

import neg�cios_dados.Reposit�rio_Teste;
import repositorio.Reposit�rioTesteArray;

public class Controle_Teste 
{
	Reposit�rio_Teste teste = new Reposit�rioTesteArray();
	
	public Teste gerarTeste(Aluno usuario,Quest�o[] Questoes) 
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

package neg�ciosdados;

import neg�cios.Aluno;
import neg�cios.Quest�o;
import neg�cios.Teste;

public interface Reposit�rioTeste 
{
	public Teste gerarTeste(Aluno usuario,Quest�o[] Questoes);
	public void cadastrar(Teste prova);
	public Teste procurar(Teste prova);
	public Teste[] getArrayT();
}

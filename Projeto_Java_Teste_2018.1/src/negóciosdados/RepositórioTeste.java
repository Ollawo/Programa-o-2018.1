package negóciosdados;

import negócios.Aluno;
import negócios.Questão;
import negócios.Teste;

public interface RepositórioTeste 
{
	public Teste gerarTeste(Aluno usuario,Questão[] Questoes);
	public void cadastrar(Teste prova);
	public Teste procurar(Teste prova);
	public Teste[] getArrayT();
}

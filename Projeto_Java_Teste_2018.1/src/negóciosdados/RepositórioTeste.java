package negócios_dados;

import negócios.Aluno;
import negócios.Questão;
import negócios.Teste;

public interface Repositório_Teste 
{
	public Teste gerarTeste(Aluno usuario,Questão[] Questoes);
	public void cadastrar(Teste prova);
	public Teste procurar(Teste prova);
	public Teste[] getArrayT();
}

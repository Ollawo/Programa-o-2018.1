package negócios_dados;

import negócios.Aluno;

public interface Repositório_Aluno 
{

	public void inserir(Aluno usuario);
	public Aluno procurar(Aluno usuario);
	public void atualizar(Aluno usuario1,Aluno usuario2);
	public void remover(Aluno usuario);
	public Aluno[] getArray();
}

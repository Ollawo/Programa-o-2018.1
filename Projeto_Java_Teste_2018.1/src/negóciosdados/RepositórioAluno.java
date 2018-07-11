package neg�ciosdados;

import neg�cios.Aluno;

public interface Reposit�rioAluno 
{

	public void inserir(Aluno usuario);
	public Aluno procurar(Aluno usuario);
	public void atualizar(Aluno usuario1,Aluno usuario2);
	public void remover(Aluno usuario);
	public Aluno[] getArray();
}

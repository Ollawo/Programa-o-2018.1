package negócios;

import exceções.*;
import negóciosdados.RepositórioAluno;
import repositorio.RepositórioAlunoArray;

public class ControleAluno 
{
	RepositórioAluno aluno = new RepositórioAlunoArray();
	
	
	public void cadastrar(Aluno usuario) {
	try{	
		aluno.inserir(usuario);
	}catch(ExceçãoAlunoNomeVazio e){
		//return false
	}catch(ExceçãoAlunoNomeNumero e) {
		//return false
	}catch(ExceçãoAlunoMatriculaVazio e) {
		//return false
	}catch(ExceçãoAlunoMatrículaLetra e) {
		//return false
	}catch(ExceçãoAlunoMatriculaTamanho e) {
		//return false
	}catch(ExceçãoAlunoMatriculaVerificaCPF e) {
		//return false
	}catch(ExceçãoAlunoSenhaVazio e) {
		//return false
	}
	
	}
	
	public Aluno procurar(Aluno usuario)
	{
		return aluno.procurar(usuario);
	}
	
	public void atualizar (Aluno usuario1,Aluno usuario2)
	{
		aluno.atualizar(usuario1, usuario2);
	}
	public void remover (Aluno usuario) 
	{
		aluno.remover(usuario);
	}
	public Aluno[] getArray()
	{
		return aluno.getArray();
	}
	
	
}

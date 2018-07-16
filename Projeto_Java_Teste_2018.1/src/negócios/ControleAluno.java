package neg�cios;

import exce��es.*;
import neg�ciosdados.Reposit�rioAluno;
import repositorio.Reposit�rioAlunoArray;

public class ControleAluno 
{
	Reposit�rioAluno aluno = new Reposit�rioAlunoArray();
	
	
	public void cadastrar(Aluno usuario) {
	try{	
		aluno.inserir(usuario);
	}catch(Exce��oAlunoNomeVazio e){
		//return false
	}catch(Exce��oAlunoNomeNumero e) {
		//return false
	}catch(Exce��oAlunoMatriculaVazio e) {
		//return false
	}catch(Exce��oAlunoMatr�culaLetra e) {
		//return false
	}catch(Exce��oAlunoMatriculaTamanho e) {
		//return false
	}catch(Exce��oAlunoMatriculaVerificaCPF e) {
		//return false
	}catch(Exce��oAlunoSenhaVazio e) {
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

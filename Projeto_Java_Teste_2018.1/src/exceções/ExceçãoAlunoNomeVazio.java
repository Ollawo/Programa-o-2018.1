package exce��es;
import neg�cios.Aluno;

public class Exce��oAlunoNomeVazio extends Exception{

	public Exce��oAlunoNomeVazio() {
		super();
	}
	
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		if (aluno.getNome().equals("")){
			throw new Exception("Campo nome n�o deve ser null");
		}else{
			return true;
			}
		}
}

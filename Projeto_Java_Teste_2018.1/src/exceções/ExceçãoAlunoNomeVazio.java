package exceções;
import negócios.Aluno;

public class ExceçãoAlunoNomeVazio extends Exception{

	public ExceçãoAlunoNomeVazio() {
		super();
	}
	
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		if (aluno.getNome().equals("")){
			throw new Exception("Campo nome não deve ser null");
		}else{
			return true;
			}
		}
}

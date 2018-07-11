package exceções;
import negócios.Aluno;
public class ExceçãoAlunoMatriculaTamanho extends Exception {
	public ExceçãoAlunoMatriculaTamanho() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		if (aluno.getMatricula().length()!=11){
	         throw new Exception("Campo Matrícula deve ter 11 digitos");
	    }else {
	    	return true;
	    	}
		}
	}

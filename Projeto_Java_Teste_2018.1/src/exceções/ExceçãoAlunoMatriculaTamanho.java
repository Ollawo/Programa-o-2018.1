package exce��es;
import neg�cios.Aluno;
public class Exce��oAlunoMatriculaTamanho extends Exception {
	public Exce��oAlunoMatriculaTamanho() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		if (aluno.getMatricula().length()!=11){
	         throw new Exception("Campo Matr�cula deve ter 11 digitos");
	    }else {
	    	return true;
	    	}
		}
	}

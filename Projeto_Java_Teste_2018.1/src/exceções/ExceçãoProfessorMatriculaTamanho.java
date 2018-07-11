package exceções;
import negócios.Professor;
public class ExceçãoProfessorMatriculaTamanho extends Exception {
	public ExceçãoProfessorMatriculaTamanho() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
				if (professor.getMatricula().length()!=11){
			         throw new Exception("Campo Matrícula deve ter 11 digitos");
			    }else {
			    	return true;
			    }
		}
	}

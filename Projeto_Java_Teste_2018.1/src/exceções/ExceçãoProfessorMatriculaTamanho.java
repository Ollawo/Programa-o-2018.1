package exce��es;
import neg�cios.Professor;
public class Exce��oProfessorMatriculaTamanho extends Exception {
	public Exce��oProfessorMatriculaTamanho() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
				if (professor.getMatricula().length()!=11){
			         throw new Exception("Campo Matr�cula deve ter 11 digitos");
			    }else {
			    	return true;
			    }
		}
	}

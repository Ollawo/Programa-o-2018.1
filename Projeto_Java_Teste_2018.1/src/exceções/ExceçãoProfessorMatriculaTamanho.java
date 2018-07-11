package exceções;
import negócios.Professor;
public class ExceçãoProfessorMatriculaTamanho extends Exception {
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		
		try{
			
				if (professor.getMatricula().length()!=11){
			         throw new Exception("Campo Matrícula deve ter 11 digitos");
			    }
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}

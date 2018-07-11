package exceções;

import negócios.Professor;

public class ExceçãoProfessorMatriculaVazio extends Exception{

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		
		try{

		if (professor.getMatricula().equals("")){
	         throw new Exception("Campo Matrícula não deve ser null");
	    }
		
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}

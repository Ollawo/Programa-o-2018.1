package exceções;

import negócios.Professor;

public class ExceçãoProfessorMatriculaVazio extends Exception{

	public ExceçãoProfessorMatriculaVazio() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		if (professor.getMatricula().equals("")){
	         throw new Exception("Campo Matrícula não deve ser null");
	    }else{
	    return true;
	    }	
	}
}

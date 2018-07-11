package exceções;

import negócios.Professor;

public class ExceçãoProfessorSenhaVazio extends Exception{
	public ExceçãoProfessorSenhaVazio() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		if (professor.getSenha().equals("")){
	         throw new Exception("Campo Matrícula não deve ser null");
	    }else {
	    	return true;
	    }

	}

}

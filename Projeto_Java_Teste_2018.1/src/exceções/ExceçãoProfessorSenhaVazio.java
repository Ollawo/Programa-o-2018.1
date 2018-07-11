package exceções;

import negócios.Professor;

public class ExceçãoProfessorSenhaVazio extends Exception{
private Professor professor;
	
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		
		try{

		if (professor.getSenha().equals("")){
	         throw new Exception("Campo Matrícula não deve ser null");
	    }
		
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}

}

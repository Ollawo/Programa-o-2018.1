package exce��es;

import neg�cios.Professor;

public class Exce��oProfessorMatriculaVazio extends Exception{

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		
		try{

		if (professor.getMatricula().equals("")){
	         throw new Exception("Campo Matr�cula n�o deve ser null");
	    }
		
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}

package exce��es;

import neg�cios.Professor;

public class Exce��oProfessorSenhaVazio extends Exception{
private Professor professor;
	
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		
		try{

		if (professor.getSenha().equals("")){
	         throw new Exception("Campo Matr�cula n�o deve ser null");
	    }
		
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}

}

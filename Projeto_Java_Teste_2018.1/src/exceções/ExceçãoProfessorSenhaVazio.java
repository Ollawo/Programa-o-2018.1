package exce��es;

import neg�cios.Professor;

public class Exce��oProfessorSenhaVazio extends Exception{
	public Exce��oProfessorSenhaVazio() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		if (professor.getSenha().equals("")){
	         throw new Exception("Campo Matr�cula n�o deve ser null");
	    }else {
	    	return true;
	    }

	}

}

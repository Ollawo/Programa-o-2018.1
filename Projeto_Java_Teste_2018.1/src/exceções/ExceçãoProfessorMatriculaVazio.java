package exce��es;

import neg�cios.Professor;

public class Exce��oProfessorMatriculaVazio extends Exception{

	public Exce��oProfessorMatriculaVazio() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		if (professor.getMatricula().equals("")){
	         throw new Exception("Campo Matr�cula n�o deve ser null");
	    }else{
	    return true;
	    }	
	}
}

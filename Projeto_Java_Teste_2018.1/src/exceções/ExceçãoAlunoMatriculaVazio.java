package exce��es;

import neg�cios.Aluno;

public class Exce��oAlunoMatriculaVazio extends Exception{

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		
		try{

		if (aluno.getMatricula().equals("")){
	         throw new Exception("Campo Matr�cula n�o deve ser null");
	    }
		
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}

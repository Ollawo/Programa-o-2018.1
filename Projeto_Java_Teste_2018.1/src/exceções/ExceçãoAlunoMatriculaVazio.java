package exce��es;

import neg�cios.Aluno;

public class Exce��oAlunoMatriculaVazio extends Exception{

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		if (aluno.getMatricula().equals("")){
	         throw new Exception("Campo Matr�cula n�o deve ser null");
	    }else {
	    	return true;
	    }
		
	}
}

package exceções;

import negócios.Aluno;

public class ExceçãoAlunoMatriculaVazio extends Exception{

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		
		try{

		if (aluno.getMatricula().equals("")){
	         throw new Exception("Campo Matrícula não deve ser null");
	    }
		
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}

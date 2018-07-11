package exceções;

import negócios.Aluno;

public class ExceçãoAlunoMatriculaVazio extends Exception{

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		if (aluno.getMatricula().equals("")){
	         throw new Exception("Campo Matrícula não deve ser null");
	    }else {
	    	return true;
	    }
		
	}
}

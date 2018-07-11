package exceções;

import negócios.Aluno;

public class ExceçãoAlunoMatriculaVazio extends Exception{

	public ExceçãoAlunoMatriculaVazio() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		if (aluno.getMatricula().equals("")){
	         throw new Exception("Campo Matrícula não deve ser null");
	    }else {
	    	return true;
	    }
		
	}
}

package exceções;

import negócios.Aluno;

public class ExceçãoAlunoSenhaVazio extends Exception{

	public ExceçãoAlunoSenhaVazio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		
		try{

		if (aluno.getSenha().equals("")){
	         throw new Exception("Campo Matrícula não deve ser null");
	    }
		
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}

}

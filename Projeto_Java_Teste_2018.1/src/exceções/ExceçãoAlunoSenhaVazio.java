package exce��es;

import neg�cios.Aluno;

public class Exce��oAlunoSenhaVazio extends Exception{

	public Exce��oAlunoSenhaVazio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		
		try{

		if (aluno.getSenha().equals("")){
	         throw new Exception("Campo Matr�cula n�o deve ser null");
	    }
		
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}

}

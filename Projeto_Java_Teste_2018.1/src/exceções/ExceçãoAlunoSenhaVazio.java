package exce��es;

import neg�cios.Aluno;

public class Exce��oAlunoSenhaVazio extends Exception{

	public Exce��oAlunoSenhaVazio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		if (aluno.getSenha().equals("")){
	         throw new Exception("Campo Matr�cula n�o deve ser null");
	    }else{
	    	return true;
	    }
	}
}

package exce��es;

import neg�cios.Aluno;

public class Exce��oAlunoNomeVazio extends Exception{

public Exce��oAlunoNomeVazio() {

	}

@SuppressWarnings("unused")
private Boolean VerficaCampo(Aluno aluno) throws Exception {
	
	try{

	if (aluno.getNome().equals("")){
         throw new Exception("Campo nome n�o deve ser null");
    }
	
}
catch (Exception ex){
  throw ex;
}
	return true;
	}
	
	
	

}


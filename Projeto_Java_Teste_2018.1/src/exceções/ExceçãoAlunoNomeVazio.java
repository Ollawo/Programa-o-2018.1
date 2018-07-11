package exceções;

import negócios.Aluno;

public class ExceçãoAlunoNomeVazio extends Exception{

public ExceçãoAlunoNomeVazio() {

	}

@SuppressWarnings("unused")
private Boolean VerficaCampo(Aluno aluno) throws Exception {
	
	try{

	if (aluno.getNome().equals("")){
         throw new Exception("Campo nome não deve ser null");
    }
	
}
catch (Exception ex){
  throw ex;
}
	return true;
	}
	
	
	

}


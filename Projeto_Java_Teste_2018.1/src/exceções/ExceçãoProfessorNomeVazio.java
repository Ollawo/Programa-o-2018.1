package exceções;

import negócios.Professor;

public class ExceçãoProfessorNomeVazio extends Exception{

public ExceçãoProfessorNomeVazio() {

	}

@SuppressWarnings("unused")
private Boolean VerficaCampo(Professor professor) throws Exception {
	
	try{

	if (professor.getNome().equals("")){
         throw new Exception("Campo nome não deve ser null");
    }
	
}
catch (Exception ex){
  throw ex;
}
	return true;
	}
	
	
	

}


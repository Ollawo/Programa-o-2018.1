package exce��es;

import neg�cios.Professor;

public class Exce��oProfessorNomeVazio extends Exception{

public Exce��oProfessorNomeVazio() {

	}

@SuppressWarnings("unused")
private Boolean VerficaCampo(Professor professor) throws Exception {
	
	try{

	if (professor.getNome().equals("")){
         throw new Exception("Campo nome n�o deve ser null");
    }
	
}
catch (Exception ex){
  throw ex;
}
	return true;
	}
	
	
	

}


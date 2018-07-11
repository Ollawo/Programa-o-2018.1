package exceções;

import negócios.Professor;

public class ExceçãoProfessorNomeVazio extends Exception{

	public ExceçãoProfessorNomeVazio() {
		super();
	}

@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		if (professor.getNome().equals("")){
			throw new Exception("Campo nome não deve ser null");
		}else{
			return true;
			}
	}
}


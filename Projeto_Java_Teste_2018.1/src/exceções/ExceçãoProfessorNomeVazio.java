package exce��es;

import neg�cios.Professor;

public class Exce��oProfessorNomeVazio extends Exception{

	public Exce��oProfessorNomeVazio() {
		super();
	}

@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		if (professor.getNome().equals("")){
			throw new Exception("Campo nome n�o deve ser null");
		}else{
			return true;
			}
	}
}


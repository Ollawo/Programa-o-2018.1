package exce��es;
import neg�cios.Professor;

public class Exce��oProfessorNomeNumero extends Exception{
	public Exce��oProfessorNomeNumero() {
		super();
	}
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
			for (int i=0;i<professor.getNome().length();i++) {
				
				if (Character.isDigit(professor.getNome().charAt(i))==true){
			         throw new Exception("Campo Nome n�o deve ter N�mero");
			    }
			}
			return false;
		}
	}


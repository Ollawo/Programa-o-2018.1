package exceções;
import negócios.Professor;

public class ExceçãoProfessorNomeNumero extends Exception{
	public ExceçãoProfessorNomeNumero() {
		super();
	}
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
			for (int i=0;i<professor.getNome().length();i++) {
				
				if (Character.isDigit(professor.getNome().charAt(i))==true){
			         throw new Exception("Campo Nome não deve ter Número");
			    }
			}
			return false;
		}
	}


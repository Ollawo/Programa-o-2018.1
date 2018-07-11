package exceções;
import negócios.Professor;

public class ExceçãoProfessorNomeNumero extends Exception{
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		
		try{
			for (int i=0;i<professor.getNome().length();i++) {
				
				if (Character.isDigit(professor.getNome().charAt(i))==true){
			         throw new Exception("Campo Nome não deve ter Número");
			    }
			}
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}


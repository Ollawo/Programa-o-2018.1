package exce��es;
import neg�cios.Professor;
public class Exce��oProfessorMatriculaTamanho extends Exception {
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		
		try{
			
				if (professor.getMatricula().length()!=11){
			         throw new Exception("Campo Matr�cula deve ter 11 digitos");
			    }
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}

package exce��es;
import neg�cios.Professor;
public class Exce��oProfessorMatr�culaLetra extends Exception{
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
		
		try{
			for (int i=0;i<professor.getMatricula().length();i++) {
				
				if (Character.isLetter(professor.getMatricula().charAt(i))==true){
			         throw new Exception("Campo Matr�cula n�o deve ter Letra");
			    }
			}
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}

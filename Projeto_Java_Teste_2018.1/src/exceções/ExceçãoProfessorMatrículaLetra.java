package exce��es;
import neg�cios.Professor;
public class Exce��oProfessorMatr�culaLetra extends Exception{
	
	public Exce��oProfessorMatr�culaLetra() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
			for (int i=0;i<professor.getMatricula().length();i++) {
				
				if (Character.isLetter(professor.getMatricula().charAt(i))==true){
			         throw new Exception("Campo Matr�cula n�o deve ter Letra");
			    }
			}
		return true;
		}
}

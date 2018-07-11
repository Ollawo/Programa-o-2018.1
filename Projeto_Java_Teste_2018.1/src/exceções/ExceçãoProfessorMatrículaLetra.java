package exceções;
import negócios.Professor;
public class ExceçãoProfessorMatrículaLetra extends Exception{
	
	public ExceçãoProfessorMatrículaLetra() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Professor professor) throws Exception {
			for (int i=0;i<professor.getMatricula().length();i++) {
				
				if (Character.isLetter(professor.getMatricula().charAt(i))==true){
			         throw new Exception("Campo Matrícula não deve ter Letra");
			    }
			}
		return true;
		}
}

package exceções;
import negócios.Aluno;
public class ExceçãoAlunoMatrículaLetra extends Exception{

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		
		try{
			for (int i=0;i<aluno.getMatricula().length();i++) {
				
				if (Character.isLetter(aluno.getMatricula().charAt(i))==true){
			         throw new Exception("Campo Matrícula não deve ter Letra");
			    }
			}
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}

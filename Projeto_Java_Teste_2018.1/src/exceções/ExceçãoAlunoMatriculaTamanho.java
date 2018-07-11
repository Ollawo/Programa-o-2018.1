package exceções;
import negócios.Aluno;
public class ExceçãoAlunoMatriculaTamanho extends Exception {

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		
		try{
			
				if (aluno.getMatricula().length()!=11){
			         throw new Exception("Campo Matrícula deve ter 11 digitos");
			    }
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}

package exce��es;
import neg�cios.Aluno;
public class Exce��oAlunoMatriculaTamanho extends Exception {

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		
		try{
			
				if (aluno.getMatricula().length()!=11){
			         throw new Exception("Campo Matr�cula deve ter 11 digitos");
			    }
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}

package exce��es;
import neg�cios.Aluno;
public class Exce��oAlunoMatr�culaLetra extends Exception{

	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		
		try{
			for (int i=0;i<aluno.getMatricula().length();i++) {
				
				if (Character.isLetter(aluno.getMatricula().charAt(i))==true){
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

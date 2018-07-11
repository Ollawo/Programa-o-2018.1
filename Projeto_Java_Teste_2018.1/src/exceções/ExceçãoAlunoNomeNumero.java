package exceções;
import negócios.Aluno;

public class ExceçãoAlunoNomeNumero extends Exception{
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		
		try{
			for (int i=0;i<aluno.getNome().length();i++) {
				
				if (Character.isDigit(aluno.getNome().charAt(i))==true){
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


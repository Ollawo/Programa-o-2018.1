package exce��es;
import neg�cios.Aluno;

public class Exce��oAlunoNomeNumero extends Exception{
	
	@SuppressWarnings("unused")
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		
		try{
			for (int i=0;i<aluno.getNome().length();i++) {
				
				if (Character.isDigit(aluno.getNome().charAt(i))==true){
			         throw new Exception("Campo Nome n�o deve ter N�mero");
			    }
			}
	}
	catch (Exception ex){
	  throw ex;
	}
		return true;
		}
}


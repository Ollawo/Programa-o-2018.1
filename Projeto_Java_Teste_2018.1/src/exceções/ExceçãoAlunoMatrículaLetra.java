package exce��es;
import neg�cios.Aluno;
public class Exce��oAlunoMatr�culaLetra extends Exception{
	public Exce��oAlunoMatr�culaLetra() {
		super();
	}
	
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
	
	for (int i=0;i<aluno.getMatricula().length();i++) {
		
		if (Character.isLetter(aluno.getMatricula().charAt(i))==true){
	         throw new Exception("Campo Matr�cula n�o deve ter Letra");
	    }
	}
	return true;
	}
		
}


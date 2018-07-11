package exceções;
import negócios.Aluno;
public class ExceçãoAlunoMatrículaLetra extends Exception{
	public ExceçãoAlunoMatrículaLetra() {
		super();
	}
	
	private Boolean VerficaCampo(Aluno aluno) throws Exception {
	
	for (int i=0;i<aluno.getMatricula().length();i++) {
		
		if (Character.isLetter(aluno.getMatricula().charAt(i))==true){
	         throw new Exception("Campo Matrícula não deve ter Letra");
	    }
	}
	return true;
	}
		
}


package exceções;
import negócios.Aluno;

public class ExceçãoAlunoNomeNumero extends Exception{	
	public ExceçãoAlunoNomeNumero() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		for (int i=0;i<aluno.getNome().length();i++) {
			
			if (Character.isDigit(aluno.getNome().charAt(i))==true){
		         throw new Exception("Campo Nome não deve ter Número");
		    }
		}
		return true;
	}
}


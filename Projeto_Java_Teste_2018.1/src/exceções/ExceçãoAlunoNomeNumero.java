package exce��es;
import neg�cios.Aluno;

public class Exce��oAlunoNomeNumero extends Exception{	
	public Exce��oAlunoNomeNumero() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Boolean VerficaCampo(Aluno aluno) throws Exception {
		for (int i=0;i<aluno.getNome().length();i++) {
			
			if (Character.isDigit(aluno.getNome().charAt(i))==true){
		         throw new Exception("Campo Nome n�o deve ter N�mero");
		    }
		}
		return true;
	}
}


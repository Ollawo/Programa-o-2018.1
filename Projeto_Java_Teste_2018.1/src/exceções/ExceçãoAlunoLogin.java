package exce��es;
import neg�cios.Aluno;
import neg�cios.Login;

public class Exce��oAlunoLogin {
	public Exce��oAlunoLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private Aluno VerficaCampo(Login login, Aluno[] alunos) throws Exception {
		int i;
		for (i=0;i<alunos.length;i++) {
			
			if (alunos[i].getSenha().equals(login.getSenha()) && alunos[i].getMatricula().equals(login.getLogin())){
				return alunos[i]; 
		    }
	}
		throw new Exception("Login Incorreto");
	}
}

package exce��es;
import neg�cios.Professor;
import neg�cios.Aluno;
import neg�cios.Login;
public class Exce��oProfessorLogin {
	public Exce��oProfessorLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private Professor VerficaCampo(Login login, Professor[] professor) throws Exception {
		int i;
		for (i=0;i<professor.length;i++) {
			
			if (professor[i].getSenha().equals(login.getSenha()) && professor[i].getMatricula().equals(login.getLogin())){
				return professor[i]; 
		    }
	}
		throw new Exception("Login Incorreto");
	}
}

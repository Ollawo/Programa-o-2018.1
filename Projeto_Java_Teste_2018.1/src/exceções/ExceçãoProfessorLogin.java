package exceções;
import negócios.Professor;
import negócios.Aluno;
import negócios.Login;
public class ExceçãoProfessorLogin {
	public ExceçãoProfessorLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private Professor VerficaCampo(Login login, Professor[] professor) throws Exception {
		int i;
		try{
			for (i=0;i<professor.length;i++) {
				
				if (!(professor[i].getSenha().equals(login.getSenha()) || professor[i].getMatricula().equals(login.getLogin()))){
			         throw new Exception("Campos incorretos");
			    }else {
			    	break;
			    }
			}
			
		
	}
	catch (Exception ex){
	  throw ex;
	}
		return professor[i];
		}
}

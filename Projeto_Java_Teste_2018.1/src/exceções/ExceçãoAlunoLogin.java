package exce��es;
import neg�cios.Aluno;
import neg�cios.Login;

public class Exce��oAlunoLogin {
	
	public Exce��oAlunoLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unused")
	private Aluno VerficaCampo(Login login, Aluno[] alunos) throws Exception {
		int i;
		try{
			for (i=0;i<alunos.length;i++) {
				
				if (!(alunos[i].getSenha().equals(login.getSenha()) || alunos[i].getMatricula().equals(login.getLogin()))){
			         throw new Exception("Campos incorretos");
			    }else {
			    	break;
			    }
			}
			
		
	}
	catch (Exception ex){
	  throw ex;
	}
		return alunos[i];
		}
}

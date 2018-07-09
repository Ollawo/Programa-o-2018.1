package neg�cios;

public class Fachada 
{
	private Controle_Aluno aluno;
	private Controle_Professor professor;
	private Controle_Login loginc;
	private Controle_Quest�o questao;
	private Controle_Teste teste;
	private static Fachada instance;
	
	public Fachada() 
	{
		aluno = new Controle_Aluno();
		professor = new Controle_Professor();
		loginc = new Controle_Login();
		questao = new Controle_Quest�o();
		teste = new Controle_Teste();
	}
	
	public static Fachada getInstance()
	{
		if (Fachada.instance == null)
		{
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	//metodos referente a interface reposit�rio Aluno
	public void cadastrar(Aluno usuario) {aluno.cadastrar(usuario);}
	
	public Aluno procurar(Aluno usuario){return aluno.procurar(usuario);}
	
	public void atualizar(Aluno usuario1,Aluno usuario2){aluno.atualizar(usuario1, usuario2);}
	
	public void remover(Aluno usuario) {aluno.remover(usuario);}
	
	public Aluno[] getArray() {return aluno.getArray();}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//metodos referente a interface reposit�rio professor
	
	public void cadastrar(Professor usuario) {professor.cadastrar(usuario);}
	
	public Professor procurar(Professor usuario){return professor.procurar(usuario);}
	
	public void atualizar(Professor usuario1,Professor usuario2){professor.atualizar(usuario1, usuario2);}
	
	public void remover(Professor usuario) {professor.remover(usuario);}
	
	public Professor[] getArrayP() {return professor.getArrayP();}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//metodos referente a interface reposit�rio Login
	
	public Aluno efetuarLogin(Login login, Aluno[] alunos) {return loginc.efetuarLogin(login, alunos);}
	
	public Aluno procurar(Login login) {return loginc.procurar(login);}
	
	public Professor efetuarLogin(Login login, Professor[] professores){return loginc.efetuarLogin(login, professores);}
	
	public Professor procurarProfessor(Login login) {	return loginc.procurarProfessor(login);}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	//metodos referente a interface reposit�rio Ques�es
	
	public void cadastrar(Quest�o Questao) {questao.cadastrar(Questao);}
	
	public Quest�o procurar(Quest�o Questao){return questao.procurar(Questao);}
	
	public void atualizar(Quest�o Questao1,Quest�o Questao2){questao.atualizar(Questao1, Questao2);}
	
	public void remover(Quest�o Questao) {questao.remover(Questao);}
	
	public Quest�o[] getArrayQ() {return questao.getArray();}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	//metodos referente a interface reposit�rio Teste
	
	public Teste gerarTeste(Aluno usuario,Quest�o[] Questoes) { return teste.gerarTeste(usuario, Questoes);}
	
	public void cadastrar(Teste prova) {teste.cadastrar(prova);}
	
	public Teste procurar(Teste prova) {return teste.procurar(prova);}
	
	public Teste[] getArrayT() {return teste.getArrayT();}
}

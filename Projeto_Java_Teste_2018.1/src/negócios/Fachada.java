package negócios;

public class Fachada 
{
	private Controle_Aluno aluno;
	private Controle_Professor professor;
	private Controle_Login loginc;
	private Controle_Questão questao;
	private Controle_Teste teste;
	private static Fachada instance;
	
	public Fachada() 
	{
		aluno = new Controle_Aluno();
		professor = new Controle_Professor();
		loginc = new Controle_Login();
		questao = new Controle_Questão();
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
	
	//metodos referente a interface repositório Aluno
	public void cadastrar(Aluno usuario) {aluno.cadastrar(usuario);}
	
	public Aluno procurar(Aluno usuario){return aluno.procurar(usuario);}
	
	public void atualizar(Aluno usuario1,Aluno usuario2){aluno.atualizar(usuario1, usuario2);}
	
	public void remover(Aluno usuario) {aluno.remover(usuario);}
	
	public Aluno[] getArray() {return aluno.getArray();}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//metodos referente a interface repositório professor
	
	public void cadastrar(Professor usuario) {professor.cadastrar(usuario);}
	
	public Professor procurar(Professor usuario){return professor.procurar(usuario);}
	
	public void atualizar(Professor usuario1,Professor usuario2){professor.atualizar(usuario1, usuario2);}
	
	public void remover(Professor usuario) {professor.remover(usuario);}
	
	public Professor[] getArrayP() {return professor.getArrayP();}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//metodos referente a interface repositório Login
	
	public Aluno efetuarLogin(Login login, Aluno[] alunos) {return loginc.efetuarLogin(login, alunos);}
	
	public Aluno procurar(Login login) {return loginc.procurar(login);}
	
	public Professor efetuarLogin(Login login, Professor[] professores){return loginc.efetuarLogin(login, professores);}
	
	public Professor procurarProfessor(Login login) {	return loginc.procurarProfessor(login);}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	//metodos referente a interface repositório Quesões
	
	public void cadastrar(Questão Questao) {questao.cadastrar(Questao);}
	
	public Questão procurar(Questão Questao){return questao.procurar(Questao);}
	
	public void atualizar(Questão Questao1,Questão Questao2){questao.atualizar(Questao1, Questao2);}
	
	public void remover(Questão Questao) {questao.remover(Questao);}
	
	public Questão[] getArrayQ() {return questao.getArray();}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	//metodos referente a interface repositório Teste
	
	public Teste gerarTeste(Aluno usuario,Questão[] Questoes) { return teste.gerarTeste(usuario, Questoes);}
	
	public void cadastrar(Teste prova) {teste.cadastrar(prova);}
	
	public Teste procurar(Teste prova) {return teste.procurar(prova);}
	
	public Teste[] getArrayT() {return teste.getArrayT();}
}

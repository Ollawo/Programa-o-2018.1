package aplica��o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import neg�cios.Fachada;
import neg�cios.Login;
import neg�cios.Quest�o;
import neg�cios.Relat�rio;
import neg�cios.Usuario;
import neg�cios.Aluno;
import neg�cios.Professor;
import repositorio.Reposit�rioAlunoArray;
import neg�cios.Teste;

public class TesteSistema 
{
	public static void main(String[] args) 
	{
		//coloquei varios for's com system.out dentro dos repositorios afim de testar as saidas quando foi analisar usar 
		// */ */para testar por partes o codigo. 
		
		//cria��o de uma inst�ncia da classe ususario Aluno 
		/*
		Aluno aluno1 = new Aluno("neriton", "07336030416","12345");
		Aluno aluno2 = new Aluno("paulo", "6789", "99999999999");
		Aluno aluno3 = new Aluno("Teste", "88888", "00000000000");
	
		//Teste dos metodos implementados no repositorio aluno atraves da fachada.
		Fachada.getInstance().cadastrar(aluno1);
		Fachada.getInstance().cadastrar(aluno2);
		Fachada.getInstance().cadastrar(aluno1);//nesse mommento a impressao mostara o que o aluno n�o foi cadastrado 
		Fachada.getInstance().atualizar(aluno2,aluno3);
		Fachada.getInstance().remover(aluno3);
		System.out.println();
		*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		/*
		//cria��o de uma inst�ncia da classe ususario professor
		Professor professor1 = new Professor("paulo","99999999999","6789");
		Professor professor2 = new Professor("paulo", "123489", "99999999999");
		Professor professor3 = new Professor("anselmo", "8528", "99999999999");
		
		Fachada.getInstance().cadastrar(professor1);
		Fachada.getInstance().cadastrar(professor2);
		Fachada.getInstance().atualizar(professor2, professor3);
		Fachada.getInstance().remover(professor3);
		System.out.println();
		*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/*
		//cria��o de uma inst�ncia da classe login aluno
		Login loginA = new Login("07336030416","12345");// criando objeto login aluno(obtido pela tela GUI)
		
		Aluno[] array = Fachada.getInstance().getArray(); //obtendo array com alunos que ja foram cadastrados
		
		Aluno alunoTeste = Fachada.getInstance().efetuarLogin(loginA,array);// efetuando login com parametros anteriores 
		//e obtendo como retorno um aluno que ira ser usado na classe Teste
		
		Login loginP = new Login("99999999999","6789");// criando objeto login professor(obtido pela tela GUi)
		
		Professor[] arrayP = Fachada.getInstance().getArrayP();//obtendo array com Professores que ja foram cadastrados
		
		Professor ProfessorTeste = Fachada.getInstance().efetuarLogin(loginP,arrayP);// efetuando login com parametros anteriores 
		//e obtendo como retorno um professor que ira ser usado na classe Relatorio
		
		System.out.println();
		*/
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		//cria��o das variaveis contendo os atributos da classe Quest�o
		
		String pergunta1 = "Ao se executar o trecho de c�digo abaixo, escrito na linguagem Java, ser� obtido o seguinte resultado: "
				  + "public class Classe { public static void main(String[] args) "
				  + "{ "
				  + "	int i = 9; int x = 10; "
				  + "	System.out.println(\"Soma \" + i + x); "
				  + "}";
		
		String op�oes1 [] = {"a)-> Erro em tempo de execu��o",
							 "b)-> O c�digo n�o compila",
							 "c)-> Soma: 19",
							 "d)-> Soma: 910",
							 "e)-> Nda"};
		
		String resposta1 =   "c";
		
		
		String pergunta2 = "Heran�a e interfaces s�o conceitos da orienta��o a objetos que possibilitam a obten��o de polimorfismo. Em Java, uma interface pode";
		
		String op�oes2 [] = {"a)-> herdar de mais de uma interface.",
							"b)-> ser instanciada diretamente por meio da instru��o new",
							"c)-> possuir apenas assinaturas de m�todos p�blicos e protegidos.",
							"d)-> possuir m�todos abstratos e est�ticos.",
							"e)-> conter declara��es de constantes e de vari�veis n�o inicializadas."};
		
		String resposta2 =   "c";
		
		
		String pergunta3 = "Sobre o uso da palavra-chave �final� em Java, assinale a alternativa�correta.";
		
		String op�oes3 [] = {"a) -> � utilizada para a defini��o de constantes dentro da linguagem.",
							 "b) -> Indica o fim de um arquivo de c�digo fonte em Java.",
							 "c) -> Pode ser substitu�da pela palavra-chave �static�, tendo em vista que ambas t�m efeitos id�nticos.",
							 "d) -> Pode ser apenas utilizada na declara��o de classes.",
							 "e) -> Uma vari�vel com qualificador �final� pode ter seu valor modificado a qualquer momento da execu��o de um programa."};
		String resposta3 = "a";
			
		
		String pergunta4 = "Qual das alternativas abaixo apresenta um m�todo que concatena dois objetos do tipo String em Java?";
		
		String op�oes4 [] = {"a) -> M�todo �endsWith� em �String�",
				 			 "b) -> M�todo �charAt�",
				 			 "c) -> Sobrecarga do operador �+�",
				 			 "d) -> M�todo �substring�",
				 			 "e) -> Sobrecarga do operador �++�"};
		
		String resposta4 = "c";
		
		String pergunta5 = "Qual a saida do programa abaixo?"
						 + "O programaJava public class enigma "
						 + "{����"
						 + "	public static void main(String args[]) "
						 + "	{��������"
						 		+ "int m=0, n=2;��������"
						 		+ "do "
						 		+ "{�����������"
						 				+ "m = ++m;������������"
						 				+ "n--;��������"
						 		+ "} while(n>0);��������"
						 		+ "System.out.println(m);����"
						 		+ "}"
						 + "}";
		
		String op�oes5 [] = {"a) -> 0",
				 			 "b) -> 1",
				 			 "c) -> 2",
				 			 "d) -> 3",
				 			 "e) -> 4"};
		
		String resposta5 = "c";
		
		
		String pergunta6 = "O seguinte trecho de c�digo cria um array em linguagem Java e o inicializa: "
							+ "int[] array; array = new int[2]; int[0] = 1; int[1] = 2; int[2] = 3; "
							+ "Este array � exemplo de�";
		
		String op�oes6 [] = {"a) -> uma vari�vel composta homog�nea.",
				 			 "b) -> uma express�o.",
				 			 "c) -> uma string heterog�nea.",
				 			 "d) -> Muma constante.Responder.",
				 			 "e) -> nda"};
		
		String resposta6 = "a";
		
		//cria��o das inst�ncias da classe Quest�o, quest�o1
		Quest�o questao1 = new Quest�o(pergunta1, op�oes1, resposta1);
		Quest�o questao2 = new Quest�o(pergunta2, op�oes2, resposta2);
		Quest�o questao3 = new Quest�o(pergunta3, op�oes3, resposta3);
		Quest�o questao4 = new Quest�o(pergunta4, op�oes4, resposta4);
		Quest�o questao5 = new Quest�o(pergunta5, op�oes5, resposta5);
		
		Fachada.getInstance().cadastrar(questao1);
		Fachada.getInstance().cadastrar(questao2);
		Fachada.getInstance().cadastrar(questao3);
		Fachada.getInstance().cadastrar(questao4);
		Fachada.getInstance().cadastrar(questao5);
		
		//Fachada.getInstance().cadastrar(questao0);
		//Fachada.getInstance().atualizar(questao1, questao2);
		//Fachada.getInstance().remover(questao2);
		//Quest�o[] Questoes = Fachada.getInstance().getArrayQ();
		 
		System.out.println();
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
		Aluno aluno1 = new Aluno("neriton", "07336030416","12345");
		Fachada.getInstance().cadastrar(aluno1);//cadastrando aluno 
		Login loginA = new Login("07336030416","12345");//criando login a ser usado  no metodo efeturar login
		
		Aluno[] alunosCadastrados = Fachada.getInstance().getArray(); //obtendo array com alunos que ja foram cadastrados pelo metodo getArray no repositorioAlunoArray
		Aluno alunoRetornado1 = Fachada.getInstance().efetuarLogin(loginA,alunosCadastrados);// efetuando login
		
		Quest�o[] Questoes = Fachada.getInstance().getArrayQ();//obtendo o array com Questoes que ja foram Cadastradas pelo metodo getArrayQ no respositorioQuest�oArray
		
		Teste testeRealizado1 = Fachada.getInstance().gerarTeste(alunoRetornado1, Questoes);// aplicando teste pelo metodo gerarTeste do repositorioTesteArray
		Fachada.getInstance().cadastrar(testeRealizado1);// salvando teste pelo metodo Cadastrar do repositorioTesteArray 
	
		//realizando mesmo processo acima para  outro aluno
		Aluno alunoRetornado2 = new Aluno("paulo", "6789", "99999999999");
		Teste testeRealizado2 = Fachada.getInstance().gerarTeste(alunoRetornado2, Questoes);
		Fachada.getInstance().cadastrar(testeRealizado2);
		
		//salvando teste em outra tentativa em aluno que ja fez o teste uma vez
		Teste testeRetorno3 = Fachada.getInstance().gerarTeste(alunoRetornado1, Questoes);
		Fachada.getInstance().cadastrar(testeRetorno3);
		
		//salvando outro teste no repositorioTesteArray apos cadastro de teste ja existente
		Aluno alunoRetornado3 = new Aluno("anselmo", "1111", "00000000000");
		Teste testeRetorno4 = Fachada.getInstance().gerarTeste(alunoRetornado3, Questoes);
		Fachada.getInstance().cadastrar(testeRetorno4);
		
		Aluno alunoRetornado4 = new Aluno("ultimo aluno", "5555", "22222222222");
		Teste testeRetorno5 = Fachada.getInstance().gerarTeste(alunoRetornado4, Questoes);
		Fachada.getInstance().cadastrar(testeRetorno5);
		
		Teste[] testesFeitos = Fachada.getInstance().getArrayT();
		
		for(int i=0 ; i<testesFeitos.length; i++)
		{
			System.out.println(testesFeitos[i]);
		}
		
	}
}

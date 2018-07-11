package aplicação;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import negócios.Fachada;
import negócios.Login;
import negócios.Questão;
import negócios.Relatório;
import negócios.Usuario;
import negócios.Aluno;
import negócios.Professor;
import repositorio.RepositórioAlunoArray;
import negócios.Teste;

public class TesteSistema 
{
	public static void main(String[] args) 
	{
		//coloquei varios for's com system.out dentro dos repositorios afim de testar as saidas quando foi analisar usar 
		// */ */para testar por partes o codigo. 
		
		//criação de uma instância da classe ususario Aluno 
		/*
		Aluno aluno1 = new Aluno("neriton", "07336030416","12345");
		Aluno aluno2 = new Aluno("paulo", "6789", "99999999999");
		Aluno aluno3 = new Aluno("Teste", "88888", "00000000000");
	
		//Teste dos metodos implementados no repositorio aluno atraves da fachada.
		Fachada.getInstance().cadastrar(aluno1);
		Fachada.getInstance().cadastrar(aluno2);
		Fachada.getInstance().cadastrar(aluno1);//nesse mommento a impressao mostara o que o aluno não foi cadastrado 
		Fachada.getInstance().atualizar(aluno2,aluno3);
		Fachada.getInstance().remover(aluno3);
		System.out.println();
		*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		/*
		//criação de uma instância da classe ususario professor
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
		//criação de uma instância da classe login aluno
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
	
		//criação das variaveis contendo os atributos da classe Questão
		
		String pergunta1 = "Ao se executar o trecho de código abaixo, escrito na linguagem Java, será obtido o seguinte resultado: "
				  + "public class Classe { public static void main(String[] args) "
				  + "{ "
				  + "	int i = 9; int x = 10; "
				  + "	System.out.println(\"Soma \" + i + x); "
				  + "}";
		
		String opçoes1 [] = {"a)-> Erro em tempo de execução",
							 "b)-> O código não compila",
							 "c)-> Soma: 19",
							 "d)-> Soma: 910",
							 "e)-> Nda"};
		
		String resposta1 =   "c";
		
		
		String pergunta2 = "Herança e interfaces são conceitos da orientação a objetos que possibilitam a obtenção de polimorfismo. Em Java, uma interface pode";
		
		String opçoes2 [] = {"a)-> herdar de mais de uma interface.",
							"b)-> ser instanciada diretamente por meio da instrução new",
							"c)-> possuir apenas assinaturas de métodos públicos e protegidos.",
							"d)-> possuir métodos abstratos e estáticos.",
							"e)-> conter declarações de constantes e de variáveis não inicializadas."};
		
		String resposta2 =   "c";
		
		
		String pergunta3 = "Sobre o uso da palavra-chave ‘final’ em Java, assinale a alternativa correta.";
		
		String opçoes3 [] = {"a) -> É utilizada para a definição de constantes dentro da linguagem.",
							 "b) -> Indica o fim de um arquivo de código fonte em Java.",
							 "c) -> Pode ser substituída pela palavra-chave ‘static’, tendo em vista que ambas têm efeitos idênticos.",
							 "d) -> Pode ser apenas utilizada na declaração de classes.",
							 "e) -> Uma variável com qualificador ‘final’ pode ter seu valor modificado a qualquer momento da execução de um programa."};
		String resposta3 = "a";
			
		
		String pergunta4 = "Qual das alternativas abaixo apresenta um método que concatena dois objetos do tipo String em Java?";
		
		String opçoes4 [] = {"a) -> Método ‘endsWith’ em ‘String’",
				 			 "b) -> Método ‘charAt’",
				 			 "c) -> Sobrecarga do operador ‘+’",
				 			 "d) -> Método ‘substring’",
				 			 "e) -> Sobrecarga do operador ‘++’"};
		
		String resposta4 = "c";
		
		String pergunta5 = "Qual a saida do programa abaixo?"
						 + "O programaJava public class enigma "
						 + "{    "
						 + "	public static void main(String args[]) "
						 + "	{        "
						 		+ "int m=0, n=2;        "
						 		+ "do "
						 		+ "{           "
						 				+ "m = ++m;            "
						 				+ "n--;        "
						 		+ "} while(n>0);        "
						 		+ "System.out.println(m);    "
						 		+ "}"
						 + "}";
		
		String opçoes5 [] = {"a) -> 0",
				 			 "b) -> 1",
				 			 "c) -> 2",
				 			 "d) -> 3",
				 			 "e) -> 4"};
		
		String resposta5 = "c";
		
		
		String pergunta6 = "O seguinte trecho de código cria um array em linguagem Java e o inicializa: "
							+ "int[] array; array = new int[2]; int[0] = 1; int[1] = 2; int[2] = 3; "
							+ "Este array é exemplo de ";
		
		String opçoes6 [] = {"a) -> uma variável composta homogênea.",
				 			 "b) -> uma expressão.",
				 			 "c) -> uma string heterogênea.",
				 			 "d) -> Muma constante.Responder.",
				 			 "e) -> nda"};
		
		String resposta6 = "a";
		
		//criação das instâncias da classe Questão, questão1
		Questão questao1 = new Questão(pergunta1, opçoes1, resposta1);
		Questão questao2 = new Questão(pergunta2, opçoes2, resposta2);
		Questão questao3 = new Questão(pergunta3, opçoes3, resposta3);
		Questão questao4 = new Questão(pergunta4, opçoes4, resposta4);
		Questão questao5 = new Questão(pergunta5, opçoes5, resposta5);
		
		Fachada.getInstance().cadastrar(questao1);
		Fachada.getInstance().cadastrar(questao2);
		Fachada.getInstance().cadastrar(questao3);
		Fachada.getInstance().cadastrar(questao4);
		Fachada.getInstance().cadastrar(questao5);
		
		//Fachada.getInstance().cadastrar(questao0);
		//Fachada.getInstance().atualizar(questao1, questao2);
		//Fachada.getInstance().remover(questao2);
		//Questão[] Questoes = Fachada.getInstance().getArrayQ();
		 
		System.out.println();
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
		Aluno aluno1 = new Aluno("neriton", "07336030416","12345");
		Fachada.getInstance().cadastrar(aluno1);//cadastrando aluno 
		Login loginA = new Login("07336030416","12345");//criando login a ser usado  no metodo efeturar login
		
		Aluno[] alunosCadastrados = Fachada.getInstance().getArray(); //obtendo array com alunos que ja foram cadastrados pelo metodo getArray no repositorioAlunoArray
		Aluno alunoRetornado1 = Fachada.getInstance().efetuarLogin(loginA,alunosCadastrados);// efetuando login
		
		Questão[] Questoes = Fachada.getInstance().getArrayQ();//obtendo o array com Questoes que ja foram Cadastradas pelo metodo getArrayQ no respositorioQuestãoArray
		
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

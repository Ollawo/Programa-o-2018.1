package aplica��o;

import neg�cios.Quest�o;

public class Perguntas 
{
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
}

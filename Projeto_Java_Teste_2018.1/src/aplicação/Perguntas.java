package aplicação;

import negócios.Questão;

public class Perguntas 
{
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
}

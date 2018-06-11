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
import negócios.Teste;

public class Teste_Sistema 
{
	public static void main(String[] args) 
	{
		
		String Nome ="neriton";
		String Matricula ="12345 ";
		String Login ="neto";
		String Senha ="07336030416";
		
		
		Usuario usuario = new Usuario();
		usuario.Cadastro(Nome,  Matricula,  Login, Senha);
		Fachada.getInstance().Cadastro(usuario);
		
		String LoginTeste ="neto";// só mudar algo em um dos parametros que conseguimos verificar. obs: esse teste é superficial vai requere ajustes.
		String SenhaTeste ="07336030416";
		
		Login login = new Login();
		login.efetuarLogin(LoginTeste, SenhaTeste, usuario);
		Fachada.getInstance().Login(login);
		
		String pergunta = "1)Qual o segredo para passar em java?";
		String opçoes [] = {"a) -> progamar muito!","b) -> estudar muito!","c) -> rezar!","d) -> fazer simulações!","e)->Estudar e programar muito!"};
		String resposta = "e)";
		
		Questão questao0 = new Questão();
		
		String pergunta1 = "2)Qual";
		String opçoes1 [] = {"a) ->","b) ->","c) -> ","d) ->","e)->"};
		String resposta1 = "e)";
	
		Questão questao1 = new Questão();	
		questao0.gerarQuestao(pergunta,opçoes,resposta);
		questao1.gerarQuestao(pergunta1,opçoes1,resposta1);
		
		Questão questaoSave = new Questão();
		questaoSave.gerarQuestao("teste", opçoes, "resposta indefinida");
		Questão[] Questao = {questao0,questao1};
		questaoSave.setQuestao(Questao);
		
		System.out.println(questaoSave.toString());
		
		Teste teste = new Teste(usuario);
		teste.gerarTeste(Questao);
		teste.gerarNota();
		
		System.out.println(teste.getNumeroAcertos());
		
		System.out.println(teste.getNumeroTentativas());
		
		System.out.println(teste.gerarRelatorio(teste));
		
		Relatório relatorio = new Relatório();
		relatorio.SalvarTestes(teste);
		relatorio.ListarTestes();
		
		
	}
}

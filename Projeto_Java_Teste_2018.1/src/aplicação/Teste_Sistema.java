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
import neg�cios.Teste;

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
		
		String LoginTeste ="neto";// s� mudar algo em um dos parametros que conseguimos verificar. obs: esse teste � superficial vai requere ajustes.
		String SenhaTeste ="07336030416";
		
		Login login = new Login();
		login.efetuarLogin(LoginTeste, SenhaTeste, usuario);
		Fachada.getInstance().Login(login);
		
		String pergunta = "1)Qual o segredo para passar em java?";
		String op�oes [] = {"a) -> progamar muito!","b) -> estudar muito!","c) -> rezar!","d) -> fazer simula��es!","e)->Estudar e programar muito!"};
		String resposta = "e)";
		
		Quest�o questao0 = new Quest�o();
		
		String pergunta1 = "2)Qual";
		String op�oes1 [] = {"a) ->","b) ->","c) -> ","d) ->","e)->"};
		String resposta1 = "e)";
	
		Quest�o questao1 = new Quest�o();	
		questao0.gerarQuestao(pergunta,op�oes,resposta);
		questao1.gerarQuestao(pergunta1,op�oes1,resposta1);
		
		Quest�o questaoSave = new Quest�o();
		questaoSave.gerarQuestao("teste", op�oes, "resposta indefinida");
		Quest�o[] Questao = {questao0,questao1};
		questaoSave.setQuestao(Questao);
		
		System.out.println(questaoSave.toString());
		
		Teste teste = new Teste(usuario);
		teste.gerarTeste(Questao);
		teste.gerarNota();
		
		System.out.println(teste.getNumeroAcertos());
		
		System.out.println(teste.getNumeroTentativas());
		
		System.out.println(teste.gerarRelatorio(teste));
		
		Relat�rio relatorio = new Relat�rio();
		relatorio.SalvarTestes(teste);
		relatorio.ListarTestes();
		
		
	}
}

package repositorio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import negoócos_dados.Interface_Repositóiro_Teste;
import negócios.Login;
import negócios.Usuario;
import negócios.Teste;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Implementação_Repositório_Teste implements Interface_Repositóiro_Teste 
{

	public void inserirPessoa(Usuario pessoa) 
	{
		Path caminho = Paths.get("C:/Users/Nériton carlos/Downloads/programas java/salvando.txt");
	
		String escrita = pessoa.toString();
		byte[] textoEscrito = escrita.getBytes();
		try 
		{
			
			Files.write(caminho,textoEscrito);
			System.out.println("salvou!");
		
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}
	public void verificarLogin(Login login) 
	{
		
	}

	public void iniciarTeste(Usuario pessoa, int numeroTentativas, int numeroAcertos, double nota)
	{
		
	}
	
}

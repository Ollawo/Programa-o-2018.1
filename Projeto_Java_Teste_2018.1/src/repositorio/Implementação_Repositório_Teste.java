package repositorio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import nego�cos_dados.Interface_Reposit�iro_Teste;
import neg�cios.Login;
import neg�cios.Usuario;
import neg�cios.Teste;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Implementa��o_Reposit�rio_Teste implements Interface_Reposit�iro_Teste 
{

	public void inserirPessoa(Usuario pessoa) 
	{
		Path caminho = Paths.get("C:/Users/N�riton carlos/Downloads/programas java/salvando.txt");
	
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

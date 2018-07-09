package negócios;

import java.util.Arrays;
import negócios.Teste;

public class Relatório 
{
	
	public Relatório()
	{
		
	}
	
	public void ListarTestes(String [] testesFeitos)
	{
		for(int i = 0 ; i<testesFeitos.length; i++)
	      {
	        	System.out.println(testesFeitos[i]);
	      }		
	}
	
}

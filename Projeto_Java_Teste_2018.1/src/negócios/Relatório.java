package negócios;

import java.util.Arrays;
import negócios.Teste;

public class Relatório 
{
	private Teste[]testes = new Teste[5];
	private int indice;
	public Relatório()
	{
		this.indice = 0;
	}
	
	public void SalvarTestes(Teste teste)
	{
		this.testes[indice] = teste;
		this.indice = indice + 1;		
	}
	
	public void ListarTestes()
	{
		for(int i = 0 ; i<testes.length; i++)
	      {
	        	System.out.println(testes[i]);
	      }		
	}

	@Override
	public String toString() 
	{
		return "Relatório [testes=" + Arrays.toString(testes) + "]";
	}
	
}

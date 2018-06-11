package neg�cios;

import java.util.Arrays;
import neg�cios.Teste;

public class Relat�rio 
{
	private Teste[]testes = new Teste[5];
	private int indice;
	public Relat�rio()
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
		return "Relat�rio [testes=" + Arrays.toString(testes) + "]";
	}
	
}

package negócios;

public class Usuario 
{
	private int numerosCadastro = 0;
	
	public Usuario()
	{
		this.numerosCadastro++;
				
	}

	public void setNumerosCadastro() 
	{
		this.numerosCadastro++;
	}
	
	public int getNumerosCadastro() 
	{
		return numerosCadastro;
	}
	

	
}

package neg�cios;
import java.util.Scanner;

import neg�cios.Quest�o;

public class Teste 
{
	private Usuario pessoa;
	private int numeroTentativas;
	private int numeroAcertos;
	private double nota;

	
	
	
	Scanner input = new Scanner(System.in);
	
	public Teste(Usuario pessoa) 
	{
		this.pessoa = pessoa;
		this.numeroTentativas = 0;
		this.numeroAcertos = 0;
		this.nota = 0.0;
	}
	public void gerarTeste(Quest�o[] teste)
	{
		do
		{
			for(int i = 0 ; i<teste.length; i++)
			{
				Quest�o Rquestao = new Quest�o();
				Rquestao = teste[i];
				System.out.println(Rquestao.getPergunta());		
				
				String op�oes[] = Rquestao.getOpcoes();
				for(int j = 0; j< op�oes.length; j++)
				{
					System.out.println(op�oes[j]);
				}	
				System.out.println();
				String Resposta = input.nextLine();
				if(Resposta.equalsIgnoreCase(Rquestao.getResposta()))
				{
					System.out.println();
					this.numeroAcertos++;
					this.nota++;
				}
				else
				{
					System.out.println("Alternativa incorreta!");
				}
			}
			this.numeroTentativas =  numeroTentativas + 1;	
		}while(this.numeroTentativas!=3);
				
	}
	public double gerarNota()
	{
		return this.nota ;
	}
	
	public String gerarRelatorio(Teste teste)
	{
		String Relatorio = teste.toString();
		return Relatorio;
	}
	
	@Override
	public String toString() {
		return "Teste [pessoa=" + pessoa + ", numeroTentativas=" + numeroTentativas + ", numeroAcertos=" + numeroAcertos
				+ ", nota=" + nota + "]";
	}
	public Usuario getPessoa() 
	{
		return pessoa;
	}
	
	public void setPessoa(Usuario pessoa)
	{
		this.pessoa = pessoa;
	}
	
	public int getNumeroTentativas() 
	{
		return numeroTentativas;
	}
	
	public void setNumeroTentativas(int numeroTentativas) 
	{
		this.numeroTentativas = numeroTentativas;
	}
	public int getNumeroAcertos() 
	{
		return numeroAcertos;
	}
	
	public void setNumeroAcertos(int numeroAcertos) 
	{
		this.numeroAcertos = numeroAcertos;
	}
	
	public double getNota() 
	{
		return nota;
	}
	
	public void setNota(double nota) 
	{
		this.nota = nota;
	}
	
}

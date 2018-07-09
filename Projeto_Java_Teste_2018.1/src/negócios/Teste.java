package negócios;
import java.util.Scanner;

import negócios.Questão;

public class Teste 
{
	private Aluno aluno;
	private int numeroTentativas;
	private int numeroAcertos;
	private double nota;
	
	
	public Teste(Aluno aluno) 
	{
		this.aluno = aluno;
		this.numeroTentativas = 0;
		this.numeroAcertos = 0;
		this.nota = 0.0;
	}
	
	public double gerarNota()
	{
		return this.nota ;
	}
	
	@Override
	public String toString() 
	{
		return "Teste [Aluno = " + aluno + ",Tentativas=" + numeroTentativas + ", Acertos=" + numeroAcertos
				+ ", nota=" + nota + "]";
	}
	public Aluno getAluno() 
	{
		return aluno;
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

package repositorio;

import negócios.Aluno;
import negócios_dados.Repositório_Aluno;

public class RepositórioAlunoArray implements Repositório_Aluno 
{
	private Aluno[] alunos;
	private int indice;
	
	private final static int TAMANHO=5;
	
	public RepositórioAlunoArray() 
	{
		this.alunos = new Aluno[TAMANHO];
		this.indice = 0;
		
		Aluno alunoPadrao = new Aluno("vazio","vazio","vazio");
        for (int i = 0 ; i<alunos.length; i++) 
        {
        	this.alunos[i] = alunoPadrao;
        }
	}
		
	@Override
	public void inserir(Aluno usuario) 
	{
		 
		if(indice==0)
		{
			this.alunos[indice] = usuario;
			this.indice = this.indice + 1;
			System.out.println("Sucesso!");
		}
		
		else
		{
			Aluno AlunoTemp = procurar(usuario);
			
			if(AlunoTemp != null)
			{
				System.out.println("Erro!");
				//retorno deve ser um boolean true or false para dizer se cadastrou ou nao
			}
			
			else
			{
				this.alunos[indice] = usuario;
				this.indice = this.indice + 1;
				System.out.println("Sucesso!");
			}
		}
					
	}

	public Aluno procurar(Aluno usuario) 
	{
		Aluno alunoRetorno = null;
        for (Aluno aluno :alunos) 
        {
            if (aluno.getMatricula().equals(usuario.getMatricula())) 
            {
                alunoRetorno = aluno;
            }
        }
        return alunoRetorno;
    } 
	
	@Override
	public void atualizar(Aluno usuario1,Aluno usuario2) 
	{
		Aluno AlunoTemp = procurar(usuario1);
		 
		for (int i = 0 ; i<alunos.length; i++) 
        {
        	if(AlunoTemp.equals(alunos[i]))
    		{
        		this.alunos[i] = usuario2;
    		}
        }
	}

	@Override
	public void remover(Aluno usuario) 
	{
		Aluno alunoPadrao = new Aluno("vazio","vazio","vazio");
		Aluno alunoRemovido = procurar(usuario);
		
		for (int i = 0 ; i<alunos.length; i++) 
        {
        	if(alunoRemovido.equals(alunos[i]))
    		{
        		this.alunos[i] = alunoPadrao;
    		}
        }
	}
	public Aluno[] getArray()
	{
		return this.alunos;
	}
}

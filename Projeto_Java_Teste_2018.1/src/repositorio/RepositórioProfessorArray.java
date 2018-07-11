package repositorio;

import negócios.Professor;
import negóciosdados.RepositórioProfessor;

public class RepositórioProfessorArray implements RepositórioProfessor
{
	private Professor[] professores;
	private int indice;
	
	private final static int TAMANHO=5;
	
	public RepositórioProfessorArray() 
	{
		this.professores = new Professor[TAMANHO];
		this.indice = 0;
		
		Professor professorPadrao = new Professor("vazio","vazio","vazio");
        for (int i = 0 ; i<professores.length; i++) 
        {
        	this.professores[i] = professorPadrao;
        }
	}
		
	@Override
	public void inserir(Professor usuario) 
	{
		 
		if(indice==0)
		{
			this.professores[indice] = usuario;
			this.indice = this.indice + 1;
			System.out.println("Sucesso!");
		}
		
		else
		{
			Professor professorTemp = procurar(usuario);
			
			if(professorTemp != null)
			{
				System.out.println("Erro!");
			}
			
			else
			{
				this.professores[indice] = usuario;
				this.indice = this.indice + 1;
				System.out.println("Sucesso!");
			}
		}			
	}

	public Professor procurar(Professor usuario) 
	{
		Professor professorRetorno = null;
        for (Professor professor :professores) 
        {
            if (professor.getMatricula().equals(usuario.getMatricula())) 
            {
                professorRetorno = professor;
            }
        }
        return professorRetorno;
    } 
	
	@Override
	public void atualizar(Professor usuario1,Professor usuario2) 
	{
		Professor professorTemp = procurar(usuario1);
		 
		for (int i = 0 ; i<professores.length; i++) 
        {
        	if(professorTemp.equals(professores[i]))
    		{
        		this.professores[i] = usuario2;
    		}
        }
	}

	@Override
	public void remover(Professor usuario) 
	{
		Professor professorPadrao = new Professor("vazio","vazio","vazio");
		Professor professorRemovido = procurar(usuario);
		
		for (int i = 0 ; i<professores.length; i++) 
        {
        	if(professorRemovido.equals(professores[i]))
    		{
        		this.professores[i] = professorPadrao;
    		}
        }
	}
	public Professor[] getArrayP() 
	{
		return this.professores;
	}
}

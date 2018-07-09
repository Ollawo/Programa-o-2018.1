package negócios;

public class Aluno extends Usuario
{

	private String nome;
	private String matricula;
	private String senha;
	
	public Aluno(String Nome, String Matricula, String Senha) 
	{
		this.nome = Nome;
		this.matricula = Matricula;
		this.senha = Senha;
			
		super.setNumerosCadastro();
	}

	public String getNome() 
	{
		return nome;
	}

	public String getMatricula() 
	{
		return matricula;
	}
	
	public String getSenha() 
	{
		return senha;
	}


	@Override
	public String toString() {
		return "Usuario_Aluno [" + getNome() + ", Matricula = " + getMatricula() + ", Senha = " + getSenha() + "]";
	}
	
}

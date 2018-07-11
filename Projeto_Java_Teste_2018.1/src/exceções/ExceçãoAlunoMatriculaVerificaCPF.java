package exceções;

import java.util.InputMismatchException;

import negócios.Aluno;

public class ExceçãoAlunoMatriculaVerificaCPF {

	public ExceçãoAlunoMatriculaVerificaCPF() {
		// TODO Auto-generated constructor stub
	}

	public static boolean Verifica(Aluno aluno) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		    if (aluno.getMatricula().equals("00000000000") || aluno.getMatricula().equals("11111111111") ||
		    		aluno.getMatricula().equals("22222222222") || aluno.getMatricula().equals("33333333333") ||
		    		aluno.getMatricula().equals("44444444444") || aluno.getMatricula().equals("55555555555") ||
		    		aluno.getMatricula().equals("66666666666") || aluno.getMatricula().equals("77777777777") ||
		    		aluno.getMatricula().equals("88888888888") || aluno.getMatricula().equals("99999999999") ||
		       (aluno.getMatricula().length() != 11))
		       return(false);
		 
		    char dig10, dig11;
		    int sm, i, r, num, peso;
		 
		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		    try {
		// Calculo do 1o. Digito Verificador
		      sm = 0;
		      peso = 10;
		      for (i=0; i<9; i++) {              
		// converte o i-esimo caractere do CPF em um numero:
		// por exemplo, transforma o caractere '0' no inteiro 0         
		// (48 eh a posicao de '0' na tabela ASCII)         
		        num = (int)(aluno.getMatricula().charAt(i) - 48); 
		        sm = sm + (num * peso);
		        peso = peso - 1;
		      }
		 
		      r = 11 - (sm % 11);
		      if ((r == 10) || (r == 11))
		         dig10 = '0';
		      else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
		 
		// Calculo do 2o. Digito Verificador
		      sm = 0;
		      peso = 11;
		      for(i=0; i<10; i++) {
		        num = (int)(aluno.getMatricula().charAt(i) - 48);
		        sm = sm + (num * peso);
		        peso = peso - 1;
		      }
		 
		      r = 11 - (sm % 11);
		      if ((r == 10) || (r == 11))
		         dig11 = '0';
		      else dig11 = (char)(r + 48);
		 
		// Verifica se os digitos calculados conferem com os digitos informados.
		      if ((dig10 == aluno.getMatricula().charAt(9)) && (dig11 == aluno.getMatricula().charAt(10)))
		         return(true);
		      else return(false);
		    } catch (InputMismatchException erro) {
		        return(false);
		    }
		  }
		 
		
}

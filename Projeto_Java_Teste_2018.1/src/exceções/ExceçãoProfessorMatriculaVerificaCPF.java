package exce��es;

import java.util.InputMismatchException;

import neg�cios.Professor;

public class Exce��oProfessorMatriculaVerificaCPF {

	public Exce��oProfessorMatriculaVerificaCPF() {
		// TODO Auto-generated constructor stub
	}

	public static boolean Verifica(Professor professor) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		    if (professor.getMatricula().equals("00000000000") || professor.getMatricula().equals("11111111111") ||
		    		professor.getMatricula().equals("22222222222") || professor.getMatricula().equals("33333333333") ||
		    		professor.getMatricula().equals("44444444444") || professor.getMatricula().equals("55555555555") ||
		    		professor.getMatricula().equals("66666666666") || professor.getMatricula().equals("77777777777") ||
		    		professor.getMatricula().equals("88888888888") || professor.getMatricula().equals("99999999999") ||
		       (professor.getMatricula().length() != 11))
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
		        num = (int)(professor.getMatricula().charAt(i) - 48); 
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
		        num = (int)(professor.getMatricula().charAt(i) - 48);
		        sm = sm + (num * peso);
		        peso = peso - 1;
		      }
		 
		      r = 11 - (sm % 11);
		      if ((r == 10) || (r == 11))
		         dig11 = '0';
		      else dig11 = (char)(r + 48);
		 
		// Verifica se os digitos calculados conferem com os digitos informados.
		      if ((dig10 == professor.getMatricula().charAt(9)) && (dig11 == professor.getMatricula().charAt(10)))
		         return(true);
		      else return(false);
		    } catch (InputMismatchException erro) {
		        return(false);
		    }
		  }
		 
		
}

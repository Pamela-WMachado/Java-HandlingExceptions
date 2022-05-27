package tratamentoExcecao;

import javax.swing.JOptionPane;

import entidades.Contato;

public class Tratamento {
	
	public static void main (String[] args) {
		TratandoExceçoesGerais();
		usandoFinallyNoTratamentoDeExceçoes();
	}
	
	
	public static void TratandoExceçoesGerais() {
		//instanciando classe contato para testar com valor null
		
		Contato ct = new Contato();
		int x = 10;
		int y = 2;
		try {
			//testa apenas o primeiro caso com erro, os demais nao sao executados(portanto vamos "arrumando" eles conforme os testes sao feitos
			int[] numeros = {10, 20, 30};
			System.out.println(numeros[2]);
			
			int z = x / y;
			System.out.println(z);
			
			//setando valor null a ct
			ct.setNome("maria");
			System.out.println(ct.getNome());
			
			//testando com JOPTION PANE 
			String speso = JOptionPane.showInputDialog("Informe peso");
			float peso = Float.parseFloat(speso);
			System.out.println(speso);
		}
		//CATCHES ESPECÍFICOS
		catch(ArithmeticException e) {
			System.out.printf("Não é possível dividir %d por %d %n", x, y);
			System.out.println("toestring: " + e.toString());
			System.out.println("Message" + e.getMessage());
			System.out.println("Stack: " + e.getStackTrace());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
		}
		catch(NullPointerException e) {
			System.out.println("Exceção na execução do programa: " + e.toString());

		}
		catch(NumberFormatException e) {
			System.out.println("Entrada Incorreta: " + e.getMessage());

		} 
		 
		//CATCH GERAL
		catch (Exception e) {
			System.out.println("Exceção na execução do programa: " + e.getMessage());
		}	
	}
	
	//simulacao de tratamento de exceçao em erro de conexao com banco
	public static void usandoFinallyNoTratamentoDeExceçoes() {
		try {
			//inicia conexao com banco de dados
			//envia query p/ o banco (insert into...)
			System.out.println("Conectou ao banco");
			int x = 10;
			String divisor = JOptionPane.showInputDialog("Teste a conexão informando um divisor");
			int y = Integer.parseInt(divisor);
			int z = x / y;
		}
		catch(Exception e) {
			//tratar o erro
			System.out.println("Ocorreu erro");
			
		}
		finally {
			//finaliza conexao
			System.out.println("Encerrou conexão");
		}
	}

	
	
	
}

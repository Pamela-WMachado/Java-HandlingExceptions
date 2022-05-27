package tratamentoExcecao;

import javax.swing.JOptionPane;

import entidades.Contato;

public class Tratamento {

	public static void main(String[] args) {
		//instanciando classe contato para testar com valor null
		Contato ct = new Contato();
		int x = 10;
		int y = 2;
		try {
			//testa apenas o primeiro caso com erro, os demais nao sao executados
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
		/* CATCHES ESPECÍFICOS
		catch(ArithmeticException e) {
			System.out.printf("Não é possível dividir %d por %d %n", x, y);
			System.out.println("toestring: " + e.toString());
			System.out.println("Message" + e.getMessage());
			System.out.println("Stack: " + e.getStackTrace());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
		} */
		//CATCH GERAL
		catch (Exception e) {
			System.out.println("Exceção na execução do programa: " + e.getMessage());
			System.out.println("Exceção na execução do programa: " + e.toString());
		}
		
	}

}

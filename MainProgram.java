package funcaocontar;

import javax.swing.JOptionPane;

public class MainProgram {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Vai começar a contagem: "+Operacoes.contador(1,5));
		System.out.println("Vai começar a contagem: ");
		System.out.println(Operacoes.contador(1,5));
	}

}

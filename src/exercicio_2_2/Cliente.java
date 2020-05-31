package exercicio_2_2;

import javax.swing.JOptionPane;

public class Cliente {

	public static void main(String[] args) {
		
		DisplayProvedora provedora;
		
		
		String senha = JOptionPane.showInputDialog("Insira a senha:");
		
		if(senha.equals("desi gnpatt er ns")) {
			
			JOptionPane.showMessageDialog(null, "Você digitou a senha correta");
			provedora = new ProvedorConfidencial();
			provedora.display();
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Você não sabe a senha so ve informacao publica!");
			provedora = new ProvedoraPublico();
			
			provedora.display();
			
			
		}

		
	}
	
}

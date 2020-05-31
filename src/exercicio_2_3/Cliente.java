package exercicio_2_3;

import javax.swing.JOptionPane;

public class Cliente {
	
	public static void main(String[] args) {
		
		String r = JOptionPane.showInputDialog("Escolhas arquivo ou console");
		Log log = null;
		
		if(r.equals("arquivo")) {
			JOptionPane.showMessageDialog(null, "Você escolheu a opção 'arquivo'");		
			log = new LogArquivo();
			
		}else if(r.equals("console")) {
			
			JOptionPane.showMessageDialog(null, "Você escolheu a opção 'console'");		
			log = new LogConsole();
		}else {
			JOptionPane.showMessageDialog(null, "voce digitou a opção errada!");	
			System.exit(1);
		}

		for (int i = 1; i <= 10; i++)
			log.escreverLog("Contando: " + i);
	}
}

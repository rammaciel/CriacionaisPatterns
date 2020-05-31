package exercicio_2_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FerramentaArquivo extends Ferramenta {
	private File arquivoLog;

	public FerramentaArquivo() {
		String pacote = "D:\\Faculdade\\Arquitetura Desenvolvimento Sistema\\RepositorioGit\\Aula07\\ccp_aula07\\src\\exercicio_2_3\\";
		arquivoLog = new File(pacote, "log.txt");

		try {
			if (!arquivoLog.exists())
				arquivoLog.createNewFile();
		} catch (IOException e) {
			System.out.println("Não foi possível criar o arquivo de log:\n" + e);
			System.exit(1);
		}
	}

	public void registrarLog(String mensagem) {
		try {
			FileWriter writer = new FileWriter(arquivoLog, true);
			writer.write(mensagem + "\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("Não foi possível escrever no arquivo de log:\n" + e);
			System.exit(1);
		}
	}
}

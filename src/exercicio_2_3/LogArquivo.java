package exercicio_2_3;

public class LogArquivo extends Log {
	protected Ferramenta criarFerramentaLog() {
		return new FerramentaArquivo();
	}
}

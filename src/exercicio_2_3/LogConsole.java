package exercicio_2_3;

public class LogConsole extends Log {

	protected Ferramenta criarFerramentaLog() {
		return new FerramentaConsole();
	}
}
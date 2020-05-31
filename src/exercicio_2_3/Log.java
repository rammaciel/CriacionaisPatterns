package exercicio_2_3;

public abstract class Log {
	private Ferramenta log;

	protected abstract Ferramenta criarFerramentaLog();

	public void escreverLog(String mensagem) {
		if (log == null)
			log = criarFerramentaLog();
		log.registrarLog(mensagem);
	}
}


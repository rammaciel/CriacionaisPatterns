package exercicio_3_1;

class Incremental {
	private static Incremental singletonInstance;
	private static int count = 0;
	private int numero;

	private Incremental() {
		numero = ++count;
	}

	synchronized static Incremental getInstance() {
		if (singletonInstance == null)
			singletonInstance = new Incremental();

		return singletonInstance;
	}

	public String toString() {
		return "Incrementando: " + numero;
	}
}

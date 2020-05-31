package exercicio_2_2;

public class ProvedorConfidencial extends DisplayProvedora {

	@Override
	public Informacao getInformacao() {
	
		return new InformacaoConfidencial();
	}

}

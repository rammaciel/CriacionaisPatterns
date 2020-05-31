package exercicio_2_2;

public class ProvedoraPublico extends DisplayProvedora{
	
	@Override
	public Informacao getInformacao() {
		
		return new InformacaoPublico();
	}

}

package exercicio_2_1;

public class NomeInversoParser extends NameParserCreator {

	@Override
	protected NameParser getParser() {
		// TODO Auto-generated method stub
		return new NomeInverso();
	}

}

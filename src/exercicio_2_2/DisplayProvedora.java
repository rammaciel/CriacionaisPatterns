package exercicio_2_2;

public abstract class DisplayProvedora {
	
	public void display (){
		
		Informacao info = getInformacao();
		String msg = info.informacao();
		System.out.println(msg);
					
	}
	
	protected abstract Informacao getInformacao();
	
	

}

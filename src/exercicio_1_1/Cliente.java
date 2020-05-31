package exercicio_1_1;

public class Cliente {
	
	public static void main (String[] args) {
		
		Fabrica fabrica = new FabricaImprime();
		
		Produto produto = null;
		
		produto = fabrica.getProduto(FabricaImprime.SCREEN);
		
		produto.imprimir();
		
		System.out.println("------------------------------");
		
		produto = fabrica.getProduto(FabricaImprime.FILE);
		produto.imprimir();
		
		
		
	}

}

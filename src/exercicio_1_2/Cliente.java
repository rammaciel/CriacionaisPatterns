package exercicio_1_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente {

	public static void main(String[] args) {
		
		String data = "18/05/2020";
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		
		Date hoje = null;
		try {
			hoje = formater.parse(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar c = Calendar.getInstance();
		c.setTime(hoje);
		int diaSemana = c.get(Calendar.DAY_OF_WEEK);
		
		Fabrica fabrica = FabricaProducer.getFabrica(FabricaProducer.CALZONERIA);
		Produto pizza = null;
		
		switch(diaSemana) {
		case 2: case 4: case 6:
			pizza = fabrica.getProduto(Pizzaria.CALABRESA);
			break;
		case 3: case 5: case 7:
			pizza = fabrica.getProduto(Pizzaria.PRESUNTO);
			break;
		default: 
			System.out.println("Domingo não tem Pizza.");
		}
		if(pizza != null) {
			String sabor = pizza.fazer();
			System.out.println(sabor);
		}
	}

}

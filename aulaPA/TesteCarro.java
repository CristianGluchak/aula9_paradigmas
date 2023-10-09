package aulaPA;

public class TesteCarro {
	public static void main(String[] args) {
		Informacao car1 = new Informacao(null, null, null, null);
		
		 
		car1.setAnoFrabricacao("2001");
		car1.setCor("verde");
		car1.setMarca("Escort");
		car1.setVelocidadeMax("122 km/h");
		car1.setChassis("acabado");
		car1.setMotor("fundido");
		car1.setCambio("manual");
		
		car1.Liga();
		car1.Acelara();
		car1.Freia();
		car1.Desliga();
		System.out.println(car1.getCor());
		
		Informacao car2 = new Informacao(null, null, null, null);
		
 
		car2.setAnoFrabricacao("2004");
		car2.setCor("branco");
		car2.setMarca("palio");
		car2.setVelocidadeMax("111 km/h");
		car2.setChassis("novo");
		car2.setMotor("fundido");
		car2.setCambio("manual");
		car2.Liga();
		car2.Acelara();
		car2.Freia();
		car2.Desliga();
		System.out.println(car2.getCor());
		
		Informacao car3 = new Informacao(null, null, null, null);
		
		car3.setAnoFrabricacao("2003");
		car3.setCor("preto");
		car3.setMarca("Gol");
		car3.setVelocidadeMax("113 km/h");
		car2.setChassis("acabado");
		car2.setMotor("novo");
		car2.setCambio("automatico");
		car3.Liga();
		car3.Acelara();
		car3.Freia();
		car3.Desliga();
		System.out.println(car3.getCor()); 
		
	}
}

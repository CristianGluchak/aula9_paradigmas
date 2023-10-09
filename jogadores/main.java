package jogadores;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Atributos j1 = new Atributos();
		Atributos j2 = new Atributos();
		Atributos j3 = new Atributos();
		Scanner sc = new Scanner(System.in);
		
		
		j1.setNome("Nome: Dida");
		j1.setIdade(50);
		j1.setEndereco("Endereco: onde juda perdeu as botas");
		j1.setCabeca("cabeca: cabeca inutil em jogo");
		j1.setPernaE("perna esquerda : boa capacidade de chute");
		j1.setPernD("perna direita : Perna inutil em campo");
		j1.setTroco("Tronco em V");
		
		
		j2.setNome("Nome: Ronaldo");
		j2.setIdade(60);
		j2.setEndereco("Endereco: onde juda perdeu as meias");
		j2.setCabeca("cabeca: cabeca raramente usado em jogo");
		j2.setPernaE("perna esquerda : otima capacidade de chute");
		j2.setPernD("perna direita : otima perna em campo");
		j2.setTroco("Tronco em V");
		
		
		j3.setNome("Nome: Juninho");
		j3.setIdade(70);
		j3.setEndereco("Endereco: onde juda perdeu esperancas");
		j3.setCabeca("cabeca: cabeca inutil em jogo");
		j3.setPernaE("perna esquerda : boa capacidade de chute");
		j3.setPernD("perna direita : Perna inutil em campo");
		j3.setTroco("Tronco em V");
		
		

		System.out.println("selecione o jogador");
		System.out.println("1-Dida 2-Ronaldo 3-Juninho");
		int val = sc.nextInt();
		
		switch (val) {
		  case 1:System.out.println(
				j1.getNome()+"\n"+
				"idade: "+j1.getIdade()+"\n"+
				j1.getEndereco()+"\n"+
				j1.getTroco()+"\n"+
				j1.getPernD()+"\n"+
				j1.getPernaE()+"\n"+
				j1.getCabeca());
		    break;
		  case 2:
			  System.out.println(
						j2.getNome()+"\n"+
						"idade: "+j2.getIdade()+"\n"+
						j2.getEndereco()+"\n"+
						j2.getTroco()+"\n"+
						j2.getPernD()+"\n"+
						j2.getPernaE()+"\n"+
						j2.getCabeca());
		    break;
		  case 3:
			  System.out.println(
						j3.getNome()+"\n"+
						"idade: "+j3.getIdade()+"\n"+
						j3.getEndereco()+"\n"+
						j3.getTroco()+"\n"+
						j3.getPernD()+"\n"+
						j3.getPernaE()+"\n"+
						j3.getCabeca());
		    break;
		}
	}
	
}

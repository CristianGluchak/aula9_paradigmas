package aulaPA;

public class Informacao {
	private String anoFrabricacao;
	private String cor;
	private String marca;
	private String velocidadeMax;

	private String motor;
	private String cambio;
	private String Chassis;
	private String banco;
	
	public Informacao(String Ano, String cor, String marca, String vel){
		this.anoFrabricacao = Ano;
		this.cor = cor;
		this.marca= marca;
		this.velocidadeMax = vel;
	}
	
	
	public String getAnoFrabricacao() {
		return anoFrabricacao;
	}
	public void setAnoFrabricacao(String anoFrabricacao) {
		this.anoFrabricacao = anoFrabricacao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(String velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	
	public void Liga() {
		System.out.println("Carro sendo Ligado");
		
	}
	
	public void Desliga(){
		System.out.println("Carro sendo Desligado");
	}
	
	public void Acelara() {
		System.out.println("Carro Acelerando");
	}
	public void Freia() {
		System.out.println("Carro Freiando");
	}
	
	
	
	
	
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String getChassis() {
		return Chassis;
	}
	public void setChassis(String chassis) {
		this.Chassis = chassis;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
}

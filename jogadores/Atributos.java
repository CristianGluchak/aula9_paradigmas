package jogadores;

public class Atributos {
	private String nome;
	private int idade;
	private String endereco;
	private String Troco;
	private String PernD;
	private String pernaE;
	private String cabeca;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTroco() {
		return Troco;
	}
	public void setTroco(String troco) {
		Troco = troco;
	}
	public String getPernD() {
		return PernD;
	}
	public void setPernD(String pernD) {
		PernD = pernD;
	}
	public String getPernaE() {
		return pernaE;
	}
	public void setPernaE(String pernaE) {
		this.pernaE = pernaE;
	}
	public String getCabeca() {
		return cabeca;
	}
	public void setCabeca(String cabeca) {
		this.cabeca = cabeca;
	}

	
	
	public void Lernome() {
		System.out.println("Nome do Jogador:" + this.nome);
	}
	
	public void  Corre() {
		System.out.println("Jogador "+ this.nome + " correndo!!!!");
	}
	
	public void Salte() {
		System.out.println("Jogador "+ this.nome + "pulando");
	}
	
	public void Chute() {
		System.out.println("Jogador " +this.nome + " chutando");
	}
	
	
	
}

package avaliacao;

public class Pessoa {
	
	private String nome;
	private int idade;
	
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
	
	public static String idoso(Pessoa pessoa1, Pessoa pessoa2) {
		if(pessoa1.getIdade() > pessoa2.getIdade()) {
			return pessoa1.getNome();
		} else {
			return pessoa2.getNome();
		}
	}

}

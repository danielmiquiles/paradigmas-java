package avaliacao;

public class Funcionario {
	
	private String nome;
	private double salario;
	private double salarioBruto;
	private double imposto;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public static double media(double salario1, double salario2) {
		return (salario1 + salario2)/2;
	}
	
	public double salarioLiquido() {
		return this.salarioBruto - this.imposto;
	}
	
	public void aumentarSalario(double percent) {
		this.salarioBruto = (this.salarioBruto *(1 + percent/100));
	}

	
}

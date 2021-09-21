package avaliacao;

public class Retangulo {
	
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double largura;
	private double altura;
	
	public double area() {
		return this.altura * this.largura;
	}
	
	public double perimetro() {
		return (this.altura + this.largura)*2;
	}
	
	public double diagonal() {
		
		double x = Math.pow(this.altura,2)+Math.pow(this.largura,2);
		Math.sqrt(x);
		
		
		return Math.sqrt(x);
	}

}

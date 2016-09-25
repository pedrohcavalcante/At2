package q1;

public class Retangulo extends Figura{
	private double area;
	private double altura;
	private double base;
	
	public Retangulo(double base, double altura) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}

	@Override
	double calcularArea() {
		area = base*altura;
		return area;
	}

}

package q1;

public class Quadrado extends Figura{
	private double area;
	private double lado;

	public Quadrado(double lado) {
		// TODO Auto-generated constructor stub
		this.lado = lado;
	}
	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		area = lado*lado;
		return area;
	}
	
	
	
}

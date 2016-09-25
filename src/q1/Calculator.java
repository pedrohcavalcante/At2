package q1;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado q1 = new Quadrado(3.0);
		Quadrado q2 = new Quadrado(10.0);
		Retangulo r1 = new Retangulo(2.0, 7.0);
		Retangulo r2 = new Retangulo(5.0, 3.0);
		FiguraComplexa fc1 = new FiguraComplexa();
		
		System.out.println(">>> 햞ea Quadrado1: " + q1.calcularArea());
		System.out.println(">>> 햞ea Quadrado2: " + q2.calcularArea());
		System.out.println(">>> 햞ea Retangulo1: " + r1.calcularArea());
		System.out.println(">>> 햞ea Retangulo2: " + r2.calcularArea());
		
		fc1.inserir(q1);
		fc1.inserir(q2);
		fc1.inserir(r1);
		fc1.inserir(r2);
		
		System.out.println(">>> 햞ea da figura complexa: " + fc1.calcularArea());
		
		

	}

}

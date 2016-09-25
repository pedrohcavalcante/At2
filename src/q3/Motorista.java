package q3;

public class Motorista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovel a1 = new Automovel();
		a1.ligar();
		System.out.println(a1.isLigado());
		
		Motocicleta m1 = new Motocicleta();
		m1.ligar();
		System.out.println(m1.isLigado());
		
		Onibus o1 = new Onibus();
		o1.ligar();
		System.out.println(o1.isLigado());
		
	}

}

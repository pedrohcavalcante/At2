package q3;

public class Automovel extends Veiculo{
	
	@Override
	public void desligar(){
		System.out.println("Autom�vel desligado");
		ligado = false;
	}
	
	@Override
	public void ligar(){
		System.out.println("Autom�vel ligado");
		ligado = true;
	}
}

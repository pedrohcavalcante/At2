package q3;

public class Automovel extends Veiculo{
	
	@Override
	public void desligar(){
		System.out.println("Automóvel desligado");
		ligado = false;
	}
	
	@Override
	public void ligar(){
		System.out.println("Automóvel ligado");
		ligado = true;
	}
}

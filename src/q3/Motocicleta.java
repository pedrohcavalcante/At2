package q3;

public class Motocicleta extends Veiculo{
	
	@Override
	public void desligar(){
		System.out.println("Motocicleta desligada");
		this.ligado = false;
	}
	
	@Override
	public void ligar(){
		System.out.println("Motocicleta ligada");
		this.ligado = true;
	}
}

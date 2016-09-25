package q3;

public class Onibus extends Veiculo{
	
	@Override 
	public void desligar(){
		System.out.println("Ônibus desligado");
		this.ligado = false;
	}
	
	@Override 
	public void ligar(){
		System.out.println("Ônibus ligado");
		this.ligado = true;
	}
}

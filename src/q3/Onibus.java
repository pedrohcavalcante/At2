package q3;

public class Onibus extends Veiculo{
	
	@Override 
	public void desligar(){
		System.out.println("�nibus desligado");
		this.ligado = false;
	}
	
	@Override 
	public void ligar(){
		System.out.println("�nibus ligado");
		this.ligado = true;
	}
}

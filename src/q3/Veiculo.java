package q3;

public class Veiculo {
	protected boolean ligado;

	public boolean isLigado() {
		return ligado;
	}

	public void desligar(){
		this.ligado = false;
	}
	
	public void ligar(){
		this.ligado = true;
	}
	
}

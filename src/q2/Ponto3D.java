package q2;

public class Ponto3D extends Ponto2D{
	private double z = 0.0;
	
	public Ponto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public String toString(){
		return super.toString() + ", " + z;
	}
	
	
}


package q1;

import java.util.ArrayList;

public class FiguraComplexa extends Figura{
	
	ArrayList<Figura> vetFigura;
	
	public FiguraComplexa(){
		vetFigura = new ArrayList<Figura>();
	}
	
	public void inserir(Figura figura){
		vetFigura.add(figura);
	}
	
	@Override
	double calcularArea() {
		double area = 0;
		for (Figura figura : vetFigura){
			area += figura.calcularArea();
		}
		return area;
	}
	
}

public class Rombo implements FigurasGeometricas {

	private String name;
	private double diagonalMayor;
	private double diagonalMenor;
	private double lado;
	
	public Rombo(String name, double diagonalMayor, double diagonalMenor, double lado) {
		this.name = name;
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
		this.lado = lado;
	}//Constructor
	
	public double calcularArea() {
		return (getdiagonalMayor() * getdiagonalMenor())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado() * 4);
	}// calcularPerimetro
		
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	public double getdiagonalMayor() {
		return diagonalMayor;
	}//getdiagonalMayor
	public void setdiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}//setdiagonalMayor
	public double getdiagonalMenor() {
		return diagonalMenor;
	}//getdiagonalMenor
	public void setdiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}//setdiagonalMenor
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	@Override
	public String toString() {
		return "Rombo [name=" + name + ", diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor
				+ ", lado=" + lado + "]";
	} //toString
	
} // class Rombo

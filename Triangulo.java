public class Triangulo implements FigurasGeometricas {
	private String name;
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(String name, double base, double altura, double lado1, double lado2, double lado3) {
		this.name = name;
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}//Constructor
	
	public double calcularArea() {
		return (getBase() * getAltura())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado1() + getLado2() + getLado3());
	}// calcularPerimetro
		
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	public double getBase() {
		return base;
	}//getBase
	public void setBase(double base) {
		this.base = base;
	}//setBase
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	public double getLado1() {
		return lado1;
	}//getLado
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}//setLado
	
	public double getLado2() {
		return lado2;
	}//getLado
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}//setLado
	
	public double getLado3() {
		return lado3;
	}//getLado
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}//setLado

	@Override
	public String toString() {
		return "Triangulo [name=" + name + ", base=" + base + ", altura=" + altura + ", lado1=" + lado1 + ", lado2="
				+ lado2 + ", lado3=" + lado3 + "]";
	} // toString
	
}//class Triangulo

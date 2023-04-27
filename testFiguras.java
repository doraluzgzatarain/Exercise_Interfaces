public class testFiguras {
	public static void main(String[] args) {
		Triangulo triangulo1 = new  Triangulo("Triángulo 1", 20.0, 10.0, 15.0, 15.0, 15.0);
		Cuadrado cuadrado1 = new Cuadrado ("Cuadrado 1", 30.5);
		Rectangulo rectangulo1 = new Rectangulo ("Rectángulo 1", 20.5, 12.5);
		Rombo rombo1 = new Rombo ("Rombo 1", 40.5, 30.3, 28.9);
		Romboide romboide1 = new Romboide ("Romboide 1", 5.3, 6.7);
		Trapecio trapecio1 = new Trapecio ("Trapecio 1", 54.5, 38.9, 60.7, 38.9, 60.7, 54.5, 40.5);
		
		imprimirCalculo(triangulo1); 
		imprimirCalculo(cuadrado1);
		imprimirCalculo(rectangulo1);
		imprimirCalculo(rombo1);
		imprimirCalculo(romboide1);
		imprimirCalculo(trapecio1);
		
	}//main

	public static void imprimirCalculo(FigurasGeometricas f) {
		System.out.println(f);
		System.out.println("+======================================================================================================================");
		System.out.println("|El área de ["+f.getName()+"] es: " + String.format("%.2f", f.calcularArea()) + 
				"\n" + "|El perímetro de ["+f.getName()+"] es: " + String.format("%.2f",f.calcularPerimetro()));
		System.out.println("+======================================================================================================================");
	}//imprimirCalculo
}//class testFiguras
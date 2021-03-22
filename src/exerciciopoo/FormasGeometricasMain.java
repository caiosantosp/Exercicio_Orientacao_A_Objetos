package exerciciopoo;

public class FormasGeometricasMain {

  public static void main(String[] args) {
    // Cria um Quadrado
    Quadrado quadrado = new Quadrado("Quadrado", 6);
    quadrado.mostrarDados();

    // Cria um Triangulo
    Triangulo triangulo = new Triangulo("Triangulo", 4, 4, 6, 6);
    triangulo.mostrarDados();

    // Cria um Retangulo
    Retangulo retangulo = new Retangulo("Retangulo", 40, 70);
    retangulo.mostrarDados();

    // Cria um Circulo
    Circulo circulo = new Circulo("Circulo", 6);
    circulo.mostrarDados();

    // Cria um Losango
    Losango losango = new Losango("Losango",4,2,6);
    losango.mostrarDados();

    // Cria um Trapezio
    Trapezio trapezio = new Trapezio("Trapezio",5,10,3,3,7);
    trapezio.mostrarDados();
  }
}

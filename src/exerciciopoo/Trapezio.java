package exerciciopoo;

public class Trapezio extends Forma {

  public Trapezio(String nome, double baseMenor, double baseMaior, double lado1, double lado2, double altura) {
    this.nome = nome;
    this.baseMenor = baseMenor;
    this.baseMaior = baseMaior;
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.altura = altura;
    this.area = calcularArea();
    this.perimetro = calcularPerimetro();
  }

  @Override
  public double calcularArea() {
    this.area = (((baseMaior + baseMenor) * altura) / 2);
    return this.area;
  }

  @Override
  public double calcularPerimetro() {
    this.perimetro = (baseMaior + baseMenor + lado1 + lado2);
    return this.perimetro;
  }

  @Override
  public void mostrarDados() {
    System.out.println("------------------"
            + "\nNOME: " + this.nome
            + "\nLADO: " + this.lado1
            + "\nBASE MAIOR: " + this.baseMaior
            + "\nBASE MENOR: " + this.baseMenor
            + "\nLADO 1: " + this.lado1
            + "\nLADO 2: " + this.lado2
            + "\nALTURA: " + this.altura
            + "\nAREA: " + this.area
            + "\nPERIMETRO: " + this.perimetro
            + "\n------------------");

  }
}

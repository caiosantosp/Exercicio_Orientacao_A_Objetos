package exerciciopoo;

public class Triangulo extends Forma {

  public Triangulo(String nome, double altura, double base, double ladoA, double ladoC) {
    this.nome = nome;
    this.altura = altura;
    this.ladoA = ladoA;
    this.ladoC = ladoC;
    this.base = base;
    this.area = calcularArea();
    this.perimetro = calcularPerimetro();
  }

  @Override
  public double calcularArea() {
    this.area = Math.round((this.base * this.altura) / 2);
    return this.area;
  }

  @Override
  public double calcularPerimetro() {
    this.perimetro = Math.round(this.ladoA + this.base + this.ladoC);
    return this.perimetro;
  }

  @Override
  public void mostrarDados() {
    System.out.println("------------------"
            + "\nNOME: " + this.nome
            + "\nLADO A: " + this.ladoA
            + "\nBASE: " + this.base
            + "\nLADO C: " + this.ladoC
            + "\nAREA: " + this.area
            + "\nPERIMETRO: " + this.perimetro
            + "\n------------------");

  }
}

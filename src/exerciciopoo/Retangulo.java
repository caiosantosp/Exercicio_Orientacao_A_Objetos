package exerciciopoo;


public class Retangulo extends Forma {

  public Retangulo(String nome, double altura, double base) {
    super();
    this.base = base;
    this.nome = nome;
    this.altura = altura;
    this.area = calcularArea();
    this.perimetro = calcularPerimetro();
  }

  @Override
  public double calcularArea() {
    this.area = Math.round(this.base * this.altura);
    return this.area;
  }

  @Override
  public double calcularPerimetro() {
    this.perimetro = Math.round(2 * (this.base + this.altura));
    return this.perimetro;
  }

  @Override
  public void mostrarDados() {
    System.out.println("------------------"
            + "\nNOME: " + this.nome
            + "\nBASE: " + this.base
            + "\nALTURA: " + this.altura
            + "\nAREA: " + this.area
            + "\nPERIMETRO: " + this.perimetro
            + "\n-------------------");
  }
}

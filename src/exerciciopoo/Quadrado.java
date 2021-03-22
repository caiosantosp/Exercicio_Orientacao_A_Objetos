package exerciciopoo;

public class Quadrado extends Forma {
  public Quadrado(String nome, double lado) {
    this.nome = nome;
    this.lado1 = lado;
    this.perimetro = calcularPerimetro();
    this.area = calcularArea();

  }

  @Override
  public void mostrarDados() {
    System.out.println("------------------"
            + "\nNOME: " + this.nome
            + "\nLADO: " + this.lado1
            + "\nAREA: " + this.area
            + "\nPERIMETRO: " + this.perimetro
            + "\n------------------");
  }

  @Override
  public double calcularArea() {
    this.area = Math.round(this.lado1 * 2);
    return this.area;
  }

  @Override
  public double calcularPerimetro() {
    this.perimetro = Math.round(this.lado1 * 4);
    return (this.perimetro);

  }}

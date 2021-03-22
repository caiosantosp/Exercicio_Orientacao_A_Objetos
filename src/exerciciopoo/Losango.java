package exerciciopoo;

public class Losango extends Forma {

  public Losango(String nome, double diagonalMenor, double diagonalMaior, double lado) {

    this.diagonalMaior = diagonalMaior;
    this.diagonalMenor = diagonalMenor;
    this.nome = nome;
    this.lado1 = lado;
    this.area = calcularArea();
    this.perimetro = calcularPerimetro();

  }

  @Override
  public double calcularArea() {
    this.area = Math.round((diagonalMaior * diagonalMenor) / 2);
    return this.area;
  }

  @Override
  public double calcularPerimetro() {
    this.perimetro = (lado1 * 4);
    return this.perimetro;
  }

  @Override
  public void mostrarDados() {
    System.out.println("------------------"
            + "\nNOME: " + this.nome
            + "\nLADO: " + this.lado1
            + "\nD.MAIOR: " + this.diagonalMenor
            + "\nD.MENOR: " + this.diagonalMenor
            + "\nAREA: " + this.area
            + "\nPERIMETRO: " + this.perimetro
            + "\n------------------");
  }
}

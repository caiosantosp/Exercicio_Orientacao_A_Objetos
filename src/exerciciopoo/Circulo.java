package exerciciopoo;

public class Circulo extends Forma {

  public Circulo(String nome, double raio) {
    this.nome = nome;
    this.raio = raio;
    this.area = calcularArea();
    this.perimetro = calcularPerimetro();

  }

  @Override
  public double calcularArea() {
    this.area = Math.round(Math.PI * Math.pow(this.raio, 2));
    return this.area;
  }

  @Override
  public double calcularPerimetro() {
    this.perimetro = Math.round(2 * Math.PI * this.raio);
    return perimetro;
  }

  @Override
  public void mostrarDados() {
    System.out.println("------------------"
            + "\nNOME: " + this.nome
            + "\nRAIO: " + this.raio
            + "\nDIAMETRO: " + (2 * this.raio)
            + "\nAREA: " + this.area
            + "\nPERIMETRO: " + this.perimetro
            + "\n------------------");
  }
}

package exerciciopoo;

public abstract class Forma implements FormaGeo {
  protected String nome;
  protected double largura;
  protected double altura;
  protected double raio;
  protected double perimetro;
  protected double area;
  protected double base;
  protected double baseMaior;
  protected double ladoC;
  protected double lado1;
  protected double lado2;
  protected double baseMenor;
  protected double ladoA;
  protected double diagonalMaior;
  protected double diagonalMenor;

  public double getLado1() {
    return lado1;
  }

  public void setLado1(double lado1) {
    this.lado1 = lado1;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public double getBaseMaior() {
    return baseMaior;
  }

  public void setBaseMaior(double baseMaior) {
    this.baseMaior = baseMaior;
  }

  public double getBaseMenor() {
    return baseMenor;
  }

  public void setBaseMenor(double baseMenor) {
    this.baseMenor = baseMenor;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getLargura() {
    return largura;
  }

  public void setLargura(double largura) {
    this.largura = largura;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

}

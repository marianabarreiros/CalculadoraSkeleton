package com.orientacaoaobjetos;

public class Carro {

  private String cor;
  private String marca;
  private int numeroDePortas;
  private Boolean eBlindado;

  public String getCor() {
    return cor;
  }

  public String getMarca() {
    return marca;
  }

  public int getNumeroDePortas() {
    return numeroDePortas;
  }

  public Boolean geteBlindado() {
    return eBlindado;
  }


  public Carro(String cor, String marca, int numeroDePortas, Boolean eBlindado) {
    this.cor = cor;
    this.marca = marca;
    this.numeroDePortas = numeroDePortas;
    this.eBlindado = eBlindado;
  }

  public void acelerar(){
    System.out.println("Ferrari acelerando");
  }

  public void frear(){
    System.out.println("Ferrari freando");
  }
}

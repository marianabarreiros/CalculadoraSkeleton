package com.orientacaoaobjetos;

public class ImprimeFrases {

  String frase;

  public ImprimeFrases(){
    this.frase = "Olá Mundo!";
  }

  public ImprimeFrases(String frase) {
    this.frase = frase;
  }

  public void imprimeFraseNoConsole(){
    System.out.println(frase);
  }
}

package com.estruturasdecontrole;

public class MultiploDe3ComArray {

  public static void main(String[] args){

    int[] conjuntoDeNumeros = new int[5];

    conjuntoDeNumeros[0] = 12;
    conjuntoDeNumeros[1] = 21;
    conjuntoDeNumeros[2] = 30;
    conjuntoDeNumeros[3] = 71;
    conjuntoDeNumeros[4] = 40;

    for(int i = 0; i<conjuntoDeNumeros.length; i++){
      if(conjuntoDeNumeros[i] % 3 == 0){
        System.out.println(conjuntoDeNumeros[i]);
      }
    }
  }
}

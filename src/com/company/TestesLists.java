package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import javax.sound.midi.Soundbank;

public class TestesLists {

////  primeiro exemplo sem array
//  public static void main(String[] args) {
//
//    String nome1 = "Mariana";
//    String nome2  = "Manuela";
//
//    System.out.println("As mulheres presentes na sala são:");
//    System.out.println(nome1);
//    System.out.println(nome2);
//  }

//  segundo exemplo com array

//  public static void main(String[] args) {
//
//    String[] nome = new String[5];
//
//    nome[0] = "Brenda";
//    nome[1] = "Júlia";
//
//    System.out.println("O tamanho do array é: " + nome.length);
//    System.out.println("O nome na primeira posição é: " + nome[0]);
//    System.out.println("O nome na segunda posição é: " + nome[1]);
//  }

  // Terceiro exemplo : Adicionando múltiplos de 3 em um array de 5 posições

//  public static void main(String[] args) {
//
//    int[] numeros = new int[5];
//
//    for (int i = 0; i <= numeros.length + 1; i++) {
//      if (i % 2 == 0) {
//        numeros[i] = i;
//        System.out.println(numeros[i]);
//      }
//    }
//  }

//  quarto exemplo com Array: Adcionando múltiplos de 3 em um array de 5 posições

//    public static void main(String[] args) {
//
//      int[] numeros = new int[5];
//      int contador = 0;
//
//      for (int i = 1; i <= numeros.length; i++) {
//        if (i % 3 == 0) {
//          numeros[contador] = i;
//          System.out.println("Adicionei " + i + " na lista.");
//          contador++;
//        }
//      }
//      for(int i = 0; i < numeros.length ; i++){
//        System.out.println(numeros[i]);
//      }
//    }

  //  quinto exemplo com ArrayList: Adcionando múltiplos de 3 em um arrayList

//    public static void main(String[] args) {
//
//      ArrayList numeros = new ArrayList<>();
//
//      for (int i = 0; i < 100; i++) {
//        if (i % 3 == 0) {
//          numeros.add(i);
//          System.out.println("Adicionei " + i + " na lista.");
//        }
//      }
//
//      for(int i = 0; i <numeros.size(); i++) {
//        System.out.println(numeros.get(i));
//      }
//    }

  //  sexto exemplo com ArrayList: Adcionando múltiplos de 3 em um arrayList para percorrer os números adicionados e imprimir apenas os pares

//  public static void main(String[] args) {
//
//    ArrayList numeros = new ArrayList();
//    ArrayList numerosPares = new ArrayList();
//
//    for (int i = 0; i < 100; i++) {
//      if (i % 3 == 0) {
//        numeros.add(i);
//        System.out.println("Adicionei " + i + " na lista.");
//      }
//    }
//    System.out.println(numeros);
//
//    for(int i = 0; i<numeros.size(); i++){
//      if((int)numeros.get(i) % 2 == 0){
//        numerosPares.add(numeros.get(i));
//      }
//    }
//    System.out.println(numerosPares);
//  }


  //  sétimo exemplo com ArrayList: adicionando múltimos de 5 e retirando os ímpares


//    public static void main(String[] args) {
//
//    ArrayList numeros = new ArrayList();
//
//    for (int i = 0; i < 100; i++) {
//      if (i % 5 == 0) {
//        numeros.add(i);
//        System.out.println("Adicionei " + i + " na lista.");
//      }
//    }
//    System.out.println(numeros);
//
//    for(int i = 0; i<numeros.size(); i++){
//      if((int)numeros.get(i) % 2 != 0){
//        numeros.remove(numeros.get(i));
//      }
//    }
//      System.out.println(numeros);
//
//      if (numeros.contains(31))
//        System.out.println("Esse conjunto contém o número 31");
//      System.out.println("Esse conjunto não contém o numero 31");
//  }
}

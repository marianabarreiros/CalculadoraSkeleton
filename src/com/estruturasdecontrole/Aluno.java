//package com.company;
//
//import java.util.Scanner;
//
//public class Aluno {
//
////  public static void main(String[] args){
////    //OBSERVAÇÕES
//// Para inserir a entrada precisa digitar o numero com virgula exemplo: 9,2 8,1 7.3
//// A saida aparece em formatos diferente porque usei para testar o println, printf e o format
//
//
//    Scanner input = new Scanner(System.in);
//
//
//    //entrada
//    System.out.println("Informe a nota 1: ");
//    double nota1 = input.nextDouble();
//
//    System.out.println("Informe a nota 2: ");
//    double nota2 = input.nextDouble();
//
//    System.out.println("Informe a nota 3: ");
//    double nota3 = input.nextDouble();
//
//    System.out.println("Informe o numero de faltas: ");
//    int faltas = input.nextInt(); // recebe falta
//
//    //processamento
//    double media = (nota1+nota2+nota3)/ 3.0;
//    double faltas_p = 68 * 0.25; //calcula o percentual de faltas
//
//    //Saida
//    if (media >= 7.0 ){
//      if (faltas >= faltas_p){ //compara a falta com o percentual
//        System.out.println("Reprovado por falta" + media); //mostra mais de usa casa depois do ponto
//      }else{
//        System.out.printf("Aprovado %.1f" , media); //mostra com virgula
//      }
//    }else{
//      System.out.format("Reprovado por nota %.1f" , media); //mostra com virgula
//    }
//  }
//}

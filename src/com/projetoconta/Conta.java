package com.projetoconta;

public class Conta {

  private Cliente cliente;
  private long numeroDaConta;
  private double saldo;

  public Cliente getCliente() {
    return cliente;
  }

  public long getNumeroDaConta() {
    return numeroDaConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public Conta(Cliente cliente, long numeroDaConta) {

    this.cliente = cliente;
    this.numeroDaConta = numeroDaConta;
    this.saldo = 0.0;
  }

  public void sacar(double valor) {
    if (valor <= this.saldo) {
      this.saldo = this.saldo - valor;
    } else {
      System.out.println("Limite indisponível para saque");
    }
  }

  public void depositar(double valor) {
    this.saldo = this.saldo + valor;
  }

  public void pix(double valor, Conta contaDeDestino){
    if (valor <= this.saldo) {
      this.saldo = this.saldo - valor;
      contaDeDestino.depositar(valor);
    } else {
      System.out.println("Limite indisponível para transferência");
    }
  }
}

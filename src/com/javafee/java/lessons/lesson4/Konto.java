package com.javafee.java.lessons.lesson4;

public class Konto {
  private String numerKonta;
  private double stanKonta;
  Konto(double stanKonta){
      this.stanKonta = stanKonta;
  }
  public void wplac(double kwota){
      if(kwota>0)
          stanKonta = (stanKonta + kwota) - 4;
      else{
          System.out.println("Nie mozesz wplacic ujemnej kwoty !!");
      }
  }
  public void wyplac(double kwota){
      if((stanKonta - kwota) >= 0)
          stanKonta = (stanKonta - kwota) - 4;
      else{
          System.out.println("Nie masz tyle środków na koncie !!");
      }
  }
  public double stanKonta(){
      return stanKonta;
  }
  public void saldo(){
      System.out.print("Stan konta wynosi:" + stanKonta());
  }

    public int getNumerKonta() {
        return 0;
    }
}

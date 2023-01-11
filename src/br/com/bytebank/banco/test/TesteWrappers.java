package br.com.bytebank.banco.test;

public class TesteWrappers {
  public static void main(String[] args) {

    Integer idadeRef = Integer.valueOf(29);//criação do objeto, autoboxing
    System.out.println(idadeRef.doubleValue()); //unboxing


    Double dRef = Double.valueOf(3.2);  //autoboxing
    System.out.println(dRef.doubleValue()); //unboxing

    Boolean bRef = Boolean.TRUE;
    System.out.println(bRef.booleanValue());

    Number refNumero = Integer.valueOf(29);

  }

}

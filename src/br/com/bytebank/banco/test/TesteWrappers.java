package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
  public static void main(String[] args) {

    Integer idadeRef = Integer.valueOf(29);//criação do objeto, autoboxing
    System.out.println(idadeRef.doubleValue()); //unboxing


    Double dRef = Double.valueOf(3.2);  //autoboxing
    System.out.println(dRef.doubleValue()); //unboxing

    Boolean bRef = Boolean.TRUE;
    System.out.println(bRef.booleanValue());

    //Number refNumero = Integer.valueOf(29);

    Number refNumero = Float.valueOf(29.0f);


    List<Number> lista = new ArrayList<>(); //number engloba todos java.lang.*      
            lista.add(10);
            lista.add(32.6);
            lista.add(25.6f);

  }

}

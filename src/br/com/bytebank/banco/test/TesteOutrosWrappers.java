package br.com.bytebank.banco.test;




import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
  public static void main(String[]args){

    int[] idades = new int[5];

    String[] nomes = new String[5];

    int idade = 29; //Integer

    Integer idadeRef = Integer.valueOf(29);//criação do objeto, autoboxing
    System.out.println(idadeRef.doubleValue());

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.SIZE);//ver o tamanho que ocupa em bytes
    System.out.println(Integer.BYTES); //ver quantos bytes



    int valor = idadeRef.intValue();//pedindo o primitivo, unboxing

    String s = args[0];//"12"

    //Integer numero = Integer.valueOf(s);

    int numero = Integer.parseInt(s); //ao invés de transformar em wrapper primeiro, vai direto para primitivo
    System.out.println(numero);

    List<Integer> numeros = new ArrayList<>();
    numeros.add(29);//autoboxing

  }


}
